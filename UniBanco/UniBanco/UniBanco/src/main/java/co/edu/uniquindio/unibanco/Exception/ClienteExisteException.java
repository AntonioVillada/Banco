package co.edu.uniquindio.unibanco.Exception;

public class ClienteExisteException extends Exception{
    public ClienteExisteException() {
        super("La persona ya es cliente");
    }
}