package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_5;

import static edu.LibroJavaParaNovatos.librojavaparanovatos.utils.Constants.*;

/**
 * @author Saulolo
 * @Description una clase Distancia con dos métodos:
 * - millasAMetros(): tomará como parámetro una distancia expresada en millas y la transformará en kilómetros.
 * - millasAKilometros(): hará lo mismo, pero convirtiendo las millas en kilómetros.
 * (Una milla marina equivale a 1852 metros)
 */

public class Distancia {

    /**
     * Método para convertir una milla dada a metros.
     * @param millas La cantidad de millas que se desea convertir.
     * @return La distancia equivalente en metros.
     * @throws IllegalArgumentException Si se proporciona una cantidad negativa.
     */
    public double millasAMetros(double millas){
        double metros = millas * MILLAS_A_METROS;
        if (millas < 0) throw new IllegalArgumentException("La cantidad de millas no puede ser negativa.");
        return metros;
    }


    /**
     * Método para convertir una milla dada a kilómetros.
     * @param millas La cantidad de millas que se desea convertir.
     * @return La distancia equivalente en kilómetros.
     * @throws IllegalArgumentException Si se proporciona una cantidad negativa.
     */
    public double millasAKilometros(double millas) {
        if (millas < 0) throw new IllegalArgumentException("La cantidad de millas no puede ser negativa.");
        double kilometros = millas * MILLAS_A_KILOMETROS;
        return kilometros;
    }

}
