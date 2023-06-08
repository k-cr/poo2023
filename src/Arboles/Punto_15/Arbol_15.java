package Arboles.Punto_15;

import Arboles.Arbol;
import Arboles.Nodo;

import java.util.Vector;

public class Arbol_15 extends Arbol {
    Vector<Integer> elementos;
    public Arbol_15 () {
        elementos = new Vector<Integer>();
    }

    public Vector<Integer> obtenerElementos() {
        elementos.clear();
        obtenerElementosRecursivo(super.getRaiz());
        return elementos;
    }

    private void obtenerElementosRecursivo(Nodo raiz) {
        if (raiz != null) {
            obtenerElementosRecursivo(raiz.getDerecho());
            elementos.add(raiz.getInfo());
            obtenerElementosRecursivo(raiz.getIzquierdo());
        }
    }
}
