package co.edu.uniquindio.unibanco.controllers;

import java.io.IOException;

import co.edu.uniquindio.unibanco.aplicacion.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControladorPrincipal {
	
	@FXML private Label label;
	
	@FXML public void imprimir() {
		
		label.setText("hola mundo");
	}
	@FXML
    private void switchToDepocitar() throws IOException {
        App.setRoot("DepocitarFX");
    }
	@FXML
    private void switchToRetirar() throws IOException {
        App.setRoot("RetirarFX");
    }
	
	@FXML
    private void switchToConsultar() throws IOException {
        App.setRoot("ConsultarFX");
    }
	@FXML
    private void switchToAtras() throws IOException {
        App.setRoot("PrincipalFX");
    }

}
