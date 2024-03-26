package edu.LibroJavaParaNovatos.librojavaparanovatos.uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */

/* ¿Cuál es la salida por pantalla de cada una de estas secuencias de asignaciones?
A)
int a, b, c;
a = 3;
b = 4;
c = a + 2 * b;
c = c + b;
b = c – a;
a = b * c;
System.out.println(a + b + c);

B)
double x;
x = 2.0;
x = Math.pow((x + x), 2);
x = Math.sqrt(x + Math.sqrt(x) + 5);
System.out.println(x);

C)
int x, y;
boolean z;
x = 5;
y = x – 2;
x = y * y + 1;
z = (x > (y + 5));
System.out.println("x vale " + x + ", y vale " + y + " y z vale " + z);

D)
int a, b;
a = 10;
b = 5;
a = b;
b = a;
System.out.println(a + b);

*/
public class Ejercicio1_8 {

    public static void main(String[] args) {

        String into = ("ASIGNACIONES LIOSAS");
        JOptionPane.showMessageDialog(null, into);

/*
        A) a = 180, b = 12, c = 15. En la pantalla aparecerá el número 207.
        B) x = 5. En la pantalla aparecerá 5.0
        C) x = 10, y = 3, z = verdadero. En la pantalla aparecerá: “x vale 10, y vale 3 y z vale true”
        D) a = 5, b = 5. En la pantalla aparecerá 10.

*/
        
    }
}
