package Arboles;

import java.util.Stack;

public class Iterador {
    Stack<Nodo> pila;
    private Nodo actual;
    Iterador(Nodo raiz) {
        pila = new Stack<Nodo>();
        actual = raiz;
    }

    public int getInfo() {
        return actual.getInfo();
    }

    public Nodo getActual() {
        return actual;
    }

    public boolean hasNext() {
        return !pila.isEmpty();
    }

    public void next() {
        if (actual.esHoja()) {
            if (pila.isEmpty()) {
                actual = null;
            } else {
                actual = ((Nodo) pila.pop()).getDerecho();
            }
        } else {
            if (actual.tieneHijo()) {
                actual = actual.getHijo();
            } else {
                pila.push(actual);
                actual = actual.getIzquierdo();
            }
        }
    }
}
