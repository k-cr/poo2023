package Herencia_Polimorfismo.Herencia_TP1.Punto_11;

public class Deportivo extends Barco{
    int potencia;

    public Deportivo(String matricula, int eslora, int anhoFabricacion, int potencia) {
        super(matricula, eslora, anhoFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + potencia;
    }
}
