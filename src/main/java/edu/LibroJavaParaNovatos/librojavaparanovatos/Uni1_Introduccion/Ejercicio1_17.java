package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */

/*Escribe un programa en Java que genere cinco caracteres al azar. Cuando lo hayas conseguido,
modifícalo para que genere únicamente vocales al azar.
*/
public class Ejercicio1_17 {

    public static void main(String[] args) {

        String into = ("GENERANDO VOCALES Y CARACTERES ALEATORIOS");
        JOptionPane.showMessageDialog(null, into);

        System.out.println(getLetra());
        System.out.println(getLetra());
        System.out.println(getLetra());
        System.out.println(getLetra());
        System.out.println(getLetra());

        System.out.println(getVocal());
        System.out.println(getVocal());
        System.out.println(getVocal());
        System.out.println(getVocal());
        System.out.println(getVocal());
    }

    public static char getLetra() {
        char caracterAleatorio;
        caracterAleatorio = (char) (Math.random() * 26 + 'A');
        return caracterAleatorio;
    }


    public static char getVocal() {
        char car = ' ';
        int aleat = 0;

        aleat = (int)(Math.random() * 10);

        if (aleat == 0) car = 'A';
        if (aleat == 1) car = 'E';
        if (aleat == 2) car = 'I';
        if (aleat == 3) car = 'O';
        if (aleat == 4) car = 'U';
        if (aleat == 5) car = 'a';
        if (aleat == 6) car = 'e';
        if (aleat == 7) car = 'i';
        if (aleat == 8) car = 'o';
        if (aleat == 9) car = 'u';

        return car;
    }

}






