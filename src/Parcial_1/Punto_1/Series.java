package Parcial_1.Punto_1;

public class Series extends Programa{
    int episodios;

    public Series(String titulo, int anhoPublicacion, String paisOrigen, int meGusta, int noMeGusta, int episodios) {
        super(titulo, anhoPublicacion, paisOrigen, meGusta, noMeGusta);
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
