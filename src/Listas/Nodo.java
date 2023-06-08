package Listas;

public class Nodo {
    int info;
    Nodo siguiente;
    public Nodo(int valor) {
        this.info = valor;
        this.siguiente = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
