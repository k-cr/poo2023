package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

public class Extrahotelero extends Alojamiento{
    boolean privado;
    double metrosCuadrados;

    public Extrahotelero(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
}
