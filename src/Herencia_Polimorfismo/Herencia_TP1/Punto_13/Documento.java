package Herencia_Polimorfismo.Herencia_TP1.Punto_13;

public class Documento {
    String titulo;
    String autor;
    String editorial;
    int anho;
    boolean sePresta;

    public Documento(String titulo, String autor, String editorial, int anho, boolean sePresta) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anho = anho;
        this.sePresta = sePresta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public boolean isSePresta() {
        return sePresta;
    }

    public void setSePresta(boolean sePresta) {
        this.sePresta = sePresta;
    }
}
