package Persistencia.Punto_1;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class ArchivoEnteros {
    RandomAccessFile archivo;
    File file;
    String nombre;
    public ArchivoEnteros(String nombre) throws FileNotFoundException {
        this.file = new File(nombre);
        this.archivo = new RandomAccessFile(file, "rw");
    }

    public void escribirEntero(int entero) {
        try {
            if (archivo.length() > 0) {
                archivo.seek(archivo.length());
            }
            archivo.writeInt(entero);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en entrada/salida");
        }
    }

    public void aumentarImpares_Menores53() {
        try
        {
            try (RandomAccessFile file = new RandomAccessFile("numeros.dat", "rw")) {
                file.seek(0);
                while(file.getFilePointer() < file.length())
                {
                    int numero = file.readInt();
                    if (numero %2 != 0 && numero < 53) {
                        int numeroAumentado = numero + 2;
                        file.seek(file.getFilePointer() - 4);
                        file.writeInt(numeroAumentado);
                    }
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No se encontró el archivo.");
        }
        catch(IOException e)
        {
            System.out.println("Ocurrió un error de Entrada/Salida.");
        }
    }

    public void buscarEntero(int entero) {
        long aux = -1;
        try {
            boolean encontrado = false;
            archivo.seek(0);
            while (archivo.getFilePointer() <= archivo.length() && !encontrado) {
                if (entero == archivo.readInt()) {
                    aux = archivo.getFilePointer() - 4L;
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Se ha encontrado el número en la posición: " + archivo.getFilePointer());
                }
            }
            if (aux == -1) JOptionPane.showMessageDialog(null, "No se encuentra este entero en este archivo.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en entrada/salida");
        }
    }

    public String calcularPromedio() {
        String textoMensaje = "El promedio es de: ";
        int total = 0;
        try {
            Vector<Integer> enteros = new Vector<Integer>();
            archivo.seek(0L);
            while (archivo.getFilePointer() < archivo.length()) {
                enteros.add(archivo.readInt());
            }
            for (Integer entero : enteros) {
                total += entero;
            }
            return textoMensaje + (total / enteros.size());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error consulta E/S");
        }
        return "No se ha podido leer.";
    }

    public String mostrarEnterosOrdenados() {
        String textoMensaje = "Los enteros son: ";
        try {
            Vector<Integer> enteros = new Vector<Integer>();
            archivo.seek(0L);
            while (archivo.getFilePointer() < archivo.length()) {
                enteros.add(archivo.readInt());
            }
            enteros.sort(null);
            for (Integer entero : enteros) {
                textoMensaje = textoMensaje + "> " + entero +"\n";
            }
            return textoMensaje;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error consulta E/S");
        }
        return "No se ha podido leer.";
    }

    public String leerEnteros() {
        String textoMensaje = "Los enteros son: ";
        try {
            Vector<Integer> enteros = new Vector<Integer>();
            archivo.seek(0L);
            while (archivo.getFilePointer() < archivo.length()) {
                enteros.add(archivo.readInt());
            }
            for (Integer entero : enteros) {
                textoMensaje = textoMensaje + "> " + entero +"\n";
            }
            return textoMensaje;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error consulta E/S");
        }
        return "No se ha podido leer.";
    }
}
