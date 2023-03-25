package Herencia_Polimorfismo.Herencia_TP1.Punto_10;

public class Revista extends Publicacion{
    int mesPublicacion;
    int numero;

    public Revista(int id, String titulo, String responsable, String editor, int paginas, double precio, int anhoPublicacion, int mesPublicacion, int numero) {
        super(id, titulo, responsable, editor, paginas, precio, anhoPublicacion);
        this.mesPublicacion = mesPublicacion;
        this.numero = numero;
    }

    public int getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(int mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio();
    }
}
