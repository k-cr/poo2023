package Herencia_Polimorfismo.Herencia_TP1.Punto_11;

public class Velero extends Barco{
    int mastiles;

    public Velero(String matricula, int eslora, int anhoFabricacion, int mastiles) {
        super(matricula, eslora, anhoFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + mastiles;
    }
}
