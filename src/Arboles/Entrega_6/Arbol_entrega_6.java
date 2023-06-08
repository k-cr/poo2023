package Arboles.Entrega_6;

import Arboles.Arbol;
import Arboles.Nodo;

public class Arbol_entrega_6 extends Arbol {
    private int contarHijosIzquierda(Nodo nodo) {
        int contador = 0;
        if (nodo == null)
            return 0;
        if (nodo.getIzquierdo() != null)
            contador++;
        contador += contarHijosIzquierda(nodo.getIzquierdo()) + contarHijosIzquierda(nodo.getDerecho());
        return contador;
    }

    private int contarHijosDerecho(Nodo nodo) {
        int contador = 0;
        if (nodo == null)
            return 0;
        if (nodo.getDerecho() != null)
            contador++;
        contador += contarHijosDerecho(nodo.getIzquierdo()) + contarHijosDerecho(nodo.getDerecho());
        return contador;
    }

    public boolean esZurdo() {
        if (super.getRaiz() == null)
            return false;
        return contarHijosIzquierda(super.getRaiz()) > contarHijosDerecho(super.getRaiz());
    }
}
