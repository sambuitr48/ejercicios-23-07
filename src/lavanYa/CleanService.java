package lavanYa;

import javax.swing.*;

public class CleanService {
    public String servicio;
    public String tipoLavado;
    public int cantidadPrendas;
    public int costoServicio;
    public void clService(){
        if (servicio.equals("lavado") || servicio.equals("Lavado")){
            tipoLavado = JOptionPane.showInputDialog("Elija el tipo de lavado: \n 1.Seco \n 2.Normal");
            if (tipoLavado.equals("Seco") || tipoLavado.equals("seco")){
                costoServicio = 2000*cantidadPrendas;
                System.out.println("El costo de su servicio es: "+ costoServicio);
            } else if (tipoLavado.equals("Normal") || tipoLavado.equals("normal")) {
                costoServicio = 1500*cantidadPrendas;
                System.out.println("El costo de su servicio es: "+ costoServicio);
            }
        } else if (servicio.equals("Planchado") || servicio.equals("planchado")){
            costoServicio = 1800*cantidadPrendas+3000;
            System.out.println("El costo de su servicio es: "+ costoServicio + " Se cobran 3000 pesos mas por el domicilio");
        } else {
            System.out.println("Ese servicio no lo trabajamos...");
        }
    }
}
