package Gestores;

import java.util.Scanner;

public class Esqueleto_gestores {
        public static void main (String[] args) {
            // Instanciar objetos.
            Scanner input = new Scanner(System.in);
            Gestor gestor = new Gestor();
            int opcion;
            do {
                System.out.println("------------ << Gestor >> -------------");
                System.out.println("1- ");
                System.out.println("2- ");
                System.out.println("3- ");
                System.out.println("4- ");
                System.out.println("5- ");
                System.out.println("6- ");
                System.out.println("7- ");
                System.out.println("8- ");
                System.out.println("0- Salir");
                System.out.println("----------------------------------------------");
                System.out.println("Ingrese opción: ");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1 -> // Manejar caso 1
                            System.out.println("1 -------------");
                    case 2 -> // Manejar caso 2
                            System.out.println("2 -------------");
                    case 3 -> // Manejar caso 3
                            System.out.println("3 -------------");
                    case 4 -> // Manejar caso 4
                            System.out.println("4 -------------");
                    case 5 -> // Manejar caso 5
                            System.out.println("5 -------------");
                    case 6 -> // Manejar caso 6
                            System.out.println("6 -------------");
                    case 0 -> System.out.println("..............");
                    default -> System.out.println("Opcion no válida.");
                }
            }
            while (opcion != 0);

        }
}
