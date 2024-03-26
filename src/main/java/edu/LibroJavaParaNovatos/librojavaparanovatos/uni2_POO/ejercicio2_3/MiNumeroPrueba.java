package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_3;

import java.util.Scanner;

/**
 *@author Saulolo
 */

public class MiNumeroPrueba {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MiNumero miNumero1 = new MiNumero();  //Crea un número con valor cero

        System.out.println("Ingrese el número a calcular: ");
        Integer numeroIngresado = Integer.parseInt(input.next());
        MiNumero miNumero2 = new MiNumero(numeroIngresado); //Crea un número con valor numeroIngresado

        miNumero1.cambiaNumero(5);  // Asigna un nuevo valor (5) al número miNumero1
        miNumero1.resta(1);   // Resta 1 al número miNumero1 (ahora miNumero1 valdrá 4)
        miNumero2.suma(miNumero1.getValor());  // Suma a n2 el valor de n1 (ahora n2 valdrá 11)

        System.out.println("PROBANDO LA CLASE MiNumero");

        System.out.println("NÚMERO miNumero1");
        System.out.println("Valor actual: " + miNumero1.getValor());
        System.out.println("Doble: " + miNumero1.getDouble());
        System.out.println("Triple: " + miNumero1.getTriple());
        System.out.println("Cuádruple: " + miNumero1.getCuadruple());

        System.out.println("NÚMERO miNumero2");
        System.out.println("Valor actual: " + miNumero2.getValor());
        System.out.println("Doble: " + miNumero2.getDouble());
        System.out.println("Triple: " + miNumero2.getTriple());
        System.out.println("Cuádruple: " + miNumero2.getCuadruple());

    }

}
