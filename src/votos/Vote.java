package votos;

import javax.swing.*;

public class Vote {
    public int votos;
    public Integer elegido;
    public int votosAna;
    public int votosDiego;
    public int votoActual;

    public void elect (){
        while(votos<=10){
            elegido = Integer.parseInt(JOptionPane.showInputDialog("Elija a su candidato con respecto al número: \n 1. Ana \n 2. Diego"));
            if(elegido.equals(1)){
                votosAna++;
                votoActual++;
            } else if (elegido.equals(2)) {
                votosDiego++;
                votoActual++;
            } else {
                System.out.println("Ese candidato no existe");
            }
        } if (votoActual>10){
            if (votosAna>votosDiego){
                System.out.println("El ganador es Ana");
            } else if (votosAna<votosDiego) {
                System.out.println("El ganador es diego");
            } else {
                System.out.println("Han empatado");
            }
        }
    }
}
