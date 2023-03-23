package Herencia_Polimorfismo.Herencia_TP1.Punto_8;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciar objetos.
        Scanner input = new Scanner(System.in);
        GestorFiguras gestorFiguras = new GestorFiguras();
        int opcion;
        do {
            System.out.println("------------ << Pizarra >> -------------");
            System.out.println("1- Dibujar una figura.");
            System.out.println("2- Listar las figuras dibujadas.");
            System.out.println("3- Calcular el perímetro de las figuras.");
            System.out.println("4- Calcular la superficie de las figuras.");
            System.out.println("5- Cambiar los colores de una figura.");
            System.out.println("6- Borrar una figura.");
            System.out.println("7- Borrar la pizarra.");
            System.out.println("0- Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Ingrese opción: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1 -> // Manejar caso 1
                {
                    System.out.println("¿Qué quiere añadir? 1) Círculo, 2) Rectángulo, 3) Línea.");
                    int op = input.nextInt();
                    switch (op)
                    {
                        case 1:
                            System.out.println(" ");
                            System.out.println("Ingrese el radio del círculo");
                            double radio = input.nextDouble();
                            System.out.println("Ingrese el color del fondo del círculo");
                            String fondo = input.nextLine();
                            System.out.println("Ingrese el color del borde del círculo");
                            String borde = input.nextLine();
                            Circunferencia circulo = new Circunferencia(fondo, borde, radio);
                            gestorFiguras.agregarFigura(circulo);
                            System.out.println("Se ha agregado el círculo.");
                            break;

                        case 2:
                            System.out.println(" ");
                            System.out.println("Ingrese cuánto vale la base");
                            double base = input.nextDouble();
                            System.out.println("Ingrese cuánto vale la altura");
                            double altura = input.nextDouble();
                            System.out.println("Ingrese el color del fondo del rectángulo");
                            fondo = input.nextLine();
                            System.out.println("Ingrese el color del borde del rectángulo");
                            borde = input.nextLine();
                            Rectangulo rectangulo = new Rectangulo(fondo, borde, base, altura);
                            gestorFiguras.agregarFigura(rectangulo);
                            System.out.println("Se ha agregado el rectángulo.");
                            break;
                        case 3:
                            System.out.println(" ");
                            System.out.println("Ingrese la longitud de la línea");
                            double longitud = input.nextDouble();
                            System.out.println("Ingrese el color del fondo de la línea");
                            fondo = input.nextLine();
                            System.out.println("Ingrese el color del borde de la línea");
                            borde = input.nextLine();
                            Linea linea = new Linea(fondo, borde, longitud);
                            gestorFiguras.agregarFigura(linea);
                            System.out.println("Se agregó una línea. ");
                            break;
                    }
                }
                case 2 -> // Manejar caso 2
                {
                    System.out.println(" ");
                    System.out.println("Las figuras son: ");
                    gestorFiguras.mostrarFiguras();
                    System.out.println(" ");
                }
                case 3 -> // Manejar caso 3
                {
                    System.out.println(" ");
                    System.out.println("El perímetro de las figuras son: ");
                    gestorFiguras.perimetroFiguras();
                    System.out.println(" ");
                }
                case 4 -> // Manejar caso 4
                {
                    System.out.println(" ");
                    System.out.println("La superficie de las figuras son: ");
                    gestorFiguras.superficieFiguras();
                    System.out.println(" ");
                }
                case 5 -> // Manejar caso 5
                {
                    System.out.println(" ");
                    gestorFiguras.mostrarFiguras();
                    System.out.println("¿De qué figura quiere cambiar el color del borde y fondo?");
                    int posicion = input.nextInt();
                    Figura figura = gestorFiguras.obtenerFigura(posicion - 1);
                    System.out.println("¿Qué color de borde quiere ponerle?");
                    String borde = input.nextLine();
                    System.out.println("¿Qué color de fondo quiere ponerle?");
                    String fondo = input.nextLine();
                    figura.setColorFondo(fondo);
                    figura.setColorBorde(borde);
                    gestorFiguras.agregarFigura(figura);
                    System.out.println(" ");
                }
                case 6 -> {
                    System.out.println(" ");
                    gestorFiguras.mostrarFiguras();
                    System.out.println("¿Cuál figura quiere eliminar?");
                    int posicion = input.nextInt();
                    gestorFiguras.eliminarFigura(posicion);
                    System.out.println("Eliminado correctamente");
                    System.out.println(" ");
                }
                case 7 -> {
                    System.out.println(" ");
                    gestorFiguras.borrarPizarra();
                    System.out.println(" ");
                }
                case 0 -> System.out.println("..............");
                default -> System.out.println("Opcion no válida.");
            }
        }
        while (opcion != 0);
    }
}
