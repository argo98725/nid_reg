package com.example.nid_registration_full_app.Argo.Verification_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class CanSendApplicationToProduction {
    private int Id, SerialNo;
    private String name;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField serialNoTF;
    @javafx.fxml.FXML
    private TextField IdTF;

    public CanSendApplicationToProduction(int id, int serialNo, String name) {
        Id = id;
        SerialNo = serialNo;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(int serialNo) {
        SerialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CanSendApplicationToProduction{" +
                "Id=" + Id +
                ", SerialNo=" + SerialNo +
                ", name='" + name + '\'' +
                '}';
    }

    @javafx.fxml.FXML
    public void sendButtonOnAction(ActionEvent actionEvent) {
    }
}
