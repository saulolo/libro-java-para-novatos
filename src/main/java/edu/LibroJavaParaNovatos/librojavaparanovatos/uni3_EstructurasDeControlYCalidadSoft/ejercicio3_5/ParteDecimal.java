package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_5;


/**
 * Averiguar si un número real introducido por teclado tiene o no parte fraccionaria (utilícese el método
 * Math.round() que aparece descrito en el capítulo 1, o si no, búscalo en Internet)
 * @author Saulolo
 */

public class ParteDecimal {

    public String calcularParteDecimal (double numero) {

        if (Math.round(numero) == numero) return "El " + numero + " no tiene parte fraccionaria";
        else return "El " + numero + " tiene parte fraccionaria";
    }



}
