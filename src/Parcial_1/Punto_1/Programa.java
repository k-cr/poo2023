package Parcial_1.Punto_1;

public class Programa {
    String titulo;
    int anhoPublicacion;
    String paisOrigen;
    int meGusta;
    int noMeGusta;

    public Programa(String titulo, int anhoPublicacion, String paisOrigen, int meGusta, int noMeGusta) {
        this.titulo = titulo;
        this.anhoPublicacion = anhoPublicacion;
        this.paisOrigen = paisOrigen;
        this.meGusta = meGusta;
        this.noMeGusta = noMeGusta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(int anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }

    public int getNoMeGusta() {
        return noMeGusta;
    }

    public void setNoMeGusta(int noMeGusta) {
        this.noMeGusta = noMeGusta;
    }
}
