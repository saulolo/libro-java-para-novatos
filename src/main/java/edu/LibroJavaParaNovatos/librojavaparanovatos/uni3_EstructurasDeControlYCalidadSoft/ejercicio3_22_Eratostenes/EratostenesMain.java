package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_22_Eratostenes;

import java.util.Scanner;

public class EratostenesMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor introduzca un número: ");
        int numeroIntroducido = input.nextInt();

        if (numeroIntroducido < 2 || numeroIntroducido > 1000) {
            System.out.println("El número introducido debe estar entre 2 y 1000.");
            return;
        }


        Eratostenes miEratostenes = new Eratostenes();
        boolean[] esPrimo = miEratostenes.cribaEratostenes(1000);

		if (esPrimo[numeroIntroducido]) {
            System.out.println("El número introducido es primo.");
		} else {
            System.out.println("El número introducido NO es primo.");
        }

        System.out.println("Números primos entre 2 y 1000: ");
        for (int i = 2; i <= 1000; i++) {
            if (esPrimo[i]) {
                System.out.println(i + " ");
            }
        }
    }
}
