package Excepciones.Punto_5;

import javax.swing.*;

public class Printer {
    public int papel = 0;
    public double tinta = 0;
    public boolean conectada;
    public boolean conectadaRed;
    public void cargarTinta(double tinta) {
        this.tinta = this.tinta + tinta;
    }

    public void cargarPapel (int papel) {
        this.papel = this.papel + papel;
    }

    public void conectar() {
        this.conectada = true;
        JOptionPane.showMessageDialog(null, "La impresora está conectada.");
    }

    public void desconectar() {
        this.conectada = false;
        JOptionPane.showMessageDialog(null, "La impresora está desconectada.");
    }

    public void online(){
        this.conectadaRed = true;
        JOptionPane.showMessageDialog(null, "La impresora está conectada a internet.");
    }

    public void offline() {
        this.conectada = false;
        JOptionPane.showMessageDialog(null, "La impresora está desconectada de internet.");
    }

    public void print(Documento documento) throws NotConnectedException, OutOfInkException, OutOfPaperException, NotOnlineException {
        if(!this.conectada) {
            throw new NotConnectedException();
        } else {
            if (!this.conectadaRed) {
                throw new NotOnlineException();
            } else {
                if (this.tinta <= 0.00) {
                    throw new OutOfInkException();
                } else {
                    if (this.papel <= 0) {
                        throw new OutOfPaperException();
                    } else {
                        if (this.papel < documento.getHojas() || this.tinta < 0.008 * documento.getHojas()) {
                            int paginasImpresas = 0;
                            while (this.papel != 0 && this.tinta >= 0.008) {
                                if(paginasImpresas != documento.getHojas()) {
                                    this.papel = this.papel - 1;
                                    this.tinta = this.tinta - 0.008;
                                    paginasImpresas++;
                                } else {
                                    break;
                                }
                            }
                            JOptionPane.showMessageDialog(null, "Se ha impreso un total de: " + paginasImpresas + " de las " + documento.getHojas() + " páginas del documento. Se han utilizado: " + tinta + "ml de tinta.");
                        }
                    }
                }
            }
        }
        this.papel = this.papel - documento.getHojas();
        this.tinta = this.tinta - (0.008 * documento.getHojas());
        JOptionPane.showMessageDialog(null, "Se ha impreso el documento.");
    }
}
