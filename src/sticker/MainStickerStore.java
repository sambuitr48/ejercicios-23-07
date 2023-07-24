package sticker;

import javax.swing.*;

public class MainStickerStore {
    public static void main(String[] args) {
        StickerStore stickercmp = new StickerStore();
        stickercmp.tamañoSticker = JOptionPane.showInputDialog("Elija el tamaño: \n 1. Grande \n 2. Pequeño");
        stickercmp.cantidadSticker = Integer.parseInt(JOptionPane.showInputDialog("Elija la cantidad de stickers"));
        stickercmp.compraSticker();
    }
}
