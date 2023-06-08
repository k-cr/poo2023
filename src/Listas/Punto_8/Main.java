package Listas.Punto_8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = -1;
        try (Scanner sc = new Scanner(System.in)) {
            Lista list = new Lista();
            do {
                System.out.println("\n-- Lista Enlazada --");
                System.out.println("1. Agregar un nodo");
                System.out.println("2. Contar elementos.");
                System.out.println("3. Calcular la sumatoria.");
                System.out.println("4. Mostrar el elemento más chico");
                System.out.println("5. Mostrar el elemento más grande");
                System.out.println("6. Ver lista invertida (Pila)");
                System.out.println("7. Ver lista invertida (Recursivo)");
                System.out.println("8. Ver lista");
                System.out.println("0. Salir");
                System.out.print("\nElija una opción: ");
                option = sc.nextInt();

                switch (option) {
                    case 1 -> {
                        System.out.print("Ingrese el valor del nodo: ");
                        int data = sc.nextInt();
                        list.insertarAlFinal(data);
                    }
                    case 2 -> {
                        System.out.println("> Cantidad de elementos: ");
                        IteradorLista iterador = list.getIterador();
                        System.out.println("Los elementos son: " +  iterador.contarElementos());
                    }
                    case 3 -> {
                        System.out.println("> Sumatoria de elementos: ");
                        IteradorLista iterador = list.getIterador();
                        System.out.println("La sumatoria es de: " + iterador.calcularSumatoria());
                    }
                    case 4 -> {
                        System.out.println("> Elemento más pequeño: ");
                        IteradorLista iterador = list.getIterador();
                        System.out.println("Elemento: " + iterador.devolverMenor());
                    }
                    case 5 -> {
                        System.out.println("> Elemento más grande: ");
                        IteradorLista iterador = list.getIterador();
                        System.out.println("Elemento: " + iterador.devolverMayor());
                    }
                    case 6 -> {
                        System.out.println("> Lista invertida (Pila): ");
                        IteradorLista iterador = list.getIterador();
                        iterador.verListaInvertida();
                    }
                    case 7 -> {
                        System.out.println("> Lista invertida (Recursividad): ");
                        IteradorLista iterador = list.getIterador();
                        iterador.verListaRecursiva();
                    }
                    case 8 -> {
                        IteradorLista iterador = list.getIterador();
                        iterador.verLista();
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
}
