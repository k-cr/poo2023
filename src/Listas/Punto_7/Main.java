package Listas.Punto_7;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Lista list = new Lista();

    public static void main(String[] args) {
        int option = 0;

        do {
            System.out.println("\n-- Lista Enlazada --");
            System.out.println("1. Agregar un nodo");
            System.out.println("2. Mostrar la lista");
            System.out.println("3. Actualizar un nodo");
            System.out.println("4. Invertir la lista");
            System.out.println("5. Salir");
            System.out.print("\nElija una opción: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el valor del nodo: ");
                    int data = sc.nextInt();
                    list.insertarAlFinal(data);
                    break;

                case 2:
                    System.out.println("Lista actual: ");
                    list.leerLista();
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Ingrese el índice del nodo a actualizar: ");
                    int index = sc.nextInt();
                    System.out.print("Ingrese el nuevo valor del nodo: ");
                    int newData = sc.nextInt();
                    list.actualizarNodo(index, newData);
                    break;

                case 4:
                    list.invertirLista();
                    System.out.println("La lista ha sido invertida correctamente.");
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (option != 5);
    }
}
