package Listas.Punto_10;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Lista list = new Lista();

    public static void main(String[] args) {
        int option = 0;
        int contador = 0;
        do {
            System.out.println("\n-- Lista Enlazada --");
            System.out.println("1. Agregar un nodo");
            System.out.println("2. Mostrar la lista");
            System.out.println("0. Salir");
            System.out.print("\nElija una opción: ");
            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Ingrese el valor del nodo: ");
                    int data = sc.nextInt();
                    if (contador == 0) {
                        list.insertarNodo(data);
                        contador++;
                    } else {

                    }
                }

                case 2 -> {
                    System.out.println("Lista actual: ");
                    IteradorLista iterador = list.getIterador();
                    iterador.mostrarLista();
                    System.out.println();
                }

                case 0 -> {
                    System.out.println("¡Hasta luego!");
                }

                default -> {
                    System.out.println("Opción inválida. Intente de nuevo.");
                }
            }

        } while (option != 0);
    }
}
