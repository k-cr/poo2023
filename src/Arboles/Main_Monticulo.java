package Arboles;

import java.util.Scanner;

public class Main_Monticulo {
    public static void main(String[] args) {
        Monticulo monticulo = new Monticulo();
        try (Scanner input = new Scanner(System.in)) {
            int opcion = -1;
            do {
                System.out.println("\n-- Monticulo --");
                System.out.println("1. Agregar un elemento al monticulo");
                System.out.println("0. Salir");
                System.out.print("\nElija una opción: ");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese un valor: ");
                        int valor = input.nextInt();
                        monticulo.insertar(valor);
                    }
                }
            } while (opcion != 0);
        }
    }
}
