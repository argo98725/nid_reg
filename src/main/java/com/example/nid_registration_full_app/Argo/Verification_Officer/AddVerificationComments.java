package com.example.nid_registration_full_app.Argo.Verification_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class AddVerificationComments {
    private String Name;
    private int PhoneNumber, Id;
    private LocalDate Date;
    @javafx.fxml.FXML
    private TextField phoneNumberTf;
    @javafx.fxml.FXML
    private TextArea VerificationCommentTF;
    @javafx.fxml.FXML
    private TextField numTF;
    @javafx.fxml.FXML
    private TextField idTF;
    @javafx.fxml.FXML
    private DatePicker Datepicker;

    public AddVerificationComments(String name, int phoneNumber, int id, LocalDate date) {
        Name = name;
        PhoneNumber = phoneNumber;
        Id = id;
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "AddVerificationComments{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", Id=" + Id +
                ", Date=" + Date +
                '}';
    }

    @javafx.fxml.FXML
    public void addCommentOnAction(ActionEvent actionEvent) {
    }
}
