package com.example.nid_registration_full_app.Tahmid_Tamim.Voter_List_Update_Officer;

public class    NidInfo {
    private final String name;
    private final String dateOfBirth;
    private final String address;
    private final String nationalIdNumber;

    public NidInfo(String name, String dateOfBirth, String address, String nationalIdNumber) {
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
        return "NidInfo{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", nationalIdNumber='" + nationalIdNumber + '\'' +
                '}';
    }
}
