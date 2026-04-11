package com.example.nid_registration_full_app.Argo.Verification_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CanSearchApplications {
    private String ApplicantName, FatherName;
    private int PhoneNo, FatherNIDNo;
    @javafx.fxml.FXML
    private TextField FnameTf;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextArea viewinfoTA;
    @javafx.fxml.FXML
    private TextField ANameTF;
    @javafx.fxml.FXML
    private TextField FNidNoTF;

    public CanSearchApplications(String applicantName, String fatherName, int phoneNo, int fatherNIDNo) {
        ApplicantName = applicantName;
        FatherName = fatherName;
        PhoneNo = phoneNo;
        FatherNIDNo = fatherNIDNo;
    }

    public String getApplicantName() {
        return ApplicantName;
    }

    public void setApplicantName(String applicantName) {
        ApplicantName = applicantName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getFatherNIDNo() {
        return FatherNIDNo;
    }

    public void setFatherNIDNo(int fatherNIDNo) {
        FatherNIDNo = fatherNIDNo;
    }

    @Override
    public String toString() {
        return "CanSearchApplications{" +
                "ApplicantName='" + ApplicantName + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", PhoneNo=" + PhoneNo +
                ", FatherNIDNo=" + FatherNIDNo +
                '}';
    }

    @javafx.fxml.FXML
    public void loadButtonOnAction(ActionEvent actionEvent) {
    }
}
