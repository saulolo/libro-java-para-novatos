package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_7_ContarCifras;

import javax.swing.*;
import java.util.Scanner;

public class ContarCifrasPrueba {

    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "CONTAR CIFRAS");

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número: ");
        int numero = input.nextInt();

        ContarCifras miPrimerNumero = new ContarCifras();

        System.out.println("El número " + numero + " ingresado tiene: " + miPrimerNumero.contarCifras(numero)+
                " Cifras");

        input.close();

    }
}
