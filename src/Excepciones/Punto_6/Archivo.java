package Excepciones.Punto_6;

public class Archivo {
    String nombre;
    int tamanho;
    String fechaModificacion;
    boolean puedeEscribir;
    boolean puedeLeer;
    String tipo;

    public Archivo(String nombre, int tamanho, String fechaModificacion, boolean puedeEscribir, boolean puedeLeer, String tipo) {
        this.nombre = nombre;
        this.tamanho = tamanho;
        this.fechaModificacion = fechaModificacion;
        this.puedeEscribir = puedeEscribir;
        this.puedeLeer = puedeLeer;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public boolean isPuedeEscribir() {
        return puedeEscribir;
    }

    public void setPuedeEscribir(boolean puedeEscribir) {
        this.puedeEscribir = puedeEscribir;
    }

    public boolean isPuedeLeer() {
        return puedeLeer;
    }

    public void setPuedeLeer(boolean puedeLeer) {
        this.puedeLeer = puedeLeer;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
