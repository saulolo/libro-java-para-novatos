package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_6;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */

public class NumerosOrdenadosPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "INDICA EL NÚMERO MENOR");

        System.out.println("Ingresa tres números y el programa te indicará cual es el menor de ellos.");
        System.out.print("Ingresa el numero 1: ");
        int X = input.nextInt();
        System.out.print("Ingresa el numero 2: ");
        int Y = input.nextInt();
        System.out.print("Ingresa el numero 3: ");
        int Z = input.nextInt();

        NumerosOrdenados miPrimerNum = new NumerosOrdenados();
        miPrimerNum.setNumeros(X, Y, Z);

        if (miPrimerNum.estanOrdenados()) System.out.println("Los números estan ordenados.");
        else System.out.println("Los números NO estan ordenados");

        if (miPrimerNum.sonConsecutivos()) System.out.println("Los números son consecutivos.");
        else  System.out.println("Los números NO son consecutivos.");
    }
}
