package Herencia_Polimorfismo.Herencia_TP1.Punto_14;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GestorAlojamientos gestor = new GestorAlojamientos();
        int opcion = -1;
        int op = -1;
        int o = -1;
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Añadir un alojamiento. \s
                                2. Ver alojamientos disponibles. \s
                                3. Ver alojamientos disponibles en una localidad. \s
                                0. Salir.\s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> {
                        String hotelExtra = JOptionPane.showInputDialog(null,
                                """
                                        -------------------------------
                                        ¿Qué desea añadir?:\s
                                        1. Hotel. \s
                                        2. Alojamiento Extrahotelero. \s
                                        9. Ir al menú principal.\s
                                        -------------------------------""");
                        op = Integer.parseInt(hotelExtra);
                        switch (op) {
                            case 1 -> {
                                String hoteles = JOptionPane.showInputDialog(null,
                                        """
                                                -------------------------------
                                                ¿Qué desea añadir?:\s
                                                1. Hotel 3 estrellas. \s
                                                2. Hotel 4 estrellas. \s
                                                3. Hotel 5 estrellas. \s
                                                9. Ir al menú principal.\s
                                                -------------------------------""");
                                o = Integer.parseInt(hoteles);
                                switch (o) {
                                    case 1 -> {
                                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama el hotel?");
                                        String direccion = JOptionPane.showInputDialog(null, "¿Qué dirección tiene?");
                                        String localidad = JOptionPane.showInputDialog(null, "¿En qué localidad queda?");
                                        String gerente =  JOptionPane.showInputDialog(null, "¿Quién es el gerente?");
                                        int habitaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas habitaciones tiene?"));
                                        int camas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas camas tiene?"));
                                        int pisos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos pisos tiene?"));
                                        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuál es el precio base de la habitación?"));
                                        HotelTres hotelTres = new HotelTres(nombre, direccion, localidad, gerente, habitaciones, camas, pisos, precio);
                                        gestor.agregarAlojamiento(hotelTres);
                                    }
                                    case 2 -> {
                                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama el hotel?");
                                        String direccion = JOptionPane.showInputDialog(null, "¿Qué dirección tiene?");
                                        String localidad = JOptionPane.showInputDialog(null, "¿En qué localidad queda?");
                                        String gerente =  JOptionPane.showInputDialog(null, "¿Quién es el gerente?");
                                        int habitaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas habitaciones tiene?"));
                                        int camas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas camas tiene?"));
                                        int pisos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos pisos tiene?"));
                                        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuál es el precio base de la habitación?"));
                                        String tipoGimnasio = JOptionPane.showInputDialog(null, "¿Qué tipo de gimnasio tiene? A ó B");
                                        String nombreRestaurante = JOptionPane.showInputDialog(null, "¿Qué nombre tiene el restaurante?");
                                        int capacidadRestaurante = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuánta es la capacidad de restaurante?"));
                                        HotelCuatro hotelCuatro = new HotelCuatro(nombre, direccion, localidad, gerente, habitaciones, camas, pisos, precio, tipoGimnasio, nombreRestaurante, capacidadRestaurante);
                                        gestor.agregarAlojamiento(hotelCuatro);
                                    }
                                    case 3 -> {
                                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama el hotel?");
                                        String direccion = JOptionPane.showInputDialog(null, "¿Qué dirección tiene?");
                                        String localidad = JOptionPane.showInputDialog(null, "¿En qué localidad queda?");
                                        String gerente =  JOptionPane.showInputDialog(null, "¿Quién es el gerente?");
                                        int habitaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas habitaciones tiene?"));
                                        int camas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas camas tiene?"));
                                        int pisos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos pisos tiene?"));
                                        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuál es el precio base de la habitación?"));
                                        String tipoGimnasio = JOptionPane.showInputDialog(null, "¿Qué tipo de gimnasio tiene? A ó B");
                                        String nombreRestaurante = JOptionPane.showInputDialog(null, "¿Qué nombre tiene el restaurante?");
                                        int capacidadRestaurante = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuánta es la capacidad de restaurante?"));
                                        int cantidadSalones = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos salones tiene?"));
                                        int cantidadSuites = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas suites?"));
                                        int cantidadLimosinas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas limusinas tiene?"));
                                        HotelCinco hotelCinco = new HotelCinco(nombre, direccion, localidad, gerente, habitaciones, camas, pisos, precio, tipoGimnasio, nombreRestaurante, capacidadRestaurante, cantidadSalones, cantidadSuites, cantidadLimosinas);
                                        gestor.agregarAlojamiento(hotelCinco);
                                    }
                                }
                            }
                            case 2 -> {
                                String extrahoteleros = JOptionPane.showInputDialog(null,
                                        """
                                                -------------------------------
                                                ¿Qué desea añadir?:\s
                                                1. Camping. \s
                                                2. Residencia. \s
                                                9. Ir al menú principal.\s
                                                -------------------------------""");
                                o = Integer.parseInt(extrahoteleros);
                                switch (o) {
                                    case 1 -> {
                                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama el camping?");
                                        String direccion = JOptionPane.showInputDialog(null, "¿Qué dirección tiene?");
                                        String localidad = JOptionPane.showInputDialog(null, "¿En qué localidad queda?");
                                        String gerente =  JOptionPane.showInputDialog(null, "¿Quién es el gerente?");
                                        int privado = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Es privado? 0 para no, 1 para sí"));
                                        boolean esPrivado = privado == 1; // -> privado == 1 retorna un valor de verdad.
                                        double metrosCuadrados = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuántos metros cuadrados ocupa el camping?"));
                                        int carpas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas carpas tiene?"));
                                        int banos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos baños tiene?"));
                                        int restaurante = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tiene restaurante? 0 para no, 1 para sí"));
                                        boolean tieneRestaurante = restaurante == 1;
                                        Camping camping = new Camping(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados, carpas, banos, tieneRestaurante);
                                        gestor.agregarAlojamiento(camping);
                                    }
                                    case 2 -> {
                                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama la residencia?");
                                        String direccion = JOptionPane.showInputDialog(null, "¿Qué dirección tiene?");
                                        String localidad = JOptionPane.showInputDialog(null, "¿En qué localidad queda?");
                                        String gerente =  JOptionPane.showInputDialog(null, "¿Quién es el gerente?");
                                        int privado = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Es privado? 0 para no, 1 para sí"));
                                        boolean esPrivado = privado == 1; // -> privado == 1 retorna un valor de verdad.
                                        double metrosCuadrados = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuántos metros cuadrados ocupa el camping?"));
                                        int habitaciones = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas habitaciones tiene?"));
                                        int descuentos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tiene descuentos? 0 para no, 1 para sí"));
                                        boolean tieneDescuentos = descuentos == 1;
                                        int campodeportivo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Tiene campo deportivo? 0 para no, 1 para sí"));
                                        boolean tieneCampoDeportivo = campodeportivo == 1;
                                        Residencia residencia = new Residencia(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados, habitaciones, tieneDescuentos, tieneCampoDeportivo);
                                        gestor.agregarAlojamiento(residencia);
                                    }
                                }
                            }
                        }
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, gestor.mostrarAlojamientos());
                    }
                    case 3 -> {
                        String localidadBuscar = JOptionPane.showInputDialog(null, "¿De qué localidad quiere buscar?");
                        JOptionPane.showMessageDialog(null, gestor.mostrarAlojamientosLocalidad(localidadBuscar));
                    }
                    case 0 -> {
                        JOptionPane.showMessageDialog(null, "¡Adiós!");
                    }
                    default -> {
                        System.out.println("c");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción no válida" + e.getMessage());
            }
        } while (opcion != 0);
    }
}
