package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni3_EstructurasDeControlYCalidadSoft.ejercicio3_1;

/**
 * Leer un número por teclado mediante un método, y decir si es positivo o negativo con otro método.
 * La salida por consola puede ser algo así como: "el número X es positivo"
 * @author Saulolo
 */
public class PositivoYNegativo {


    /**
     * Verifica si el número ingresado es positivo, negativo o cero y muestra un mensaje en la consola.
     * @param numero El numero que se verificará.
     */
    public void comprobarPositivoNegativo(int numero) {
        if (numero > 0) System.out.println("El número " + numero + " es positivo.");
        else if(numero == 0) System.out.println("El número ingresado es cero.");
        else System.out.println("El número " + numero + " es negativo.");
    }
}


