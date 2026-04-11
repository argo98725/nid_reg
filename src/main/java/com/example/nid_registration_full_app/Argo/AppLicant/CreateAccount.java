package com.example.nid_registration_full_app.Argo.AppLicant;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class CreateAccount {
    private String ApplicantName, Address;
    private int  MobileNo, BirthCertificateNo;
    private LocalDate DateOfBirth;
    @javafx.fxml.FXML
    private Label labelViewFxID;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextArea AddressTA;
    @javafx.fxml.FXML
    private DatePicker BirthPicker;
    @javafx.fxml.FXML
    private TextField birthNoTF;
    @javafx.fxml.FXML
    private TextField mobileTF;

    public CreateAccount(String applicantName, String address, int mobileNo, int birthCertificateNo, LocalDate dateOfBirth) {
        ApplicantName = applicantName;
        Address = address;
        MobileNo = mobileNo;
        BirthCertificateNo = birthCertificateNo;
        DateOfBirth = dateOfBirth;
    }

    public String getApplicantName() {
        return ApplicantName;
    }

    public void setApplicantName(String applicantName) {
        ApplicantName = applicantName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(int mobileNo) {
        MobileNo = mobileNo;
    }

    public int getBirthCertificateNo() {
        return BirthCertificateNo;
    }

    public void setBirthCertificateNo(int birthCertificateNo) {
        BirthCertificateNo = birthCertificateNo;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "CreateAccount{" +
                "ApplicantName='" + ApplicantName + '\'' +
                ", Address='" + Address + '\'' +
                ", MobileNo=" + MobileNo +
                ", BirthCertificateNo=" + BirthCertificateNo +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }

    @javafx.fxml.FXML
    public void CreateButtonOnAction(ActionEvent actionEvent) {
    }
}

