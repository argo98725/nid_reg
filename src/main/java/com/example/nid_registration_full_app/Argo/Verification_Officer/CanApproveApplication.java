package com.example.nid_registration_full_app.Argo.Verification_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CanApproveApplication {
    private String Name, Applicationstatus;
    private int Id, PhoneNo;
    @javafx.fxml.FXML
    private CheckBox rejectCB;
    @javafx.fxml.FXML
    private TextField phoneNoTF;
    @javafx.fxml.FXML
    private TextArea ShowTA;
    @javafx.fxml.FXML
    private CheckBox approveCB;
    @javafx.fxml.FXML
    private TextField numTF;
    @javafx.fxml.FXML
    private TextField IdTF;

    public CanApproveApplication(String name, String applicationstatus, int id, int phoneNo) {
        Name = name;
        Applicationstatus = applicationstatus;
        Id = id;
        PhoneNo = phoneNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getApplicationstatus() {
        return Applicationstatus;
    }

    public void setApplicationstatus(String applicationstatus) {
        Applicationstatus = applicationstatus;
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
        return "CanApproveApplication{" +
                "Name='" + Name + '\'' +
                ", Applicationstatus='" + Applicationstatus + '\'' +
                ", Id=" + Id +
                ", PhoneNo=" + PhoneNo +
                '}';
    }

    @javafx.fxml.FXML
    public void StatusButtonOnAction(ActionEvent actionEvent) {
    }
}
