package Arboles;

import java.util.Scanner;

public class Main_Arbol {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
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
                System.out.println("7. Ver el árbol por postorden");
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
                        arbol.postorden(arbol.getRaiz());
                        System.out.print(" ");
                    }
                }
            } while (option != 0);
        }
    }
}
