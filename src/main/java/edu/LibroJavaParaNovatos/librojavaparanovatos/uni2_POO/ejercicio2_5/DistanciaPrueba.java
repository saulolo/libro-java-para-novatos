package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_5;

import javax.swing.*;

/**
 * @author Saulolo
 */

public class DistanciaPrueba {

    public static void main(String[] args) {


        // 1. Leer una cantidad de millas por teclado
        System.out.println("Introduce una cantidad de millas: ");
        String input = JOptionPane.showInputDialog("Introduce una cantidad de millas: ");
        double millas = Double.parseDouble(input);

        Distancia distancia = new Distancia();

        //2. Convertir las millas a metros y guardarlo en una variable.
        double metros = distancia.millasAMetros(millas);

        //3. Convertir las millas a km y guardarlo en otra variable.
        double km = distancia.millasAKilometros(millas);

        //4. Mostrar los metros y y los Km.
        JOptionPane.showMessageDialog(null, "Las " + millas + " millas ingresadas en metros es: " + metros);
        JOptionPane.showMessageDialog(null, "Las " + millas + " millas ingresadas en kilometros es: " + km);


        Distancia conversion1 = new Distancia();

        System.out.println("PROBANDO EL MÉTODO millasAMetros");
        System.out.println("El equivalente de 300 millas a metros es: " + conversion1.millasAMetros(300));

        System.out.println("PROBANDO EL MÉTODO kilometrosAMetros");
        System.out.println("El equivalente de 25 millas a kilometros es: " + conversion1.millasAKilometros(25));



    }


}
