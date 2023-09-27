package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */

/* Teclea y ejecuta este programa. ¿Qué es lo que ocurre? ¿Qué son esos caracteres que
aparecen en la consola al ejecutarlo?
No olvides que el nombre del archivo debe coincidir con el de la clase, pero en minúsculas.
Es decir, el archivo con el código debe llamarse generaletras.java
class GeneraLetras {
 public static char getLetra() {
  return (char) (Math.random()*26 + 'a');
 }
 public static void main(String[] args) {
  System.out.println(getLetra());
  System.out.println(getLetra());
  System.out.println(getLetra());
  System.out.println(getLetra());
 }
}
*/
public class Ejercicio1_11 {

    public static void main(String[] args) {

        String into = ("GENERADOR DE LETRAS");
        JOptionPane.showMessageDialog(null, into);

        /*
        El programa muestra cuatro caracteres en minúscula generados al azar.
        La ejecución comienza por main(), como siempre. Dentro de main() se imprime en la
        pantalla, con println(), el resultado de invocar un método llamado getLetra(). Ese
        método genera un número aleatorio entre 26 (de 0 y 25, incluyendo el 0, es decir, 26
        posibles números aleatorios) y le suma el código ASCII del carácter 'a', que es 65.
        Devuelve el resultado de esa suma (return) a main(), que se encarga de mostarlo por la
        pantalla (println) Si, por ejemplo, aleatoriamente se genera el número 5, la expresión
        Math.random()*26 + 'a' sumará 5 al código ASCII de la 'a', es decir, calculará 5 + 65.
        Ese es el código ASCII de la quinta letra del alfabeto inglés (la 'e'), y eso será lo que
        se devuelva a main() y lo que se imprima en la pantalla.
        Si aleatoriamente se genera otro número, como, por ejemplo, el 6, la suma será 6 + 65,
        es decir, 71, que corresponde al sexto carácter el alfabeto, la letra 'f'. Y así
        sucesivamente.
        Si se generase el número 0 (el más pequeño posible que se puede generar con la expresión
        del programa), el cálculo sería 0 + 65, es decir, 65: la letra 'a'. Y si se generase el
        número 25 (el más grande posible en nuestro programa), el cálculo sería 25 + 65, es decir,
        90, que se corresponde con la letra 'z', la última del alfabeto.
        Por eso, sea cual sea el número aleatorio que produzca la llamada a Math.random(), siempre s
        Se genera un número entre 65 (letra 'a') y 90 (letra 'z').
        Fíjate como, en el return, se hace una conversión explícita o casting: se obliga a
        convertir ese número a un carácter. Por eso lo que vemos es el carácter correspondiente al
        número y no el número mismo.
        Y eso ocurre cuatro veces, una por cada llamada a getLetra() que se produce en el método
        main(). Por eso aparecen cuatro caracteres al azar entre la a y la z minúsculas.
         */

    }
}
