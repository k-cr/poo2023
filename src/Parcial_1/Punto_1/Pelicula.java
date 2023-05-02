package Parcial_1.Punto_1;

public class Pelicula extends Programa{
    int minutos;
    String genero;

    public Pelicula(String titulo, int anhoPublicacion, String paisOrigen, int meGusta, int noMeGusta, int minutos, String genero) {
        super(titulo, anhoPublicacion, paisOrigen, meGusta, noMeGusta);
        this.minutos = minutos;
        this.genero = genero;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
