package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_11_ParesONones;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */
public class ParesONonesPrueba {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "MOSTRANDO PARES O IMPARES");

        Scanner input = new Scanner(System.in);

        ParesONones miNumeroParImpar = new ParesONones();

        System.out.print("Desea ver un número par o impar? (par/impar): ");
        String par = input.nextLine();

        System.out.print("Ingrese el primer número: ");
        int A = input.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int B = input.nextInt();

        /* SOLUCIÓN 1 */
       // miNumeroParImpar.ParesONones(A, B, par);

        /* SOLUCIÓN 2 */
        miNumeroParImpar.ParesONones2do(A, B, par);
    }
}
