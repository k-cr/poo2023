package Herencia_Polimorfismo.Herencia_TP1.Punto_9;

public class Television extends Programa{
    int tandas;
    final int comerciales = 5;

    public Television(String titulo, String responsable, int id, int duracionMinutos, String horaInicio, String emisora, int tandas) {
        super(titulo, responsable, id, duracionMinutos, horaInicio, emisora);
        this.tandas = tandas;
    }

    public int getTandas() {
        return tandas;
    }

    public void setTandas(int tandas) {
        this.tandas = tandas;
    }

    @Override
    public int mostrarComerciales() {
        return this.comerciales * this.getTandas();
    }
}
