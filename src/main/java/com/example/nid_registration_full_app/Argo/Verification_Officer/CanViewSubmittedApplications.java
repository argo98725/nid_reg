package com.example.nid_registration_full_app.Argo.Verification_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class CanViewSubmittedApplications {
    private String Name, FatherName;
    private int Id, FatherNIDNo, serialNo;
    @javafx.fxml.FXML
    private TextField FnameTF;
    @javafx.fxml.FXML
    private TextField serialNoTF;
    @javafx.fxml.FXML
    private TextField FNIDnoTF;
    @javafx.fxml.FXML
    private TextField numTF;
    @javafx.fxml.FXML
    private TextField idTF;

    public CanViewSubmittedApplications(String name, String fatherName, int id, int fatherNIDNo, int serialNo) {
        Name = name;
        FatherName = fatherName;
        Id = id;
        FatherNIDNo = fatherNIDNo;
        this.serialNo = serialNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getFatherNIDNo() {
        return FatherNIDNo;
    }

    public void setFatherNIDNo(int fatherNIDNo) {
        FatherNIDNo = fatherNIDNo;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return "CanViewSubmittedApplications{" +
                "Name='" + Name + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", Id=" + Id +
                ", FatherNIDNo=" + FatherNIDNo +
                ", serialNo=" + serialNo +
                '}';
    }

    @javafx.fxml.FXML
    public void showInformationButtonOnAction(ActionEvent actionEvent) {
    }
}
