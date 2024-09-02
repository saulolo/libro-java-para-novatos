package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_21_Primo;

import java.util.Scanner;

/**
 * @author Saulolo
 */
public class PrimoMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor introduce un número: ");
        int numeroIntroducido = input.nextInt();

        Primo miPrimo = new Primo();
        String resultado;

        if (!miPrimo.esPrimo(numeroIntroducido)) {
            resultado = "El número introducido no es primo";
        } else {
            resultado = "El número introducido es primo.";

        }

        System.out.println(resultado);

    }

}
