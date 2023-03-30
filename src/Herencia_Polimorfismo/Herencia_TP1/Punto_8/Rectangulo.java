package Herencia_Polimorfismo.Herencia_TP1.Punto_8;

public class Rectangulo extends Figura {
    public double ancho;
    public double largo;

    public Rectangulo(String colorFondo, String colorBorde, double ancho, double largo) {
        super(colorFondo, colorBorde);
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Dibujando un rectángulo");
    }

    @Override
    public double calcularPerimetro() {
        return (this.getLargo() * 2) + (this.getAncho() * 2);
    }

    @Override
    public double calcularSuperficie() {
        return (this.getLargo() * this.getAncho());
    }
}
