package co.edu.uniquindio.unibanco.Exception;

public class ClienteNoExisteException extends Exception {
    public ClienteNoExisteException() {
        super("El cliente no existe");
    }
}
