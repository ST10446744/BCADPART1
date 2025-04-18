package com.onlyglobal.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class WelcomeController {
    @FXML
    private Button signUpBtn;

    @FXML
    private Button loginBtn;

    @FXML
    public void initialize() {
        signUpBtn.setOnAction(e -> {
            System.out.println("Sign Up clicked - load signup.fxml");
        });

        loginBtn.setOnAction(e -> {
            System.out.println("Login clicked - load login.fxml");
        });
    }
}
