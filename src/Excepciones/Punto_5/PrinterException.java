package Excepciones.Punto_5;

import javax.swing.*;

public class PrinterException {
    public void Print(Printer printer, Documento documento) {
        try {
            printer.print(documento);
        } catch (NotConnectedException | OutOfInkException | OutOfPaperException | NotOnlineException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
