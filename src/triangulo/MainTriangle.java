package triangulo;

import javax.swing.*;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle equi = new Triangle();
        equi.lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la magnitud del lado 1"));
        equi.lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la magnitud del lado 2"));
        equi.lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la magnitud del lado 3"));
        equi.result();
    }
}
