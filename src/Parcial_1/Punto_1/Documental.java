package Parcial_1.Punto_1;

public class Documental extends Programa{
    int duracionMinutos;
    String hechoReal;

    public Documental(String titulo, int anhoPublicacion, String paisOrigen, int meGusta, int noMeGusta, int duracionMinutos, String hechoReal) {
        super(titulo, anhoPublicacion, paisOrigen, meGusta, noMeGusta);
        this.duracionMinutos = duracionMinutos;
        this.hechoReal = hechoReal;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getHechoReal() {
        return hechoReal;
    }

    public void setHechoReal(String hechoReal) {
        this.hechoReal = hechoReal;
    }
}
