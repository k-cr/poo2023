package Arboles.Punto_15;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Hago los dos árboles random
        Arbol_15 arbol1 = generarArbolRandom(10);
        Arbol_15 arbol2 = generarArbolRandom(7);

        System.out.println("Arbol 1: ");
        arbol1.inordenRecursivo(arbol1.getRaiz());
        System.out.println(" ");

        System.out.println("Arbol 2: ");
        arbol2.inordenRecursivo(arbol2.getRaiz());
        System.out.println(" ");

        Vector<Integer> elementos1 = arbol1.obtenerElementos();
        Vector<Integer> elementos2 = arbol2.obtenerElementos();

        Vector<Integer> union = new Vector<Integer>(elementos1);
        union.addAll(elementos2);

        System.out.println("Unión: ");
        for (int elemento : union) {
            System.out.print(elemento + " ");
        }
        System.out.println(" ");

        Vector<Integer> interseccion = new Vector<Integer>(elementos1);
        interseccion.retainAll(elementos2);

        System.out.println("Intersección: ");
        for (int elemento : interseccion) {
            System.out.print(elemento + " ");
        }
        System.out.println(" ");

        Vector<Integer> diferencia = new Vector<>(elementos1);
        diferencia.removeAll(elementos2);

        System.out.println("Diferencia Arbol 1 con el arbol 2: ");
        for (int elemento : diferencia) {
            System.out.print(elemento + " ");
        }
        System.out.println(" ");

        Vector<Integer> diferencia2 = new Vector<>(elementos2);
        diferencia.removeAll(elementos1);

        System.out.println("Diferencia Arbol 2 con el arbol 1: ");
        for (int elemento : diferencia2) {
            System.out.print(elemento + " ");
        }
        System.out.println(" ");
    }

    public static Arbol_15 generarArbolRandom(int tamanho) {
        Arbol_15 arbol = new Arbol_15();
        for (int i = 0; i < tamanho; i++) {
            int valor = (int) (Math.random() * 100);
            arbol.insertarElemento(valor);
        }
        return arbol;
    }
}
