package Excepciones.Punto_5;

public class OutOfInkException extends Exception {
    public OutOfInkException() {
        super("La impresora no tiene tinta.");
    }
}
