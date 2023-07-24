package suCasa;

import javax.swing.*;

public class MainHouse {
    public static void main(String[] args) {
        House nhs = new House();
        nhs.houseValue = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la vivienda"));
        nhs.houseType = JOptionPane.showInputDialog("Escriba 'Nuevo' si busca una vivienda nueva o 'Usado' si busca una vivirnda usada");
        nhs.houseCost();
    }
}
