package Excepciones.Punto_7;

public class DBException extends Exception{
    public DBException() {
        super("La base de datos no está abierta");
    }
}
