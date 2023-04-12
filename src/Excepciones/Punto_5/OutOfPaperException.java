package Excepciones.Punto_5;

public class OutOfPaperException extends Exception{
    public OutOfPaperException() {
        super("La impresora no tiene papel");
    }
}
