package Herencia_Polimorfismo.Herencia_TP1.Punto_8;

public class Figura {
    // Atributos
    String colorFondo;
    String colorBorde;
    public Figura(String colorFondo, String colorBorde) {
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

    // Métodos
    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }
    public void dibujarFigura() {}

    public double calcularPerimetro() {
        return 0;
    }

    public double calcularSuperficie() {
        return 0;
    }
}
