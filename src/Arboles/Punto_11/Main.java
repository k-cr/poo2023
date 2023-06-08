package Arboles.Punto_11;

import Arboles.Nodo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arbol_11 arbol = new Arbol_11();
        arbol.insertarElemento(35);
        arbol.insertarElemento(28);
        arbol.insertarElemento(39);
        arbol.insertarElemento(27);
        arbol.insertarElemento(31);
        arbol.insertarElemento(47);
        arbol.insertarElemento(46);
        arbol.insertarElemento(15);
        int option = -1;
        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.println("\n-- Árbol --");
                System.out.println("1. Agregar un elemento al árbol");
                System.out.println("2. Verificar si está un elemento.");
                System.out.println("3. Buscar un elemento.");
                System.out.println("4. Eliminar un nodo");
                System.out.println("5. Ver el árbol por inorden");
                System.out.println("6. Ver el árbol por preorden");
                System.out.println("7. Contar hojas");
                System.out.println("8. Buscar un elemento");
                System.out.println("9. Ver padre de un elemento");
                System.out.println("0. Salir");
                System.out.print("\nElija una opción: ");
                option = input.nextInt();
                switch (option) {
                    case 1 -> {
                        System.out.print("¿Qué elemento quiere añadir?: ");
                        int nodo = input.nextInt();
                        arbol.insertarElemento(nodo);
                        System.out.print(" ");
                    }
                    case 2 -> {
                        System.out.print("¿Qué elemento quiere buscar? Inserte el valor: ");
                        int nodo = input.nextInt();
                        String encontrado = arbol.buscarNodo(nodo)? "El elemento está en el árbol" : "El elemento no está en el árbol";
                        System.out.print(encontrado);
                        System.out.print(" ");
                    }
                    case 3 -> {
                        System.out.print("¿Qué elemento quiere buscar? Inserte el valor: ");
                        int nodo = input.nextInt();
                        Nodo aux = arbol.encontrarNodo(nodo);
                        System.out.print("Valor: " + aux.getInfo() + "\n" + "Nodo izquierdo: " + aux.getIzquierdo().getInfo() + "\n" + "Nodo derecho: " + aux.getDerecho().getInfo() + "\n");
                        System.out.print(" ");
                    }
                    case 4 -> {
                        System.out.print("¿Qué elemento quiere eliminar? Inserte el valor: ");
                        int nodo = input.nextInt();
                        arbol.eliminarNodo(nodo);
                        System.out.print(" ");
                    }
                    case 5 -> {
                        arbol.inordenRecursivo(arbol.getRaiz());
                        System.out.print(" ");
                    }
                    case 6 -> {
                        arbol.preorden(arbol.getRaiz());
                        System.out.print(" ");
                    }
                    case 7 -> {
                        arbol.familia(new Nodo(27));
                        System.out.print(" ");
                    }
                    case 8 -> {
                        System.out.print("¿Qué elemento quiere buscar? Inserte el valor: ");
                        int nodo = input.nextInt();
                        Nodo node = arbol.buscar(nodo);
                        System.out.print("> " + node.getInfo());
                        System.out.print(" ");
                    }
                    case 9 -> {
                        System.out.print("¿Qué elemento quiere buscar el padre? Inserte el valor: ");
                        int nodo = input.nextInt();
                        Nodo node = arbol.buscarPadre(nodo);
                        if (node == null) {
                            System.out.println("No se encontró");
                        } else {
                            System.out.print("> " + node.getInfo());
                        }
                        System.out.print(" ");
                    }
                }
            } while (option != 0);
        }
    }
}
