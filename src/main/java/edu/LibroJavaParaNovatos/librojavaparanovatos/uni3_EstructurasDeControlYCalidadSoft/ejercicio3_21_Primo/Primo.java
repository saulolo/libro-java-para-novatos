package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_21_Primo;

/**
 * Determinar si un número N introducido por teclado es o no primo. Recuerda que un número
 * primo no es el hijo de mi tío, sino aquél que sólo es divisible por sí mismo y por la unidad.
 * @author Saulolo
 */
public class Primo {


    /**
     * Determina si un número dado es primo o no.
     * @param numero El número a verificar si es primo.
     * @return true si el número es primo, false en caso contrario.
     */
    public boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; //Si es divisible por algún número no es primo.
            }
        }
        return true;
    }

}