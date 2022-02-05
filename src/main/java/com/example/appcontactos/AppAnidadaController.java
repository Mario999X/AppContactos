package com.example.appcontactos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.File;


// CONTROLADOR VISTA ANIDADA
public class AppAnidadaController {

    @FXML
    private StackPane principalAnidada;
    @FXML
    private VBox vBoxFondo, vBoxCentral, vBoxInfo;
    @FXML
    private Button btnFlecha;
    @FXML
    private ImageView imagenContacto;
    @FXML
    private Label nombreContacto, correoContacto, nacimientoContacto;


    @FXML
    public void initialize(){
        nombreContacto.setText("Dora Herrera");
        correoContacto.setText("dora.herrera@example.com");
        nacimientoContacto.setText("6/3/1986");
        File file = new File("src/main/resources/LaAmigaDora.jpg");
        Image image = new Image(file.toURI().toString());
        imagenContacto.setImage(image);

    }

    @FXML
    private void añadirPersona(){
        // Lo de arriba pero... ya se vera<
    }

    @FXML
    private void volverPrincipal(){
        principalAnidada.setVisible(false);
    }
}
