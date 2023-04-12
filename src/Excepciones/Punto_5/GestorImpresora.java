package Excepciones.Punto_5;

import javax.swing.*;
import java.util.Vector;

public class GestorImpresora {
    Vector<Documento> documentos;
    public GestorImpresora() {
        documentos = new Vector<Documento>(10);
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
        JOptionPane.showMessageDialog(null, "Documento agregado. ");
    }

    public String verDocumentosEnCola() {
        String textoMensaje = "";
        for (Documento doc: documentos) {
            textoMensaje = textoMensaje + "> " + doc.getNombre() + " de " + doc.getHojas() + " páginas. \n";
        }
        return textoMensaje;
    }

    public Documento elegirDocumento(int indice) {
        return documentos.elementAt(indice);
    }
}
