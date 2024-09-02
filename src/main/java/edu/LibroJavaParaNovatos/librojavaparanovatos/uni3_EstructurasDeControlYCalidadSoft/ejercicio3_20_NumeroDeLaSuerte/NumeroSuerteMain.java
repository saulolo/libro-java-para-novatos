package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_20_NumeroDeLaSuerte;

import java.util.Scanner;

/**
 * @author saulolo
 */

public class NumeroSuerteMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dia;
        int mes;
        int anio;


        System.out.println("Por favor ingresa tu fecha de nacimiento asi: (Dia-Mes-Año)");
        System.out.print("Ingresa el dia: ");
        dia = input.nextInt();
        System.out.print("Ingresa el mes: ");
        mes = input.nextInt();
        System.out.print("Ingresa el año: ");
        anio = input.nextInt();

        NumeroDeLaSuerte miLuckyNumber = new NumeroDeLaSuerte(dia, mes, anio);

        miLuckyNumber.impresion();

    }
}
