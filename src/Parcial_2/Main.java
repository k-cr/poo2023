package Parcial_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista vocales = new Lista();
        Lista consonantes = new Lista();
        vocales.insertarFinal('A');
        vocales.insertarFinal('E');
        vocales.insertarFinal('I');
        consonantes.insertarFinal('G');
        consonantes.insertarFinal('L');
        consonantes.insertarFinal('T');
        consonantes.insertarFinal('P');
        consonantes.insertarFinal('N');
        System.out.println("Consonantes disponibles: ");
        Iterador iteradorConsonantes = consonantes.getIterador();
        while (iteradorConsonantes.tieneProximo()) {
            char consonante = iteradorConsonantes.getActual();
            Iterador iteradorVocales = vocales.getIterador();
            while (iteradorVocales.tieneProximo()) {
                System.out.println("> " + consonante + iteradorVocales.getActual());
                iteradorVocales.proximo();
            }
            iteradorConsonantes.proximo();
        }
    }
}


