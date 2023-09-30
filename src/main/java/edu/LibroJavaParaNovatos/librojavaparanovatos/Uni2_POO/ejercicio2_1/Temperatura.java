package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni2_POO.ejercicio2_1;

/**
 *@author Saulolo
 */

/*Escribe en Java una clase Temperatura que convierta de grados Celsius a Farenheit y viceversa.
Para ello crea dos métodos:
double celsiusToFarenheit(double)
double farenheitToCelsius(double)
Escribe también un método main() para poder probar los métodos anteriores a partir de un número
introducido por el usuario del programa.
*/
public class Temperatura {

    private double tempF;
    private double tempC;


    //Método que convierte de °Celsius a °Farenheit
    public double celsiusToFarenheit(double tempF) {
        tempF = (1.8) * tempC + 32;
        return tempF;
    }

    //Método que convierte de °Farenheit a °Celsius
    public double farenheitToCelsius(double tempC) {
        tempC = (tempF - 32) / 1.8;
        return tempC;
    }







}
