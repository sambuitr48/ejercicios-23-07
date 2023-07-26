package pizzeriaItaliana;

import javax.swing.*;

public class MainDominos {
    public static void main(String[] args) {
        Dominos venta = new Dominos();
        venta.pedido = JOptionPane.showInputDialog("¿Qué deseas ordenar? \n 1. Pizza \n 2. Sandwich \n 3. Ensalada");
        venta.porciones = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas porciones deseas ordenar?"));
        venta.agregarSalsa = JOptionPane.showInputDialog("Deseas incluir salsa por un vallor de 3000? \n 1. Si \n 2. No");
        venta.menu();
    }
}
