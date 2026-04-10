package com.example.nid_registration_full_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class User8Goal4DashboardViewController
{
    @javafx.fxml.FXML
    private TextField customernidnumberTF;
    @javafx.fxml.FXML
    private TextField customeraddressTF;
    @javafx.fxml.FXML
    private Label erorlabel;
    @javafx.fxml.FXML
    private TextField customernameTF;
    @javafx.fxml.FXML
    private DatePicker customerdobDP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifypermanentaddressOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logout14(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginView.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void u8g4backbuttonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User8DashboardView.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Bank KYC Officer Dashboard");
        stage.show();
    }
}