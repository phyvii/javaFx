package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

public class LoginController {

    @FXML private FlowPane mainPane;
    @FXML private Text panelTitle;
    @FXML private TextField loginField;
    @FXML private PasswordField passwordField;
    @FXML private Button loginButton;
    @FXML private Label errorLabel;

    @FXML
    public void initialize() {
        System.out.println("LoginController załadowany!");
    }

    @FXML
    protected void handleLogin() {
        String login = loginField.getText();
        String password = passwordField.getText();

        if (login.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Wypełnij wszystkie pola!");
            return;
        }

        // tutaj logika logowania
        if (login.equals("admin") && password.equals("admin")) {
            errorLabel.setStyle("-fx-text-fill: #00ff88; -fx-font-size: 12px;");
            errorLabel.setText("Zalogowano pomyślnie!");
        } else {
            errorLabel.setText("Błędny login lub hasło!");
        }
    }
}