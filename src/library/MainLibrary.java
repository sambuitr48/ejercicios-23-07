package library;

import javax.swing.*;

public class MainLibrary {
    public static void main(String[] args) {
        Librarystr cite = new Librarystr();
        cite.tipo = Integer.parseInt(JOptionPane.showInputDialog("Elija el tipo de cita: \n 1. Devolver \n 2. Perdida"));
        cite.lbr();
    }
}
