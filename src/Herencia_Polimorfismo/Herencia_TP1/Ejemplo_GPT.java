package Herencia_Polimorfismo.Herencia_TP1;

import javax.swing.*;

public class Ejemplo_GPT {
    public static void main(String[] args) {
        // Creamos un JPane con las opciones del menú
        Object[] opciones = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);

        // Evaluamos la opción seleccionada
        switch (seleccion) {
            case 0: // Opción 1
                String input1 = JOptionPane.showInputDialog("Ingrese un valor para la opción 1:");
                // Aquí se pueden hacer operaciones con el input ingresado
                JOptionPane.showMessageDialog(null, "Ha seleccionado la opción 1 con el valor: " + input1);
                break;
            case 1: // Opción 2
                String input2 = JOptionPane.showInputDialog("Ingrese un valor para la opción 2:");
                // Aquí se pueden hacer operaciones con el input ingresado
                JOptionPane.showMessageDialog(null, "Ha seleccionado la opción 2 con el valor: " + input2);
                break;
            case 2: // Opción 3
                String input3 = JOptionPane.showInputDialog("Ingrese un valor para la opción 3:");
                // Aquí se pueden hacer operaciones con el input ingresado
                JOptionPane.showMessageDialog(null, "Ha seleccionado la opción 3 con el valor: " + input3);
                break;
            case 3: // Opción 4
                String input4 = JOptionPane.showInputDialog("Ingrese un valor para la opción 4:");
                // Aquí se pueden hacer operaciones con el input ingresado
                JOptionPane.showMessageDialog(null, "Ha seleccionado la opción 4 con el valor: " + input4);
                break;
            default: // Opción por defecto
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }
}
