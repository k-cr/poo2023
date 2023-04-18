package Excepciones.Punto_7_Hashtable;

public class DuplicatedTableException extends Exception{
    public DuplicatedTableException() {
        super("Esta tabla ya existe en la base de datos.");
    }
}
