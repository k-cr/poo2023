package Listas.Clase18_5_2023;

import Listas.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlFinal(0);
        lista.insertarAlFinal(4);
        lista.mostrarParteEntera();
        lista.mostrarParteDecimal();
    }
}
