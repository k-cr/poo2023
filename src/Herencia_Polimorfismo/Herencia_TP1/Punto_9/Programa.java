package Herencia_Polimorfismo.Herencia_TP1.Punto_9;

public class Programa {
    String titulo;
    String responsable;
    int id;
    int duracionMinutos;
    String horaInicio;
    String emisora;

    public Programa(String titulo, String responsable, int id, int duracionMinutos, String horaInicio, String emisora) {
        this.titulo = titulo;
        this.responsable = responsable;
        this.id = id;
        this.duracionMinutos = duracionMinutos;
        this.horaInicio = horaInicio;
        this.emisora = emisora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getEmisora() {
        return emisora;
    }

    public void setEmisora(String emisora) {
        this.emisora = emisora;
    }

    public int mostrarComerciales() {
        return 0;
    }
}
