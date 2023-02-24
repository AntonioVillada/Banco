package co.edu.uniquindio.unibanco.controllers;

import co.edu.uniquindio.unibanco.model.Banco;

public enum AppController {
    INSTANCE;
    private final Banco banco;

    AppController() {
        banco = new Banco();
    }

    public Banco getBanco() {
        return banco;
    }
}
