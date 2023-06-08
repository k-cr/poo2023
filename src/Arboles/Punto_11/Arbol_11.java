package Arboles.Punto_11;

import Arboles.Arbol;
import Arboles.Nodo;

public class Arbol_11 extends Arbol {
    int hojas;

    public Arbol_11() {
        hojas = 0;
    }
    Nodo buscar(int valor) {
        return buscarRecursivo(super.getRaiz(), valor);
    }

    Nodo buscarRecursivo(Nodo raiz, int valor) {
        if (raiz == null || raiz.getInfo() == valor)
            return raiz;
        if (valor < raiz.getInfo())
            return buscarRecursivo(raiz.getIzquierdo(), valor);
        return buscarRecursivo(raiz.getDerecho(), valor);
    }


    public int contarHojas (Nodo puntero) {
        if (puntero != null) {
            if (puntero.esHoja()) {
                return 1;
            } else {
                return contarHojas(puntero.getIzquierdo()) + contarHojas(puntero.getDerecho());
            }
        }
        return 0;
    }


    Nodo buscarPadre(int valor) {
        return buscarPadreResursivo(super.getRaiz(), valor);
    }

    Nodo buscarPadreResursivo(Nodo nodo, int valor) {
        if (nodo == null ||
                // Compruebo no es nulo el nodo, luego, si el de la izquierda no es nulo, y si coincide con el valor, lo devuelvo
                (nodo.getIzquierdo() != null && nodo.getIzquierdo().getInfo() == valor) ||
                // De otro modo, que suceda lo mismo con el derecho.
                (nodo.getDerecho() != null && nodo.getDerecho().getInfo() == valor)) {
            return nodo;
        }
        if (valor < nodo.getInfo()) {
            return buscarPadreResursivo(nodo.getIzquierdo(), valor);
        }
        return buscarPadreResursivo(nodo.getDerecho(), valor);
    }

    void buscarHermano(int valor) {
        Nodo nodo = buscar(valor);
        if (nodo != null) {
            Nodo padre = buscarPadre(valor);
            if (padre != null) {
                // Pregunto, si el izquierdo del padre es distinto de nulo, y si coincide con el valor, le asigno el contrario.
                Nodo hermano = (padre.getIzquierdo() != null && padre.getIzquierdo().getInfo() == valor) ? padre.getDerecho() : padre.getIzquierdo();
                if (hermano != null) {
                    System.out.println("El hermano de: " + valor + "es: " + hermano.getInfo());
                } else {
                    System.out.println("No tiene hermano");
                }
            } else {
                System.out.println(valor + " es la raíz del árbol, no tiene hermanos.");
            }
        } else {
            System.out.println("No existe este nodo en este arbol.");
        }
    }
}
