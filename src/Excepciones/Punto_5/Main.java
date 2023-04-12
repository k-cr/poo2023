package Excepciones.Punto_5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Printer impresora = new Printer();
        GestorImpresora gestor = new GestorImpresora();
        int opcion = -1;
        do {
            try {
                String lectura = JOptionPane.showInputDialog(null,
                        """
                                -------------------------------
                                Ingrese una opción:\s
                                1. Agregar un documento a la cola de impresión. \s
                                2. Imprimir un documento. \s
                                3. Verificar nivel de tinta. \s
                                4. Verificar hojas disponibles.\s
                                5. Cargar tinta a la impresora. \s
                                6. Cargar hojas a la impresora. \s
                                7. Comprobar conexión. \s
                                8. Conectar impresora.\s
                                0. Salir. \s
                                -------------------------------""");
                opcion = Integer.parseInt(lectura);
                switch (opcion) {
                    case 1 -> // Agregar un documento a la cola de impresión.
                    {
                        String nombre = JOptionPane.showInputDialog(null, "¿Cómo se llama el documento?");
                        int paginas = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas páginas tiene?"));
                        Documento documento = new Documento(paginas, nombre);
                        gestor.agregarDocumento(documento);
                    }
                    case 2 -> { // Elegir un documento para imprimir.
                        int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué documento quiere imprimir? \n" + gestor.verDocumentosEnCola()));
                        Documento doc = gestor.elegirDocumento(indice);
                        impresora.print(doc);
                    }
                    case 3 -> { // Verificar nivel de tinta.
                        JOptionPane.showMessageDialog(null, "La impresora tiene " + impresora.tinta + "ml");
                    }
                    case 4 -> { // Verificar nivel de papel
                        JOptionPane.showMessageDialog(null, "La impresora tiene " + impresora.papel + " hojas cargadas.");
                    }
                    case 5 -> { // Cargar tinta a la impresora
                        int cantidadTinta = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos cartuchos le quiere cargar?"));
                        impresora.cargarTinta(cantidadTinta * 125);
                        JOptionPane.showMessageDialog(null, "Se ha cargado correctamente.");
                    }
                    case 6 -> { // Cargar papel a la impresora
                        int cantidadPapel = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas hojas le quiere cargar?"));
                        impresora.cargarPapel(cantidadPapel);
                        JOptionPane.showMessageDialog(null, "Se ha cargado correctamente.");
                    }
                    case 7 -> { // Comprobar la conexión de la impresora
                        String conectada = impresora.conectada ? "Está conectada a la PC" : "No está conectada a la PC";
                        JOptionPane.showMessageDialog(null, conectada);
                        String conectadaRed = impresora.conectadaRed ? "Está conectada a la red." : "No está conectada a la red.";
                        JOptionPane.showMessageDialog(null, conectadaRed);
                    }
                    case 8 -> { // Comprobar la conexión a internet de la impresora
                        impresora.conectadaRed = true;
                        impresora.conectada = true;
                        JOptionPane.showMessageDialog(null, "Se ha conectado exitosamente.");
                    }
                    case 0 ->
                    {
                        JOptionPane.showMessageDialog(null, "¡Adios!");
                    }
                    default ->
                    {
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                    }
                }
            } catch (NotConnectedException | NotOnlineException | OutOfPaperException | OutOfInkException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 0);
    }
}
