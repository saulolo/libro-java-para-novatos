package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_16_EstadisticaBasica;

import java.util.Scanner;

/**
 * @author Saulolo
 */

public class EstadisticaBasicaMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        EstadisticaBasica estadistica = new EstadisticaBasica();

        System.out.print("Por favor introduzca 10 números enteros: ");
        for (int j = 1; j <= 10; j++) {
            System.out.println("Número " + j + ": ");
            n = input.nextInt();
            estadistica.addNumero(n);
        }


        System.out.println("Maximo: " + estadistica.getMax());
        System.out.println("Mínimo: " + estadistica.getMin());
        System.out.println("Media: " + estadistica.media());
        System.out.println("Mediana: " + estadistica.getMediana());
        System.out.println("Desviación: " + estadistica.getDesviacion());
    }
}
