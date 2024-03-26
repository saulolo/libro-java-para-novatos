package edu.LibroJavaParaNovatos.librojavaparanovatos.uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */

/*Escribe un programa que calcule el área y la circunferencia de un círculo cuyo radio estará
almacenado en una variable entera llamada r. Tal vez necesites buscar las fórmulas para
calcular ambas magnitudes. Comprueba que el programa funciona correctamente para cualquier
valor de r. La salida del programa, para r = 5, debería ser algo parecido a esto:
Radio: 5.
Longitud de circunferencia: 31,42
Área de círculo: 78,54
*/

public class Ejercicio1_16 {

    public static void main(String[] args) {

        /**
         * La clase Ejercicio1_16 calcula y muestra
         * el área y el perímetro de una circunferencia.
         * El radio se lee por consola.
         */
        String into = ("ÁREA Y CIRCUNFERENCIA DE UN CÍRCULO");
        JOptionPane.showMessageDialog(null, into);

        /**
         * Calcula el área y el perímetro de un círculo
         */
        double area;
        double circunf;
        String input = JOptionPane.showInputDialog("Ingrese el radio de la circunferencia: ");
        double radio = Double.parseDouble(input);

        area = calculaArea(radio);
        circunf = calculaCircunferencia(radio);
        muestraResultado(radio, area, circunf);
    }

    /**
     * Calcula el área de un círculo
     *
     * @param  r  el radio del círculo
     * @return    el área del círculo
     */
    public static double calculaArea(double r) {
        double a = Math.PI * (r * r);
        return a;
    }

    /**
     * Calcula el perímetro de un círculo
     *
     * @param  r  el radio del círculo
     * @return    el perímetro del círculo
     */
    public static double calculaCircunferencia(double r) {
        double c = 2 * Math.PI * r;
        return c;
    }

    /**
     * Muestra el resultado
     *
     * @param  r       el radio del círculo
     * @param  area    el área del círculo
     * @param  circunf la longitud de la circunferencia
     */
    public static void muestraResultado(double r, double area, double circunf) {
        JOptionPane.showMessageDialog(null, "Radio: " + r);
        JOptionPane.showMessageDialog(null, "Área: " + area);
        JOptionPane.showMessageDialog(null, "Circunferencia: " + circunf);

    }

}



