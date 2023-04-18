package Excepciones.Punto_7_Hashtable;

public class DBException extends Exception{
    public DBException() {
        super("La base de datos no está abierta");
    }
}
