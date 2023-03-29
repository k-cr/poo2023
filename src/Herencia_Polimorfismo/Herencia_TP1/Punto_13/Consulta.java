package Herencia_Polimorfismo.Herencia_TP1.Punto_13;

public class Consulta {
    int posicion;
    String fecha;
    int dni;
    boolean esPrestamo;
    Documento documento;

    public Consulta(int posicion, String fecha, int dni, Documento documento, boolean esPrestamo) {
        this.posicion = posicion;
        this.fecha = fecha;
        this.dni = dni;
        this.documento = documento;
        this.esPrestamo = esPrestamo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public boolean isEsPrestamo() {
        return esPrestamo;
    }

    public void setEsPrestamo(boolean esPrestamo) {
        this.esPrestamo = esPrestamo;
    }
}
