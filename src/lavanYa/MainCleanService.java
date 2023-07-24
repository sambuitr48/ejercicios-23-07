package lavanYa;

import javax.swing.*;

public class MainCleanService {
    public static void main(String[] args) {
        CleanService service = new CleanService();
        service.servicio = JOptionPane.showInputDialog("Elija el servicio que desea: \n 1.Lavado \n 2.Planchado");
        service.cantidadPrendas = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad de prendas que desees lavar: "));
        service.clService();
    }
}
