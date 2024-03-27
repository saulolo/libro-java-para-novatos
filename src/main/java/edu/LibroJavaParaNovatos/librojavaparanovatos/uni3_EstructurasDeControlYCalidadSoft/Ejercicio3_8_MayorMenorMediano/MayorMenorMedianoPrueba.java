package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_8_MayorMenorMediano;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */

public class MayorMenorMedianoPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "TAMAÑO DE 3 NÚMEROS");

        MayorMenorMediano miPrimerNumero = new MayorMenorMediano();

        System.out.println("Ingresa tres números para clasificarlos según su tamaño.");
        System.out.print("Ingresa el primer número: ");
        int A = input.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int B = input.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int C = input.nextInt();

        System.out.println(miPrimerNumero.determinarTamanioNumero(A, B, C));

        input.close();
    }
}
