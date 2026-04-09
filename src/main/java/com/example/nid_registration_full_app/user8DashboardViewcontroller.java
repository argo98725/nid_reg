package com.example.nid_registration_full_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class user8DashboardViewcontroller
{
    @javafx.fxml.FXML
    private Label erorlabelTF2;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backbuttonOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("User7DashboardView.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("User7 Dashboard");
        stage.show();

    }

    @javafx.fxml.FXML
    public void nidstatusOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void nomineeverificationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOA2(ActionEvent actionEvent)  throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginView.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void addressverificationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void matchphotoOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loanOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fraudcheckOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void verifycustomerOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void mismatchOA(ActionEvent actionEvent) {
    }
}