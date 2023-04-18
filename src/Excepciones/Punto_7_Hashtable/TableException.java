package Excepciones.Punto_7_Hashtable;

public class TableException extends Exception{
    public TableException() {
        super("No existe esta tabla en la base de datos");
    }
}
