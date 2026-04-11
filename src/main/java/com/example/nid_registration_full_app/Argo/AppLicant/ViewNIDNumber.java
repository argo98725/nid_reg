package com.example.nid_registration_full_app.Argo.AppLicant;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ViewNIDNumber {
    private String ApplicantName,FatherName;
    private int PhoneNo, FatherNidNo;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField applicantNameTF;
    @javafx.fxml.FXML
    private TextField FatherNameTF;
    @javafx.fxml.FXML
    private TextField FatherNIDNoTF;
    @javafx.fxml.FXML
    private TextArea numberShowTA;

    public ViewNIDNumber(String applicantName, String fatherName, int phoneNo, int fatherNidNo) {
        ApplicantName = applicantName;
        FatherName = fatherName;
        PhoneNo = phoneNo;
        FatherNidNo = fatherNidNo;
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

    public int getFatherNidNo() {
        return FatherNidNo;
    }

    public void setFatherNidNo(int fatherNidNo) {
        FatherNidNo = fatherNidNo;
    }

    @Override
    public String toString() {
        return "ViewNIDNumber{" +
                "ApplicantName='" + ApplicantName + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", PhoneNo=" + PhoneNo +
                ", FatherNidNo=" + FatherNidNo +
                '}';
    }

    @javafx.fxml.FXML
    public void LoadButtonOnAction(ActionEvent actionEvent) {
    }
}
