package Herencia_Polimorfismo.Herencia_TP1.Punto_10;

public class Diario extends Publicacion{
    boolean semanal;
    int semanaPublicacion;
    int mesPublicacion;
    static final double envio = 30.4;

    public Diario(int id, String titulo, String responsable, String editor, int paginas, double precio, int anhoPublicacion, boolean semanal, int semanaPublicacion, int mesPublicacion) {
        super(id, titulo, responsable, editor, paginas, precio, anhoPublicacion);
        this.semanal = semanal;
        this.semanaPublicacion = semanaPublicacion;
        this.mesPublicacion = mesPublicacion;
    }

    public boolean isSemanal() {
        return semanal;
    }

    public void setSemanal(boolean semanal) {
        this.semanal = semanal;
    }

    public int getSemanaPublicacion() {
        return semanaPublicacion;
    }

    public void setSemanaPublicacion(int semanaPublicacion) {
        this.semanaPublicacion = semanaPublicacion;
    }

    public int getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(int mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + envio;
    }
}
