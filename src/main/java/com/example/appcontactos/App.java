package com.example.appcontactos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Locale localizacion = new Locale("es", "ES");
        //ResourceBundle resourceBundle = ResourceBundle.getBundle("src/main/resources/i18n", localizacion);
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("AppView.fxml")); //, resourceBundle

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Ya no es tan mierda");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}