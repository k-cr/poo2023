package Excepciones.Punto_7_DBMS;

public class DBMSException extends Exception{
    int codigo;
    public DBMSException(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String getMessage() {
        if (codigo == 1060) {
            return "Esta base de datos ya existe.";
        } else if (codigo == 404) {
            return "Esta base de datos no existe.";
        }
        return "Ha ocurrido un error.";
    }
}
