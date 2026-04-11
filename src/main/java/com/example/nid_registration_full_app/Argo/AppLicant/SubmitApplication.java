package com.example.nid_registration_full_app.Argo.AppLicant;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class SubmitApplication {
    private String ApplicantName;
    private int MobileNumber;
    private LocalDate Date;
    @javafx.fxml.FXML
    private TextField MobileNoTF;
    @javafx.fxml.FXML
    private TextField applicantNameTF;
    @javafx.fxml.FXML
    private DatePicker DatepickerTF;

    public SubmitApplication(String applicantName, int mobileNumber, LocalDate date) {
        ApplicantName = applicantName;
        MobileNumber = mobileNumber;
        Date = date;
    }

    public String getApplicantName() {
        return ApplicantName;
    }

    public void setApplicantName(String applicantName) {
        ApplicantName = applicantName;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "SubmitApplication{" +
                "ApplicantName='" + ApplicantName + '\'' +
                ", MobileNumber=" + MobileNumber +
                ", Date=" + Date +
                '}';
    }

    @javafx.fxml.FXML
    public void SubmitOnAction(ActionEvent actionEvent) {
    }
}
