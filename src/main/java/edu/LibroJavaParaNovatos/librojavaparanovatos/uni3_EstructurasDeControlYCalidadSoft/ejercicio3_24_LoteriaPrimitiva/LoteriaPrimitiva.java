package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_24_LoteriaPrimitiva;

/**
 * Generar combinaciones al azar para la lotería primitiva (6 números entre 1 y 49). Debes utilizar el método
 * Math.random() que vimos en el capítulo 1. Por ahora, no te preocupes porque los números puedan repetirse.
 * No hace falta que corras a la administración de loterías a jugar la primera combinación que te salga. Lo han probado
 * muchas promociones de alumnos antes que tú y no nos consta que nadie haya conseguido salir de pobre.
 * @author Saulolo
 */
public class LoteriaPrimitiva {

	public int[] generadorNumeros() {

		int[] numeros = new int[6];

		for (int i = 0; i < 6; i++) {
			numeros[i] = (int) (Math.random() * 49) + 1;
		}

		return numeros;
	}

}
