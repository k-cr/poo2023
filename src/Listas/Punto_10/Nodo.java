package Listas.Punto_10;

public class Nodo {
    int info;
    int contador;
    Nodo siguiente;
    public Nodo (int info) {
        this.info = info;
        this.contador = 1;
        this.siguiente = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void incrementarOcurrencia() {
        this.contador = this.getContador() + 1;
    }
}
