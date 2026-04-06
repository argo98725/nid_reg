module com.example.nid_registration_full_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nid_registration_full_app to javafx.fxml;
    exports com.example.nid_registration_full_app;
}