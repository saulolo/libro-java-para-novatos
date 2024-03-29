package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_4_AnioBisiesto;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author : Saulolo
 */

public class AnioBisiestoPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "CALCULO AÑO BISIESTO");

        AnioBisiesto anioBisiesto = new AnioBisiesto();

        System.out.println("Por favor ingresa un año: ");
        int ano = input.nextInt();

        System.out.println(anioBisiesto.calcularAnioBisiesto(ano));

        input.close();
    }

}
