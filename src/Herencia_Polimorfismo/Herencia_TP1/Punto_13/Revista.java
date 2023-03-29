package Herencia_Polimorfismo.Herencia_TP1.Punto_13;

public class Revista extends Documento{
    int volumen;
    int numero;
    String mes;

    public Revista(String titulo, String autor, String editorial, int anho, boolean sePresta, int volumen, int numero, String mes) {
        super(titulo, autor, editorial, anho, sePresta);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
