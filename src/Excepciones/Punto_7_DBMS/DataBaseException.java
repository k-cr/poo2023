package Excepciones.Punto_7_DBMS;

public class DataBaseException extends Exception{
    int codigo;
    public DataBaseException(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String getMessage() {
        if(codigo == 1060) {
            return "Esta tabla ya existe";
        } else if (codigo == 404) {
            return "Esta tabla no existe en la base de datos";
        } else if (codigo == 500) {
            return "La base de datos no está abierta.";
        }
        return "Ha ocurrido un error";
    }
}
