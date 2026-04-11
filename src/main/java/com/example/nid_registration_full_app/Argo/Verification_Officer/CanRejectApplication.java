package com.example.nid_registration_full_app.Argo.Verification_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class CanRejectApplication {
    private String Name;
    private int PhoneNo, Id;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField idTF;

    public CanRejectApplication(String name, int phoneNo, int id) {
        Name = name;
        PhoneNo = phoneNo;
        Id = id;
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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "CanRejectApplication{" +
                "Name='" + Name + '\'' +
                ", PhoneNo=" + PhoneNo +
                ", Id=" + Id +
                '}';
    }

    @javafx.fxml.FXML
    public void viewButtonOnAction(ActionEvent actionEvent) {
    }
}
