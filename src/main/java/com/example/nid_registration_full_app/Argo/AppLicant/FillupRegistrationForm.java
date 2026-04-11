package com.example.nid_registration_full_app.Argo.AppLicant;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class FillupRegistrationForm {
    private String ApplicantName, FathersName, MothersName, Gender, Address, EducationLevel;
    private int FathersNIDNo, MothersNIDNo, MobileNo, BirthCertificateNo;
    private Boolean BloodGroup, Religion, Occupation;
    private LocalDate DateOfBirth;
    @javafx.fxml.FXML
    private ComboBox BloodGroupComboBox;
    @javafx.fxml.FXML
    private CheckBox maleCB;
    @javafx.fxml.FXML
    private TextField professionTF;
    @javafx.fxml.FXML
    private CheckBox christianCB;
    @javafx.fxml.FXML
    private TextField FatherNameTF;
    @javafx.fxml.FXML
    private DatePicker BirthDatePicker;
    @javafx.fxml.FXML
    private TextField F_nidTF;
    @javafx.fxml.FXML
    private TextField MotherNameTF;
    @javafx.fxml.FXML
    private CheckBox hinduCB;
    @javafx.fxml.FXML
    private TextField MobileNoTF;
    @javafx.fxml.FXML
    private TextField EduLevelTF;
    @javafx.fxml.FXML
    private CheckBox buddhismCD;
    @javafx.fxml.FXML
    private TextField M_nidTF;
    @javafx.fxml.FXML
    private TextArea AddressTA;
    @javafx.fxml.FXML
    private CheckBox commonCB;
    @javafx.fxml.FXML
    private CheckBox femaleCB;
    @javafx.fxml.FXML
    private TextField BirthCertificateTF;
    @javafx.fxml.FXML
    private CheckBox muslimCB;
    @javafx.fxml.FXML
    private TextField NameTF;

    public FillupRegistrationForm(String applicantName, String fathersName, String mothersName, String gender, String address, String educationLevel, int fathersNIDNo, int mothersNIDNo, int mobileNo, int birthCertificateNo, Boolean bloodGroup, Boolean religion, Boolean occupation, LocalDate dateOfBirth) {
        ApplicantName = applicantName;
        FathersName = fathersName;
        MothersName = mothersName;
        Gender = gender;
        Address = address;
        EducationLevel = educationLevel;
        FathersNIDNo = fathersNIDNo;
        MothersNIDNo = mothersNIDNo;
        MobileNo = mobileNo;
        BirthCertificateNo = birthCertificateNo;
        BloodGroup = bloodGroup;
        Religion = religion;
        Occupation = occupation;
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEducationLevel() {
        return EducationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        EducationLevel = educationLevel;
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

    public Boolean getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(Boolean bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public Boolean getReligion() {
        return Religion;
    }

    public void setReligion(Boolean religion) {
        Religion = religion;
    }

    public Boolean getOccupation() {
        return Occupation;
    }

    public void setOccupation(Boolean occupation) {
        Occupation = occupation;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "FillupRegistrationForm{" +
                "ApplicantName='" + ApplicantName + '\'' +
                ", FathersName='" + FathersName + '\'' +
                ", MothersName='" + MothersName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Address='" + Address + '\'' +
                ", EducationLevel='" + EducationLevel + '\'' +
                ", FathersNIDNo=" + FathersNIDNo +
                ", MothersNIDNo=" + MothersNIDNo +
                ", MobileNo=" + MobileNo +
                ", BirthCertificateNo=" + BirthCertificateNo +
                ", BloodGroup=" + BloodGroup +
                ", Religion=" + Religion +
                ", Occupation=" + Occupation +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }

    @javafx.fxml.FXML
    public void ApplyOnAction(ActionEvent actionEvent) {
    }
}