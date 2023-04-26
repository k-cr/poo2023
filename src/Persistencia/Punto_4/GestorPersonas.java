package Persistencia.Punto_4;

import javax.swing.*;
import java.io.*;
import java.util.Vector;

public class GestorPersonas implements Serializable {
    String nombreArchivo;
    Vector<Persona> personas;
    public GestorPersonas() {
        personas = new Vector<>(10);
    }

    public void addPerson(Persona persona) {
        personas.add(persona);
        JOptionPane.showMessageDialog(null, "Persona agregada.");
    }

    public void removePerson(String n) {
        boolean encontrado = false;
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.elementAt(i);
            if (persona.getNombre().equals(n)) {
                personas.remove(i);
                JOptionPane.showMessageDialog(null, "Persona removida");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) JOptionPane.showMessageDialog(null, "No se ha encontrado a " + n);
    }

    public void searchPerson(String n) {
        boolean encontrado = false;
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.elementAt(i);
            if (persona.getNombre().equals(n)) {
                JOptionPane.showMessageDialog(null, "Persona encontrada: " + persona.getNombre());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) JOptionPane.showMessageDialog(null, "No se ha encontrado a " + n);
    }
    public void guardarPersonas(Vector<Persona> personas) {
        try {
            FileOutputStream fileout = new FileOutputStream("personasNuevas.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeInt(personas.size());
            for (Persona persona : personas) {
                out.writeObject(persona);
            }
            out.close();
            JOptionPane.showMessageDialog(null, "Personas guardadas.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en entrada / salida");
        }
    }

    public Vector<Persona> leerPersonas () {
        Vector<Persona> personasLeidas = new Vector<>();
        try {
            FileInputStream fileIn = new FileInputStream("personasNuevas.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            int dimension = in.readInt();
            for (int i = 0; i < dimension; i++) {
                personasLeidas.add((Persona) in.readObject());
            }
            in.close();
            fileIn.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en entrada / salida");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error en la clase");
        }
        return personasLeidas;
    }

    public String listarPersonas() {
        Vector<Persona> personas = this.leerPersonas();
        String textoMensaje = " ";
        for (Persona person : personas) {
            textoMensaje = textoMensaje + "> " + person.getNombre() + ", dni " + person.getDni() + "\n";
        }
        return textoMensaje;
    }

    public void guardarContenedor(String file) {
        try {
            FileOutputStream fileout = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(this.personas);
            out.close();
            JOptionPane.showMessageDialog(null, "Contenedor guardado.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en entrada / salida");
        }
    }

    public void traerContenedor(String file) {
        Vector<Persona> personasLeidas = new Vector<>();
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            personasLeidas = (Vector<Persona>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en entrada / salida");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error en la clase");
        } finally {
            String textoMensaje = " ";
            for (Persona person : personas) {
                textoMensaje = textoMensaje + "> " + person.getNombre() + ", dni " + person.getDni() + "\n";
            }
            JOptionPane.showMessageDialog(null, textoMensaje);
        }
    }
}
