package Herencia_Polimorfismo.Herencia_TP1.Punto_8;

public class Linea extends Figura{
    public double longitud;

    public Linea(String colorFondo, String colorBorde, double longitud) {
        super(colorFondo, colorBorde);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public void dibujarFigura() {
        System.out.println("Dibujando una línea");
    }

    @Override
    public double calcularPerimetro() {
        return this.getLongitud();
    }

    @Override
    public double calcularSuperficie() {
        return this.getLongitud();
    }
}
