package Persistencia.Punto_2;

import javax.swing.*;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class ArchivoPersonas {
    RandomAccessFile archivo;
    File file;
    String nombre;
    public ArchivoPersonas(String nombre) throws FileNotFoundException {
        this.file = new File(nombre);
        this.archivo = new RandomAccessFile(file, "rw");
    }

    public void escribirPersona(Persona persona) {
        String nombre = "";
        try {
            if (persona.getNombre().length() > 10) {
                nombre = persona.getNombre().substring(0, 9);
            } else if (persona.getNombre().length() <= 10) {
                nombre = String.format("%-" + 10 + "s", persona.getNombre());
            }
            int dni = persona.getDni();
            double altura = persona.getAltura();
            if (archivo.length() > 0) {
                archivo.seek(archivo.length());
            }
            archivo.writeUTF(nombre);
            archivo.writeInt(dni);
            archivo.writeDouble(altura);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en entrada/salida");
        }
    }

    public void buscarPersona(int dni) {
        long aux = -1;
        try {
            boolean encontrado = false;
            archivo.seek(0);
            while (archivo.getFilePointer() <= archivo.length() && !encontrado) {
                String nombre = archivo.readUTF();
                if (dni == archivo.readInt()) {
                    aux = archivo.getFilePointer() - 4L;
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Se ha encontrado la persona: " + nombre);
                }
            }
            if (aux == -1) JOptionPane.showMessageDialog(null, "No se encuentra esta persona en el archivo.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en entrada/salida");
        }
    }

    public String leerPersonas() {
        String textoMensaje = "Las personas son: \n";
        try {
            Vector<Persona> personas = new Vector<>();
            archivo.seek(0L);
            while (archivo.getFilePointer() < archivo.length()) {
                String nombre = archivo.readUTF();
                int dni = archivo.readInt();
                double altura = archivo.readDouble();
                Persona persona = new Persona(nombre, dni, altura);
                personas.add(persona);
            }
            for (Persona persona : personas) {
                textoMensaje = textoMensaje + "> " + persona.getNombre() + ", dni: " + persona.getDni() + " con altura: " + persona.getAltura() + "\n";
            }
            return textoMensaje;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error consulta E/S");
        }
        return "No se ha podido leer";
    }

    public String calcularAlturaPromedio() {
        String textoMensaje = "La altura promedio es de: ";
        double total = 0;
        try {
            Vector <Persona> personas = new Vector<>();
            archivo.seek(0L);
            while (archivo.getFilePointer() < archivo.length()) {
                String nombre = archivo.readUTF();
                int dni = archivo.readInt();
                double altura = archivo.readDouble();
                Persona persona = new Persona(nombre, dni, altura);
                personas.add(persona);
            }
            for (Persona persona : personas) {
                total = total + persona.getAltura();
            }
            return textoMensaje + (total / personas.size());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error consulta E/S");
        }
        return "No se pudo leer";
    }

    public void guardarEnArchivoMayor160cm () {
        try {
            try (RandomAccessFile auxiliar = new RandomAccessFile("auxiliar.dat", "rw")) {
                while(archivo.getFilePointer() < file.length())
                {
                    String nombre = archivo.readUTF();
                    int dni = archivo.readInt();
                    double altura = archivo.readDouble();
                    if (altura >= 1.60) {
                        try {
                            if (auxiliar.length() > 0) {
                                auxiliar.seek(auxiliar.length());
                            }
                            auxiliar.writeUTF(nombre);
                            auxiliar.writeInt(dni);
                            auxiliar.writeDouble(altura);
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error en entrada/salida");
                        }
                    }
                }
            } catch (HeadlessException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo");
        }
    }

    public String leerPersonasAltas() {
        String textoMensaje = "Las personas son: \n";
        try {
            try (RandomAccessFile auxiliar = new RandomAccessFile("auxiliar.dat", "rw")) {
                Vector<Persona> personas = new Vector<>();
                auxiliar.seek(0L);
                while (auxiliar.getFilePointer() < auxiliar.length()) {
                    String nombre = auxiliar.readUTF();
                    int dni = auxiliar.readInt();
                    double altura = auxiliar.readDouble();
                    Persona persona = new Persona(nombre, dni, altura);
                    personas.add(persona);
                }
                for (Persona persona : personas) {
                    textoMensaje = textoMensaje + "> " + persona.getNombre() + ", dni: " + persona.getDni() + " con altura: " + persona.getAltura() + "\n";
                }
            }
            return textoMensaje;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error consulta E/S");
        }
        return "No se ha podido leer";
    }
}
