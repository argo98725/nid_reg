package com.example.nid_registration_full_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class User7Goal4DashboardViewController
{
    @javafx.fxml.FXML
    private TextField voternidnumberTF;
    @javafx.fxml.FXML
    private Label erorlabelTF7;
    @javafx.fxml.FXML
    private TextField voteraddressTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void areatransferOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void logout7(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginView.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void u7g4backbuttonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User7DashboardView.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Voter List Update Officer Dashboard");
        stage.show();
    }
}