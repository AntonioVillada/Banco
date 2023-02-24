package co.edu.uniquindio.unibanco.Exception;

public class ValorRequeridoException extends Exception {
    public ValorRequeridoException(String nombre) {
        super(String.format("El %s es requerido",nombre));
    }
}