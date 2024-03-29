package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_3_Restar;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */

public class RestarPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "RESTANDO DOS NÚMEROS");

        Restar restar = new Restar();

        System.out.print("Por favor ingresa el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Por favor ingresa el segundo número: ");
        int num2 = input.nextInt();


        System.out.println("La operación de restar el número mayor menos el número menor, es: " +
                restar.calcularResta(num1, num2));

        input.close();
    }

}
