package co.edu.uniquindio.unibanco.controllers;

import java.io.IOException;

import co.edu.uniquindio.unibanco.aplicacion.App;
import javafx.fxml.FXML;

public class InicioController {

    
    @FXML public void onTransaccionesClick() throws IOException{
    	App.setRoot("PrincipalFX");
    }
}