package com.example.nid_registration_full_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginViewController
{
    @javafx.fxml.FXML
    private TextField passwordTF;
    @javafx.fxml.FXML
    private Label errorlabel;
    @javafx.fxml.FXML
    private TextField useridTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginButtonOA(ActionEvent actionEvent) throws IOException {
        String userid = useridTF.getText();
        String password = passwordTF.getText();

        if (userid.equals("7007") && password.equals("U7007")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("User7DashboardView.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Voter List Update Officer Dashboard");
            stage.show();
        }
        else if (userid.equals("6006") && password.equals("U6006")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AllView.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("AllView");
            stage.show();
        }

        else if (userid.equals("8008") && password.equals("U8008")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("User8DashboardView.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Bank KYC Officer Dashboard");
            stage.show();
        }

        else {
            errorlabel.setText("Invalid User ID or Password");
            useridTF.clear();
            passwordTF.clear();
        }

    }
}