package com.example.nid_registration_full_app.Argo.AppLicant;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class UpdatePersonalInformation {
    private String ApplicantName, FathersName, MothersName, BirthCertNo, Gender, Religion, Address, bloodGroup, occupation;
    private int MobileNo, FathersNIDNo, MothersNIDNo;
    private LocalDate DateOfBirth;
    @javafx.fxml.FXML
    private CheckBox commonCheckBox;
    @javafx.fxml.FXML
    private CheckBox femaleCheckBox;
    @javafx.fxml.FXML
    private TextField BirthNoTF;
    @javafx.fxml.FXML
    private CheckBox HinduCheckBox;
    @javafx.fxml.FXML
    private DatePicker BirthDateTF;
    @javafx.fxml.FXML
    private CheckBox maleCheckBox;
    @javafx.fxml.FXML
    private TextField MNumTF;
    @javafx.fxml.FXML
    private TextField F_NumTF;
    @javafx.fxml.FXML
    private TextField occupationTF;
    @javafx.fxml.FXML
    private CheckBox buddhismCheckBox;
    @javafx.fxml.FXML
    private CheckBox cristianCheckBox;
    @javafx.fxml.FXML
    private TextArea AddressTA;
    @javafx.fxml.FXML
    private ComboBox BloodGroupCB;
    @javafx.fxml.FXML
    private TextField FNIDTF;
    @javafx.fxml.FXML
    private TextField NumTF;
    @javafx.fxml.FXML
    private CheckBox muslimCheckBox;
    @javafx.fxml.FXML
    private TextField PhoneNoTF;
    @javafx.fxml.FXML
    private TextField MNIDTF;

    public UpdatePersonalInformation(String applicantName, String fathersName, String mothersName, String birthCertNo, String gender, String religion, String address, String bloodGroup, String occupation, int mobileNo, int fathersNIDNo, int mothersNIDNo, LocalDate dateOfBirth) {
        ApplicantName = applicantName;
        FathersName = fathersName;
        MothersName = mothersName;
        BirthCertNo = birthCertNo;
        Gender = gender;
        Religion = religion;
        Address = address;
        this.bloodGroup = bloodGroup;
        this.occupation = occupation;
        MobileNo = mobileNo;
        FathersNIDNo = fathersNIDNo;
        MothersNIDNo = mothersNIDNo;
        DateOfBirth = dateOfBirth;
    }

    public String getApplicantName() {
        return ApplicantName;
    }

    public void setApplicantName(String applicantName) {
        ApplicantName = applicantName;
    }

    public String getFathersName() {
        return FathersName;
    }

    public void setFathersName(String fathersName) {
        FathersName = fathersName;
    }

    public String getMothersName() {
        return MothersName;
    }

    public void setMothersName(String mothersName) {
        MothersName = mothersName;
    }

    public String getBirthCertNo() {
        return BirthCertNo;
    }

    public void setBirthCertNo(String birthCertNo) {
        BirthCertNo = birthCertNo;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String religion) {
        Religion = religion;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(int mobileNo) {
        MobileNo = mobileNo;
    }

    public int getFathersNIDNo() {
        return FathersNIDNo;
    }

    public void setFathersNIDNo(int fathersNIDNo) {
        FathersNIDNo = fathersNIDNo;
    }

    public int getMothersNIDNo() {
        return MothersNIDNo;
    }

    public void setMothersNIDNo(int mothersNIDNo) {
        MothersNIDNo = mothersNIDNo;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "UpdatePersonalInformation{" +
                "ApplicantName='" + ApplicantName + '\'' +
                ", FathersName='" + FathersName + '\'' +
                ", MothersName='" + MothersName + '\'' +
                ", BirthCertNo='" + BirthCertNo + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Religion='" + Religion + '\'' +
                ", Address='" + Address + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", occupation='" + occupation + '\'' +
                ", MobileNo=" + MobileNo +
                ", FathersNIDNo=" + FathersNIDNo +
                ", MothersNIDNo=" + MothersNIDNo +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }

    @javafx.fxml.FXML
    public void UpdateButtonOnAction(ActionEvent actionEvent) {
    }
}
