package com.example.appcontactos;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


// CONTROLADOR VISTA PRINCIPAL
public class AppController implements Initializable {

    private boolean desplegado;

    private TranslateTransition animation, animationBtn;

    @FXML
    private Button btnMenu;
    @FXML
    private VBox vBoxIzquierda;
    @FXML
    private StackPane ventana;
    @FXML
    private StackPane vistaAnidada;

    private AppAnidadaController appAnidadaController;


    public AppController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vBoxIzquierda.setTranslateX(-100);
        desplegado = false;
        vistaAnidada.setVisible(false);

    }

    private void desplegacion() {
        animation = new TranslateTransition(Duration.millis(300), vBoxIzquierda);
        animationBtn = new TranslateTransition(Duration.millis(300), btnMenu);

        if (!desplegado) {
            animation.setFromX(-vBoxIzquierda.getWidth());
            animation.setToX(0);
            animationBtn.setFromX(0);
            animationBtn.setToX(vBoxIzquierda.getWidth());
            desplegado = true;
        } else {
            animation.setFromX(0);
            animation.setToX(-vBoxIzquierda.getWidth());
            animationBtn.setFromX(vBoxIzquierda.getWidth());
            animationBtn.setToX(0);
            desplegado = false;
        }
        animation.play();
        animationBtn.play();
    }


    @FXML
    protected void despliegueTotal() {
        desplegacion();
    }


    @FXML
    private void vistaDetalle(){

        vistaAnidada.setVisible(true);

    }

    @FXML
    private void preferenciasMenu(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Opcional");
        alert.setContentText("Relax");
        alert.showAndWait();
    }

    @FXML
    private void salirApp(){
        System.exit(0);
    }


}

