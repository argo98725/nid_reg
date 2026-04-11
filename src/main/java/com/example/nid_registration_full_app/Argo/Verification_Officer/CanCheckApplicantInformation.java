package com.example.nid_registration_full_app.Argo.Verification_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CanCheckApplicantInformation {
    private String Name;
    private int Id, PhoneNo;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextArea InformationTA;
    @javafx.fxml.FXML
    private TextField PhoneNoTF;
    @javafx.fxml.FXML
    private TextField IdTF;

    public CanCheckApplicantInformation(String name, int id, int phoneNo) {
        Name = name;
        Id = id;
        PhoneNo = phoneNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "CanCheckApplicantInformation{" +
                "Name='" + Name + '\'' +
                ", Id=" + Id +
                ", PhoneNo=" + PhoneNo +
                '}';
    }

    @javafx.fxml.FXML
    public void ViewButtonOnAction(ActionEvent actionEvent) {
    }
}
