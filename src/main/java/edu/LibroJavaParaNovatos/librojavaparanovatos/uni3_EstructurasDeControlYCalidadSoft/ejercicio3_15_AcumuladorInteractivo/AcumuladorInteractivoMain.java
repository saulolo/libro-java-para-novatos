package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_15_AcumuladorInteractivo;

import java.util.Scanner;

/**
 * @author Saulolo
 */

public class AcumuladorInteractivoMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AcumuladorInteractivo miAcumInter = new AcumuladorInteractivo();

        int numeroIntroducido;

        do {
            System.out.print("Introduzca un número (Negativo para terminar): ");
            numeroIntroducido = input.nextInt();
            if (numeroIntroducido >= 0) {
                miAcumInter.anadirNumero(numeroIntroducido);
            }

        } while (numeroIntroducido >= 0);

        System.out.print("La suma es: " + miAcumInter.suma);
        System.out.print("El promedio es: " + miAcumInter.promedio());

        input.close();
    }

}
