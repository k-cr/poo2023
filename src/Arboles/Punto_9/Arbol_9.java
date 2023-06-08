package Arboles.Punto_9;

import Arboles.Arbol;
import Arboles.Nodo;

public class Arbol_9 extends Arbol {
    Nodo raiz;
    public Arbol_9() {
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
