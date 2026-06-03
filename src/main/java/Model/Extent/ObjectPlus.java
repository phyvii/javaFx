package Model.Extent;

import java.io.*;
import java.util.*;

public class ObjectPlus implements Serializable{
    private static Map<Class, List> extent = new HashMap<>();
    public static final String EXTENT_NAME = "extent.nie";

    public ObjectPlus(){
        addToExtent();
    }

    public static void saveExtent() throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(EXTENT_NAME))){
            oos.writeObject(extent);
        }
    }

    public static void loadExtent() throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(EXTENT_NAME))){
            extent = (Map<Class, List>) ois.readObject();
        }

    }

    public static <T> List<T> getExtentFromClass(Class<T> c){
        extent.computeIfAbsent(c, x -> new ArrayList());
        return Collections.unmodifiableList(extent.get(c));
    }

    public void addToExtent(){
        List list = extent.computeIfAbsent(this.getClass(), x-> new ArrayList<>());
        list.add(this);
    }
    public void removeFromExtent(){
        List list = extent.get(this.getClass());
        if(list != null){
            list.remove(this);
        }
    }

    public static void clearExtent(){
        extent.clear();
    }
}