package com.example.appcontactos;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

    private boolean desplegado;

    private TranslateTransition animation, animationBtn;

    @FXML
    private Button btnMenu;
    @FXML
    private VBox vBoxIzquierda;
    @FXML
    private StackPane ventana;

    private AppAnidadaController appAnidadaController;

    public AppController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vBoxIzquierda.setTranslateX(-100);
        desplegado = false;
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
    protected void vista1() {
        ventana.setBackground(new Background(
                new BackgroundImage(
                        new Image("Vista1.jpg", ventana.getWidth(), ventana.getHeight(), false, true),
                        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                        BackgroundSize.DEFAULT)));
        desplegacion();
    }

    @FXML
    protected void vista2() {
        ventana.setBackground(new Background(
                new BackgroundImage(
                        new Image("Vista2.jpg", ventana.getWidth(), ventana.getHeight(), false, true),
                        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,
                        BackgroundSize.DEFAULT)));
        desplegacion();

    }
}

