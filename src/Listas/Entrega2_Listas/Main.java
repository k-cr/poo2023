package Listas.Entrega2_Listas;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Tren list = new Tren();

    public static void main(String[] args) {
        int option = 0;

        do {
            System.out.println("\n-- Lista Enlazada --");
            System.out.println("1. Agregar un vagón");
            System.out.println("2. Mostrar los vagones del tren");
            System.out.println("3. Subir pasajeros");
            System.out.println("4. Bajar pasajeros");
            System.out.println("5. Salir");
            System.out.print("\nElija una opción: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        int data = (int)(Math.random() * 50);
                        System.out.print("Valor del vagon: " + data);
                        list.nuevoVagon(data);
                    }
                    break;

                case 2:
                    list.subirPasajeros((int)(Math.random() * 50));
                    break;

                case 3:
                    list.bajarPasajeros((int)(Math.random() * 4), (int)(Math.random() * 50));
                    break;

                case 4:
                    System.out.println("Lista actual: ");
                    list.verVagones();
                    System.out.println();
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
