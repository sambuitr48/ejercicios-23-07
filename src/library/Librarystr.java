package library;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Librarystr {
    public int tipo;
    public int dias;
    public int libros;
    public int revistas;

    public void lbr(){
        switch (tipo) {
            default:{
                System.out.println("Opcion invalido...");
            }
            case 1: {
                dias = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias de retraso lleva?"));
                libros = Integer.parseInt(JOptionPane.showInputDialog("Cuantos libros?"));
                revistas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas revistas?"));
                System.out.println("El valor total es: " + ((500 * dias) + (dias * 600 * libros)));
                break;
            }
            case 2: {
                libros = Integer.parseInt(JOptionPane.showInputDialog("Cuantos libros?"));
                revistas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas revistas?"));
                System.out.println("El valor total es: " + ((libros+revistas)*1000));
                break;
            }
        }
    }
}
