package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni3_EstructurasDeControlYCalidadSoft.ejercicio3_3;

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

        System.out.println("Por favor ingresa el primer número: ");
        int num1 = input.nextInt();

        System.out.println("Por favor ingresa el segundo número: ");
        int num2 = input.nextInt();


        System.out.println("La operación de restar el número mayor menos el número menor, es: " +
                restar.calcularResta(num1, num2));

    }

}
