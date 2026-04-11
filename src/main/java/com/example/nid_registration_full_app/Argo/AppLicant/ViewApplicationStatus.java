package com.example.nid_registration_full_app.Argo.AppLicant;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewApplicationStatus {
    private String Name;
    private int PhoneNo;
    @javafx.fxml.FXML
    private TextField NumTF;
    @javafx.fxml.FXML
    private TextField PhoneNoTF;
    @javafx.fxml.FXML
    private TextArea ViewStatusTA;

    public ViewApplicationStatus(String name, int phoneNo) {
        Name = name;
        PhoneNo = phoneNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "ViewApplicationStatus{" +
                "Name='" + Name + '\'' +
                ", PhoneNo=" + PhoneNo +
                '}';
    }

    @javafx.fxml.FXML
    public void ViewApplicationOnActionButton(ActionEvent actionEvent) {
    }
}
