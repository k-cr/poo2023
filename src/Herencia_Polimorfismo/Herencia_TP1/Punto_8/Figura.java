package Herencia_Polimorfismo.Herencia_TP1.Punto_8;

// Cambiamos a abstracta para aplicar mejor los conceptos
public abstract class Figura {
    // Atributos
    String colorFondo;
    String colorBorde;

    public Figura(String colorFondo, String colorBorde) {
        this.colorFondo = colorFondo;
        this.colorBorde = colorBorde;
    }

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

    // Métodos
    public abstract void dibujarFigura();
    public abstract double calcularPerimetro();
    public abstract double calcularSuperficie();
}
