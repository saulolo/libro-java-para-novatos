package edu.LibroJavaParaNovatos.librojavaparanovatos.uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */

/* Se tienen las siguientes variables: a y b de tipo entero; c y d de tipo real; e y f de
tipo carácter; y g de tipo lógico. Señala cuáles de las siguientes asignaciones no son válidas
y por qué:
a) a = 20; b) b = 5500; c) e = ‘f’;
d) g = true; f) b = 12; g) c = 0;
h) e = f; i) g = “false”; j) f = ‘0’;
k) d = c l) a = 12.56; m) f = g;

*/
public class Ejercicio1_7 {

    public static void main(String[] args) {

        String into = ("ASIGNACIONES SOSPECHOSAS");
        JOptionPane.showMessageDialog(null, into);

/*
        a) Correcto
        b) Correcto
        c) Correcto
        d) Correcto
        f) Correcto
        g) Correcto, pero problemático: se intenta asignar un entero a un real (funcionará por conversión implícita)
        h) Correcto
        i) Incorrecto: se intenta asignar un String a un boolean.
        j) Correcto
        k) Correcto
        l) Incorrecto: se intenta asignar un real a un entero.
        m) Incorrecto: se intenta asignar un boolean a un carácter.

*/
        
    }
}
