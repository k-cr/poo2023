package Listas.Punto_9;

public class Nodo {
    int data;
    Nodo siguiente;
    public Nodo (int data) {
        this.data = data;
        this.siguiente = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
