package Arboles.Punto_5;

import Arboles.Nodo;

public class Arbol_6 {
    Nodo raiz;
    public Arbol_6() {
        raiz = null;
    }

    Nodo buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    Nodo buscarRecursivo(Nodo raiz, int valor) {
        if (raiz == null || raiz.getInfo() == valor) {
            return raiz;
        }
        if (valor < raiz.getInfo()) {
            return buscarRecursivo(raiz.getIzquierdo(), valor);
        }
        return buscarRecursivo(raiz.getDerecho(), valor);
    }
}
