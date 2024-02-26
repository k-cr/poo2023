package Arboles.Punto_25;

import java.util.Random;
import java.util.Scanner;
import Arboles.Monticulo;

public class Main {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LENGTH = 10;

    public static void main(String[] args) {
        Monticulo_Punto_25 monticulo = new Monticulo_Punto_25();
        Cola_Punto_25 queue = new Cola_Punto_25();
        try (Scanner input = new Scanner(System.in)) {
            int opcion = -1;
            do {
                System.out.println("\n-- Monticulo --");
                System.out.println("1. Agregar un elemento a la cola");
                System.out.println("2. Mostrar");
                System.out.println("0. Salir");
                System.out.print("\nElija una opción: ");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el ID del trabajo: ");
                        int valor = input.nextInt();
                        String token = generarToken();
                        Trabajo trabajo = new Trabajo(valor, token);
                        queue.insertar(trabajo);
                    }
                    case 2 -> {
                        Trabajo trabajo = queue.obtenerSigTrabajo();
                        System.out.println("ID: " + trabajo.getId() + ", con Token: " + trabajo.getToken());
                    }
                }
            } while (opcion != 0);
        }

    }

    public static String generarToken() {
        StringBuilder sb = new StringBuilder(LENGTH);
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
