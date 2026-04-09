package com.example.nid_registration_full_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class User7DashboardViewController {
    @javafx.fxml.FXML
    private Label erorlabelTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyvotersOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void votersageOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void duplicatevotersOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fixinfoOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginView.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Dashboard");
        stage.show();

    }

    @javafx.fxml.FXML
    public void addvotersOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generatevoterlistOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void matchphotoOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void transferareaOA(ActionEvent actionEvent) {
    }



}