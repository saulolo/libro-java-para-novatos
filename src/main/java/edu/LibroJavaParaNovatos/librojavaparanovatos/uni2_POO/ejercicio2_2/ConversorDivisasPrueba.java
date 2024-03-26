package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_2;

import java.util.Scanner;

/**
 *@author Saulolo
 */
public class ConversorDivisasPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ConversorDivisas conversorDivisas = new ConversorDivisas();


        System.out.println("CONVERSOR DE MONEDAS");
        System.out.println("--------------------");

        System.out.println("Ingresa el tipo de cambio a realizar [1: Euros | 2: Libras]: ");
        Integer tipoDivisa = Integer.parseInt(input.next());

        if (tipoDivisa == 1) {
            System.out.println("Ingresa la cantidad de Euros (€) a convertir: ");
            Double valorEuro = input.nextDouble();

            System.out.println("Los " + valorEuro + " € ingresados, equivalen a: " + conversorDivisas.eurosToLibras(valorEuro) + " ₤");
        } else {
            System.out.println("Ingresa la cantidad de Libras (₤) a convertir: ");
            Double valorLibra = input.nextDouble();

            System.out.println("Las " + valorLibra + " ₤ ingresadas, equivalen a: " + conversorDivisas.librasToEuros(valorLibra) + " €");
        }


                                //SOLUCION 2
        System.out.println("============================");
        System.out.println("SOLUCIÓN 2");
        System.out.println("-----------------------------");


        System.out.println("¿Qué tipo de cambio quieres?");
        Double tipo = Double.parseDouble(input.next());

        ConversorDivisas f1 = new ConversorDivisas();    // Establece tipo de cambio a su valor por defecto (0.85)
        ConversorDivisas f2 = new ConversorDivisas(tipo);// Establece tipo de cambio al valor introducido por teclado
        double euros = 100.0;
        double libras = 100.0;

        System.out.println("Con el tipo de cambio = " + f1.getTipoCambio() + ":");
        System.out.println(euros + " euros son " + f1.eurosToLibras(euros) + " libras.");
        System.out.println(libras + " libras son " + f1.librasToEuros(libras) + " euros.\n");

        System.out.println("Con el tipo de cambio = " + f2.getTipoCambio() + ":");
        System.out.println(euros + " euros son " + f2.eurosToLibras(euros) + " libras.");
        System.out.println(libras + " libras son " + f2.librasToEuros(libras) + " euros.");



    }
}
