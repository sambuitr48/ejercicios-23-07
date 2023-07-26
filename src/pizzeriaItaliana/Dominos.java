package pizzeriaItaliana;

import org.w3c.dom.ls.LSOutput;

public class Dominos {
    public String pedido;
    public int porciones;
    public int valorCompra;
    public String agregarSalsa;

    public void menu(){
        if (pedido.equals("Pizza") || pedido.equals("pizza")){
            valorCompra = 7000*porciones;
            if (agregarSalsa.equals("Si") || agregarSalsa.equals("si")){
                valorCompra += 3000;
            } else {
                System.out.println("El valor de la compra de " + porciones + " porciones de pizza es de " + valorCompra);
            }
        } else if (pedido.equals("Sandwich") || pedido.equals("sandwich")) {
            valorCompra = 5000*porciones;
            if (agregarSalsa.equals("Si") || agregarSalsa.equals("si")){
                valorCompra += 3000;
            } else {
                System.out.println("El valor de la compra de " + porciones + " porciones de sandwich es de " + valorCompra);
            }
        } else if (pedido.equals("Ensalada") || pedido.equals("ensalada")) {
            valorCompra = 15000*porciones;
            if (agregarSalsa.equals("Si") || agregarSalsa.equals("si")){
                valorCompra += 3000;
            } else {
                System.out.println("El valor de la compra de " + porciones + " porciones de ensalada es de " + valorCompra);
            }
        }
    }
}
