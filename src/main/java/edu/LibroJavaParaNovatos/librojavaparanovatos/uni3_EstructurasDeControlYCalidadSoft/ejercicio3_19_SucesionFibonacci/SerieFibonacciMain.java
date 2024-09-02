package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_19_SucesionFibonacci;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saulolo
 */

public class SerieFibonacciMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroIngresado;

        SerieFibonacci miFibonnaci = new SerieFibonacci();


        System.out.print("Por favor ingresa el númeroa calcular su Fibonacci: ");
        numeroIngresado = input.nextInt();


        System.out.println("La serie Fibonacci del numero: " + numeroIngresado +
                " es: " + Arrays.toString(miFibonnaci.generarSerieFibonacci(numeroIngresado)));
    }
}
