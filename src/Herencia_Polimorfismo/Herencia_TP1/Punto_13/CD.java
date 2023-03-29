package Herencia_Polimorfismo.Herencia_TP1.Punto_13;

public class CD  extends  Documento{
    String formato;
    String licencia;

    public CD(String titulo, String autor, String editorial, int anho, boolean sePresta, String formato, String licencia) {
        super(titulo, autor, editorial, anho, sePresta);
        this.formato = formato;
        this.licencia = licencia;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}
