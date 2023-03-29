package Herencia_Polimorfismo.Herencia_TP1.Punto_13;

public class Microfilm extends Documento{
    int codigo;

    public Microfilm(String titulo, String autor, String editorial, int anho, boolean sePresta, int codigo) {
        super(titulo, autor, editorial, anho, sePresta);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
