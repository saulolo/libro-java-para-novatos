package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_26_Calculadora;

import java.util.Scanner;

/**
 * @author Saulolo
 */
public class CalculadoraMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculadora miCalculadora = new Calculadora();

        System.out.println("Introduce el primer número: ");
        int num1 = input.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = input.nextInt();

        System.out.println("Introduce la operación a realizar: ");
        String operador = input.next();

        System.out.println(miCalculadora.operacion(operador, num1, num2));
    }
}
