package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_10_Impares;

import edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_9_Pares.Pares;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */
public class ImparesPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "HALLE TODOS LOS NUMEROS IMPARES ENTRE DOS NÚMEROS");

        System.out.print("Ingrese el primer número: ");
        int A = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int B = input.nextInt();

        Impares miNumeroImpar = new Impares();
        miNumeroImpar.numerosImpares(A, B);
    }
}
