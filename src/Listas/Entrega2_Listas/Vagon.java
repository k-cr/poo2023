package Listas.Entrega2_Listas;

public class Vagon {
    int cantidadMaxima;
    int cantidadOcupada;
    Vagon siguiente;
    public Vagon(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadOcupada = 0;
        this.siguiente = null;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadOcupada() {
        return cantidadOcupada;
    }

    public void setCantidadOcupada(int cantidadOcupada) {
        this.cantidadOcupada = cantidadOcupada;
    }

    public Vagon getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Vagon siguiente) {
        this.siguiente = siguiente;
    }
}
