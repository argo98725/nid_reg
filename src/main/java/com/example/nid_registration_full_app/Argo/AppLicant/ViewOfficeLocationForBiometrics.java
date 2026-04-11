package com.example.nid_registration_full_app.Argo.AppLicant;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewOfficeLocationForBiometrics {
    private String ApplicantName;
    private int PhoneNo;
    @javafx.fxml.FXML
    private TextField applicantNameTF;
    @javafx.fxml.FXML
    private TextArea officeAddressTA;
    @javafx.fxml.FXML
    private TextField PhoneNoTF;

    public ViewOfficeLocationForBiometrics(String applicantName, int phoneNo) {
        ApplicantName = applicantName;
        PhoneNo = phoneNo;
    }

    public String getApplicantName() {
        return ApplicantName;
    }

    public void setApplicantName(String applicantName) {
        ApplicantName = applicantName;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "ViewOfficeLocationForBiometrics{" +
                "ApplicantName='" + ApplicantName + '\'' +
                ", PhoneNo=" + PhoneNo +
                '}';
    }

    @javafx.fxml.FXML
    public void seeBottonOnAction(ActionEvent actionEvent) {
    }
}
