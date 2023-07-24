package sticker;

public class StickerStore {
    public String tamañoSticker;
    public int cantidadSticker;
    public int costoCompra;

    public void compraSticker(){
        if (tamañoSticker.equals("pequeño")||tamañoSticker.equals("Pequeño")){
            costoCompra = 4000*cantidadSticker;
            System.out.println("El costo total de la compra de: " + cantidadSticker + " stickers pequeños es de " + costoCompra);
        } else if (tamañoSticker.equals("grande") || tamañoSticker.equals("Grande")){
            costoCompra = 6000*cantidadSticker;
            System.out.println("El costo total de la compra de: " + cantidadSticker + " stickers grandes es de " + costoCompra);
        }
    }

}
