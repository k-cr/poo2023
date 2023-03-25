package Herencia_Polimorfismo.Herencia_TP1.Punto_11;

public class Yate extends Barco{
    int potencia;
    int camarotes;

    public Yate(String matricula, int eslora, int anhoFabricacion, int potencia, int camarotes) {
        super(matricula, eslora, anhoFabricacion);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public double calcularPrecio() {
        return (eslora + potencia + camarotes) * 10;
    }
}
