package Gestores_Nico;

import java.util.Scanner;

public class TestPrueba {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        int op;
        do{

            System.out.println("------------ << Prueba sobre Metodos de la Clase String >> -------------");
            System.out.println("1- Crear String");
            System.out.println("2- Numero de caracteres de la cadena");
            System.out.println("3- ");
            System.out.println("4- ");
            System.out.println("5- ");
            System.out.println("6- ");
            System.out.println("7- ");
            System.out.println("8- ");
            System.out.println("9- Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Ingrese opcion --->");
            op = input.nextInt();
            switch(op)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no vÃ¡lida.");
                    break;
            }
        }
        while(op!=0);
    }
}
