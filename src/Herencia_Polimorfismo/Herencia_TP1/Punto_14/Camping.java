package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

public class Camping extends Extrahotelero{
    int cantidadCarpas;
    int cantidadBaños;
    boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, int cantidadCarpas, int cantidadBaños, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadCarpas = cantidadCarpas;
        this.cantidadBaños = cantidadBaños;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCantidadCarpas() {
        return cantidadCarpas;
    }

    public void setCantidadCarpas(int cantidadCarpas) {
        this.cantidadCarpas = cantidadCarpas;
    }

    public int getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(int cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }
}
