package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_9_Pares;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */
public class ParesPrueba {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "HALLE TODOS LOS NUMEROS PARES ENTRE DOS NÚMEROS");

        System.out.print("Ingrese el primer número: ");
        int A = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int B = input.nextInt();

        Pares misPares = new Pares();

        misPares.numerosPares(A, B);

    }
}
