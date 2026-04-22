package com.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Label welcomeLabel;
    @FXML
    private Button buttonScenes;
    @FXML
    private Button nextScene;

    @FXML
    protected void onButtonClick() {
        welcomeLabel.setText("Działa! 🎉");
    }
    @FXML
    protected void openScenesWindow() throws Exception{
        FXMLLoader loader = new FXMLLoader(
                MainApp.class.getResource("stages-view.fxml"));

        Stage stage = new Stage();
        stage.setTitle("Scenes");
        stage.setScene(new Scene(loader.load(),400,300));
        stage.show();
    }
    @FXML
    protected void changeScene() throws Exception{
        FXMLLoader loader = new FXMLLoader(
                MainApp.class.getResource("stages-view.fxml")
        );

        Stage stage = (Stage) nextScene.getScene().getWindow();
        stage.setScene(new Scene(loader.load(),400,300));
        stage.setTitle("zmienione");
    }

}