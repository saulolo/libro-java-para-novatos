package edu.LibroJavaParaNovatos.librojavaparanovatos.uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */

/* Se tienen dos variables, a y b. Escribe las asignaciones necesarias para intercambiar sus
valores, sean cuales sean.

*/
public class Ejercicio1_9 {

    public static void main(String[] args) {

        String into = ("INTERCAMBIO DE VALORES");
        JOptionPane.showMessageDialog(null, into);

        int a, b, aux;
        // Asignamos un valor inicial (cualquiera) a las variables a y b
        a = 2;
        b = 6;
        // Intercambiamos los valores con ayuda de la variable auxiliar
        aux = a;
        a = b;
        b = aux;
        // Comprobamos que ha ido bien mostrando el valor de a y b
        System.out.println("a = " + a + ", b = " + b);

    }
}
