package Parcial_2;

public class Nodo {
    private char caracter;
    private Nodo siguiente;
    public Nodo(char caracter, Nodo siguiente) {
        this.caracter = caracter;
        this.siguiente = siguiente;
    }

    public char getInfo() {
        return caracter;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
