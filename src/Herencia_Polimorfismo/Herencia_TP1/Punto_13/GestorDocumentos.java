package Herencia_Polimorfismo.Herencia_TP1.Punto_13;

import javax.swing.*;
import java.util.Vector;

public class GestorDocumentos {
    Vector<Documento> documentos;
    Vector<Consulta> consultas;

    public GestorDocumentos() {
        documentos = new Vector<Documento>(10);
        consultas = new Vector<Consulta>(10);
    }

    public void anhadirDocumento(Documento doc) {
        documentos.add(doc);
        JOptionPane.showMessageDialog(null, "Documento añadido con éxito.");
    }

    public String mostrarDocumentosTotales() {
        String textoMensaje = "";
        for (Documento documento : documentos) {
            textoMensaje = textoMensaje + "> " + documento.titulo + " de " + documento.autor + " de la editorial " + documento.editorial + "\n";
        }
        return textoMensaje;
    }

    public String mostrarDocumentosParaPrestar() {
        String textoMensaje = "";
        for (Documento documento : documentos) {
            if(documento.sePresta){
                textoMensaje = textoMensaje + "> " + documento.titulo + " de " + documento.autor + " de la editorial " + documento.editorial + "\n";
            }
        }
        return textoMensaje;
    }

    public void anhadirConsulta(Consulta con) {
        consultas.add(con);
        JOptionPane.showMessageDialog(null, "Consulta confirmada.");
    }

}
