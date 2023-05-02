package Excepciones.Punto_7_Hashtable;

public class TableException extends Exception{
    int codigo;

    public TableException(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getMessage() {
        if (this.codigo == 1) {
            return "No existe esta tabla en la base de datos.";
        } else {
            return "La tabla que quiere añadir ya existe.";
        }
    }
}
