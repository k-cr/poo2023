package Herencia_Polimorfismo.Herencia_TP1.Punto_9;

public class Radio extends Programa{
    String responsableMusica;
    final int comerciales = 20;

    public Radio(String titulo, String responsable, int id, int duracionMinutos, String horaInicio, String emisora, String responsableMusica) {
        super(titulo, responsable, id, duracionMinutos, horaInicio, emisora);
        this.responsableMusica = responsableMusica;
    }

    public String getResponsableMusica() {
        return responsableMusica;
    }

    public void setResponsableMusica(String responsableMusica) {
        this.responsableMusica = responsableMusica;
    }

    public int getComerciales() {
        return comerciales;
    }

    public int mostrarComerciales(){
        return this.getDuracionMinutos() / comerciales;
    }
}
