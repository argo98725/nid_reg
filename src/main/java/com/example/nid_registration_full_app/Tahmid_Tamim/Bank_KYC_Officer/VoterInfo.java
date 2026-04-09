package com.example.nid_registration_full_app.Tahmid_Tamim.Bank_KYC_Officer;

public class VoterInfo {

    private final String name;
    private final String dateOfBirth;
    private final String address;
    private final String nationalIdNumber;

    public VoterInfo(String name, String dateOfBirth, String address, String nationalIdNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.nationalIdNumber = nationalIdNumber;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getNationalIdNumber() {
        return nationalIdNumber;
    }

    @Override
    public String toString() {
        return "VoterInfo{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", nationalIdNumber='" + nationalIdNumber + '\'' +
                '}';
    }
}
