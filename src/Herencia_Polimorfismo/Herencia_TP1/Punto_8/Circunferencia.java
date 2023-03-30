package Herencia_Polimorfismo.Herencia_TP1.Punto_8;

import javax.swing.*;

public class Circunferencia extends Figura {
    public double radio;

    public Circunferencia(String colorFondo, String colorBorde, double radio) {
        super(colorFondo, colorBorde);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Dibujando círculo");
    }

    @Override
    public double calcularPerimetro() {
        return 3.14 * (this.getRadio() * 2);
    }

    @Override
    public double calcularSuperficie() {
        return 3.14 * (this.getRadio() * this.getRadio());
    }
}
