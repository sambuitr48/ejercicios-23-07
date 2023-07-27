package examen;

import javax.swing.*;

public class MainTest {
    public static void main(String[] args) {
        Test exam = new Test();
        exam.pregunta1 = JOptionPane.showInputDialog("¿Cuál es el planeta mas grande del sistema solar? \na) Marte \nb) Venus \nc) Jupiter \nd) Saturno");
        exam.pregunta2 = JOptionPane.showInputDialog("¿Cuál es el planeta más cercano al Sol? \na) Mercurio \nb) Venus \nc) Marte \nd) Júpiter");
        exam.pregunta3 = JOptionPane.showInputDialog("¿Cuál de los siguientes planetas es famoso por tener anillos alrededor de él? \na) Mercurio \nb) Venus \nc) Marte \nd) Saturno");
        exam.pregunta4 = JOptionPane.showInputDialog("¿Cuál de los siguientes planetas es conocido como el Planeta Rojo debido a su color característico? \na) Mercurio \nb) Marte \nc) Júpiter \nd) Saturno");
        exam.pregunta5 = JOptionPane.showInputDialog("¿Cuál de las siguientes opciones es una fruta tropical de color verde y forma alargada, con pulpa dulce y cremosa en su interior? \na) Mango \nb) Sandía \nc) Papaya \nd) Manzana");
        exam.resultado();
    }
}
