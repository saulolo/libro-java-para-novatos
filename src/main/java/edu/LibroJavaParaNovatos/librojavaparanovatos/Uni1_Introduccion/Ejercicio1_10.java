package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni1_Introduccion;

import javax.swing.*;
/**
 *@author Saulolo
 */

/* Se tienen tres variables, a, b y c. Escribe las asignaciones necesarias para intercambiar
sus valores, sean cuales sean, de manera que:
b tome el valor de a
c tome el valor de b
a tome el valor de c
*/
public class Ejercicio1_10 {

    public static void main(String[] args) {

        String into = ("INTERCAMBIO DE VALORES A TRES BANDAS");
        JOptionPane.showMessageDialog(null, into);

        int a, b, c, aux;
        // Asignamos un valor inicial (cualquiera) a las variables
        a = 2;
        b = 7;
        c = 4;
        // Intercambiamos sus valores con ayuda de la variable aux
        aux = a;
        a = c;
        c = b;
        b = aux;
        // Comprobamos que ha ido bien mostrando el valor de a, b y c
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

    }
}
