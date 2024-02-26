package Arboles.Punto_26;

import Arboles.ArbolExpresion;
import Arboles.Expresion;

public class Main {
    public static void main(String[] args) {
        String expresion = "5*2+1*2";
        ArbolExpresion arbol = new ArbolExpresion();
        String expresionPrefija = arbol.InfijaToPrefija(expresion).toString();
        Expresion exp = new Expresion(expresionPrefija);
        arbol.generarArbol(exp);

        arbol.preorden();
        System.out.println(" ");
        arbol.inorden();
        System.out.println(" ");
        arbol.postorden();
        System.out.println(" ");
    }
}
