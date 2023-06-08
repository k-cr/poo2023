package Arboles.Punto_20;

import Arboles.Monticulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Monticulo monticulo = new Monticulo();
        try (Scanner input = new Scanner(System.in)) {
            int opcion = -1;
            do {
                System.out.println("\n-- Monticulo --");
                System.out.println("1. Agregar un elemento al monticulo");
                System.out.println("2. Ver el montículo en inorden");
                System.out.println("3. Ver el montículo en postorden");
                System.out.println("0. Salir");
                System.out.print("\nElija una opción: ");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese un valor: ");
                        int valor = input.nextInt();
                        monticulo.insertar(valor);
                    }
                    case 2 -> {
                        monticulo.inorden(1);
                    }
                    case 3 -> {
                        monticulo.postorden(1);
                    }
                }
            } while (opcion != 0);
        }
    }
}
