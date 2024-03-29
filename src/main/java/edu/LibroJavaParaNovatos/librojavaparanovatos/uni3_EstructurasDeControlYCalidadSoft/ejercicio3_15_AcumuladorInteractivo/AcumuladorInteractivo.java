package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_15_AcumuladorInteractivo;

import java.util.Scanner;

/**
 * Calcular el valor medio de una serie de valores enteros positivos introducidos por teclado.
 * Para terminar de introducir valores, el usuario debe teclear un número negativo.
 *
 * @author Saulolo
 */
public class AcumuladorInteractivo {

    Scanner input = new Scanner(System.in);

    int suma;
    int acmulador;



    public int getSuma() {
        return suma;
    }

    /**
     * Añade un número al acumulador y actualiza el contador de números agregados.
     * @param numero El número entero que se va a agregar al acumulador.
     */
    public void anadirNumero(int numero) {
        suma = suma + numero;
        acmulador++;
    }

    /**
     * Calcula y devuelve el promedio de los números agregados al acumulador..
     * @return El promedio de los números agregados al acumulador
     */
    public int promedio() {
        return suma / acmulador;
    }



}
