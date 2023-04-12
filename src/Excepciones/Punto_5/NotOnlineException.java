package Excepciones.Punto_5;

public class NotOnlineException extends Exception{
    public NotOnlineException() {
        super("La impresora no está conectada a internet.");
    }
}
