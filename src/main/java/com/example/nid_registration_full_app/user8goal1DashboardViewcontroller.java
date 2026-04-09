package com.example.nid_registration_full_app;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class user8goal1DashboardViewcontroller
{
    @javafx.fxml.FXML
    private TextField customernidnumberTF;
    @javafx.fxml.FXML
    private TextField customeraddressTF;
    @javafx.fxml.FXML
    private TextField customernameTF;
    @javafx.fxml.FXML
    private Label erorlabelTF4;
    @javafx.fxml.FXML
    private DatePicker customerdatepickerTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void u8g1backbuttonOA(ActionEvent actionEvent) throws java.io.IOException {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("User8DashboardView.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(loader.load());
        javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Customer Verification Officer Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void customerverifyOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOA4(ActionEvent actionEvent) throws java.io.IOException {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("loginView.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(loader.load());
        javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Dashboard");
        stage.show();
    }
}