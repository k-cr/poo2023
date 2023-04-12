package Excepciones.Punto_5;

public class NotConnectedException extends Exception{
    public NotConnectedException() {
        super("La impresora no está conectada.");
    }
}
