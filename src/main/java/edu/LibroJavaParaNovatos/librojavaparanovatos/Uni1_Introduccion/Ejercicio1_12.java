package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */

/* A continuación te presentamos varios fragmentos de código. Se trata de que, para cada uno
de ellos, intentes averiguar (antes de probarlo) si ese código funcionaría o no funcionaría
una vez tecleado. En caso de que no funcione, intenta averiguar por qué. Y, en caso de que
funcione, intenta predecir cuál será la salida por consola. Luego puedes probarlo en el
compilador de java para ver si estabas en lo cierto o no.
A)
int a = 'a';
System.out.println(a);
B)
int pi = 3.14;
System.out.println(pi);
C)
double pi = 3,14;
System.out.println(pi);
D)
boolean adivina = (1 == 4);
System.out.println(adivina);
E)
boolean adivina = (1 == 'a' == 1);
System.out.println(adivina);
F)
boolean adivina = (97 == 'a' == 97);
System.out.println(adivina);
G)
boolean adivina = ((97 == 'a') && true);
System.out.println(adivina);
H)
int a = 1;
int b == a > 1;
System.out.println(b);
I)
byte a = 200;
System.out.println(a);
*/
public class Ejercicio1_12 {

    public static void main(String[] args) {

        String into = ("¿FUNCIONA O NO FUNCIONA?");
        JOptionPane.showMessageDialog(null, into);

        //A) => Funciona
        //int a = 'a';
        //System.out.println(a);
        //B) => No funciona
        //int pi = 3.14;
        //System.out.println(pi);
        //C) => No funciona
        //double pi = 3,14;
        //System.out.println(pi);
        //D) => Funciona
        //boolean adivina = (1 == 4);
        //System.out.println(adivina);
        //E) => No funciona
        //boolean adivina = (1 == 'a' == 1);
        // System.out.println(adivina);
        //F) => No funciona
        //boolean adivina = (97 == 'a' == 97);
        //System.out.println(adivina);
        //G) => Funciona
        //boolean adivina = ((97 == 'a') && true);
        //System.out.println(adivina);
        //H) => No funciona
        //int a = 1;
        //int b == a > 1;
        //System.out.println(b);
        //I) => No funciona
        //byte a = 200;
        //System.out.println(a);

    }
}
