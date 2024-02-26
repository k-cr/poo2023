package Compensatorio_2;

import Arboles.Arbol;
import Arboles.Iterador;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertarElemento(55);
        arbol.insertarElemento(109);
        arbol.insertarElemento(327);
        arbol.insertarElemento(5);
        arbol.insertarElemento(94);
        arbol.insertarElemento(437);
        arbol.contarHojaseInterinos();
    }
}
