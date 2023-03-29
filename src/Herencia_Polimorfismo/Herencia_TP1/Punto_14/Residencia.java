package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

public class Residencia extends Extrahotelero{
    int cantidadHabitaciones;
    boolean tieneDescuentos;
    boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, int cantidadHabitaciones, boolean tieneDescuentos, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.tieneDescuentos = tieneDescuentos;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isTieneDescuentos() {
        return tieneDescuentos;
    }

    public void setTieneDescuentos(boolean tieneDescuentos) {
        this.tieneDescuentos = tieneDescuentos;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }
}
