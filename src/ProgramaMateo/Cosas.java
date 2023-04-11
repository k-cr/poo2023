package ProgramaMateo;

import java.util.Scanner;
public class Cosas
{
    public static void main(String[] args) {
        Pizarra hola=new Pizarra();
        Scanner scanner=new Scanner(System.in);

        String c;
        String a;
        String b;

        System.out.println("Ingrese el color de borde: ");
        a=scanner.nextLine();


        System.out.println("Ingrese el color de fondo: ");
        b=scanner.nextLine();

        Figura chau=new Figura(a,b);

        hola.agregarFigura(chau);
        hola.agregarFigura(chau);
        hola.agregarFigura(chau);
        hola.quitarFigura(chau);

        //chau.agregarFigura();

        hola.mostrarFiguras();
    }

}