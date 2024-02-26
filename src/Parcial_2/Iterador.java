package Parcial_2;

public class Iterador {
    private Nodo actual;

    public Iterador (Nodo primero) {
        this.actual = primero;
    }

    public void setActual(Nodo actual) {
        this.actual = actual;
    }

    public char getActual() {
        return actual.getInfo();
    }

    public boolean tieneProximo() {
        return actual != null;
    }

    public void proximo() {
        actual = actual.getSiguiente();
    }
}
