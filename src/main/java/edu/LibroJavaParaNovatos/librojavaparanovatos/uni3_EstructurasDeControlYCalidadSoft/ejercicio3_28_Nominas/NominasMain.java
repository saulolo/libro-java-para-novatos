package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_28_Nominas;

import edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_27_NumeroSecreto.NumeroSecreto;

import java.util.Scanner;

/**
 * @author Saulolo
 */
public class NominasMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de horas trabajadas por semana:");
        int horasSemanales = scanner.nextInt();

        System.out.println("Introduce el costo por hora de trabajo:");
        double valorHora = scanner.nextDouble();

        Nominas nomina1 = new Nominas();

        double salarioSemanal = nomina1.salarioSemanal(horasSemanales, valorHora);
        double salarioBrutoMensual = nomina1.salarioMensual(horasSemanales, valorHora);
        double salarioNetoMensual = nomina1.salarioNeto(horasSemanales, valorHora);

        System.out.println("Salario semanal: " + salarioSemanal + " euros");
        System.out.println("Salario bruto mensual: " + salarioBrutoMensual + " euros");
        System.out.println("Salario neto mensual después de impuestos: " + salarioNetoMensual + " euros");
    }
}
