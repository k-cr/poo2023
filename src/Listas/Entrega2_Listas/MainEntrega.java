package Listas.Entrega2_Listas;

public class MainEntrega {
    static Tren list = new Tren();

    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            int data = (int)(Math.random() * 50);
            System.out.println("Capacidad máxima del vagon: " + data);
            list.nuevoVagon(data);
        }
        int subir = (int)(Math.random() * 50);
        System.out.println("Subirán "  + subir + " pasajeros.");
        list.subirPasajeros(subir);
        while (contador < 5) {
            System.out.println(" ");
            list.verVagones();
            int bajar = (int)(Math.random() * 50);
            int pos = (int)(Math.random() * 4);
            System.out.println("Bajarán "  + bajar + " pasajeros del vagón: " + pos);
            list.bajarPasajeros(pos, bajar);
            subir = (int)(Math.random() * 50);
            System.out.println("Subirán "  + subir + " pasajeros.");
            list.subirPasajeros(subir);
            System.out.println("-------------------");
            contador++;
        }
        list.verVagones();
    }
}
