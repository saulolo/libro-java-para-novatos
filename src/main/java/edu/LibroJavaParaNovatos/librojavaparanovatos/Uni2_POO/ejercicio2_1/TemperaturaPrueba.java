package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni2_POO.ejercicio2_1;

import java.util.Scanner;

/**
 *@author Saulolo
 */
public class TemperaturaPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Temperatura temperatura = new Temperatura();//Debo de instanciar la clase Temperatura para traer sus métodos


        System.out.println("CONVERSOR DE TEMPERATURAS");
        System.out.println("-------------------------");

        System.out.println("Ingresa la temperatura en °Celsius para convertir a °Farenheit: ");
        double numeroCel = Double.parseDouble(input.next());

        System.out.println("La temperatura de " + numeroCel + " °C equivale a: " + temperatura.farenheitToCelsius(numeroCel) + " °F");


        System.out.println("Ingresa la temperatura en °Farenheit para convertir a °Celsius: ");
        double numeroFar = Double.parseDouble(input.next());

        System.out.println("La temperatura de " + numeroFar + " °F equivale a: " + temperatura.farenheitToCelsius(numeroFar) + " °C");

    }

}
