package Arboles;

public class NodoInterno implements NodoBinario {
    private NodoBinario izquierdo, derecho;
    private char operador;

    public NodoInterno(char op) {
        this.operador = op;
    }


    @Override
    public NodoBinario getDerecha() {
        return derecho;
    }

    @Override
    public void setDerecha(NodoBinario nodo) {
        derecho = nodo;
    }

    @Override
    public Object getElemento() {
        return operador;
    }

    @Override
    public void setElemento(Object elemento) {
        operador = (char) elemento;
    }

    @Override
    public boolean esHoja() {
        return false;
    }

    @Override
    public NodoBinario getIzquierda() {
        return izquierdo;
    }

    @Override
    public void setIzquierda(NodoBinario nodo) {
        izquierdo = nodo;
    }
}
