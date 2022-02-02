module com.example.appcontactos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appcontactos to javafx.fxml;
    exports com.example.appcontactos;
}