package co.edu.uniquindio.unibanco.controllers;

import java.io.IOException;

import co.edu.uniquindio.unibanco.aplicacion.App;
import javafx.fxml.FXML;

public class DepocitarController {
	
	@FXML
    private void switchToAtras() throws IOException {
        App.setRoot("PrincipalFX");
    }

}
