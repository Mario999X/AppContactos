module com.example.appcontactos {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.antdesignicons;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;

    opens com.example.appcontactos to javafx.fxml;
    exports com.example.appcontactos;
}