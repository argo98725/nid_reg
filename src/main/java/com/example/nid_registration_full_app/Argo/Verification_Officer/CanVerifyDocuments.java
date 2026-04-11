package com.example.nid_registration_full_app.Argo.Verification_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CanVerifyDocuments {
    private String Name, FatherName;
    private int SerialNo, FatherNIDNo;
    @javafx.fxml.FXML
    private TextField FnameTF;
    @javafx.fxml.FXML
    private TextArea viewTA;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField serialNoTF;
    @javafx.fxml.FXML
    private TextField FNIDNoTF;

    public CanVerifyDocuments(String name, String fatherName, int serialNo, int fatherNIDNo) {
        Name = name;
        FatherName = fatherName;
        SerialNo = serialNo;
        FatherNIDNo = fatherNIDNo;
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

    public int getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(int serialNo) {
        SerialNo = serialNo;
    }

    public int getFatherNIDNo() {
        return FatherNIDNo;
    }

    public void setFatherNIDNo(int fatherNIDNo) {
        FatherNIDNo = fatherNIDNo;
    }

    @Override
    public String toString() {
        return "CanVerifyDocuments{" +
                "Name='" + Name + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", SerialNo=" + SerialNo +
                ", FatherNIDNo=" + FatherNIDNo +
                '}';
    }

    @javafx.fxml.FXML
    public void verifyButtonOnAction(ActionEvent actionEvent) {
    }
}
