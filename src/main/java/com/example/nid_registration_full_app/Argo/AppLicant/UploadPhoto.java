package com.example.nid_registration_full_app.Argo.AppLicant;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class UploadPhoto {
    private String Name;
    private int PhoneNo, BirthCertificateNo;
    @javafx.fxml.FXML
    private TextField BirthCertificateNoTF;
    @javafx.fxml.FXML
    private TextField phoneNoTF;
    @javafx.fxml.FXML
    private TextField imageLinkTF;
    @javafx.fxml.FXML
    private TextField applicantNumTF;

    public UploadPhoto(String name, int phoneNo, int birthCertificateNo) {
        Name = name;
        PhoneNo = phoneNo;
        BirthCertificateNo = birthCertificateNo;
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

    public int getBirthCertificateNo() {
        return BirthCertificateNo;
    }

    public void setBirthCertificateNo(int birthCertificateNo) {
        BirthCertificateNo = birthCertificateNo;
    }

    @Override
    public String toString() {
        return "UploadPhoto{" +
                "Name='" + Name + '\'' +
                ", PhoneNo=" + PhoneNo +
                ", BirthCertificateNo=" + BirthCertificateNo +
                '}';
    }

    @javafx.fxml.FXML
    public void uploadButtonOnAction(ActionEvent actionEvent) {
    }
}
