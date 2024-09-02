package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_18_Factorial;

import java.util.Scanner;

/**
 * @author Saulolo
 */
public class FactorialMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long numeroIngresado;
        long resultado;


        Factorial miFactorial = new Factorial();

        System.out.print("Por favor ingresa el número a calcular su factorial: ");
        numeroIngresado = input.nextLong();

        resultado = miFactorial.calculoFactorial((int) numeroIngresado);

        System.out.println("EL número factorial de " + numeroIngresado + " es:" + resultado);

    }
}
