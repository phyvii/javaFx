package com.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class StagesController {
    @FXML
    Label welcomeLabel;
    @FXML
    Button moveBack;


    @FXML
    protected void moveBack() throws Exception{
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));

        Stage stage = (Stage) moveBack.getScene().getWindow();
        stage.setScene(new Scene(loader.load(),400,300));
        stage.setTitle("moved back");
    }
}
