package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_5_ParteDecimal;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */
public class ParteDecimalPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String titulo = "CALCULO PARTE DECIMAL";
        JOptionPane.showMessageDialog(null, titulo);

        System.out.println("Introduce un número, por favor: ");
        int num = input.nextInt();

        ParteDecimal parteDecimal = new ParteDecimal();

        System.out.println(parteDecimal.calcularParteDecimal(num));

        input.close();
    }

}
