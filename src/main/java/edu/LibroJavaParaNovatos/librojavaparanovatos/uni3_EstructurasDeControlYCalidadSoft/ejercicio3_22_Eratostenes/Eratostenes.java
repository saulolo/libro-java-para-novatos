package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_22_Eratostenes;

/**
 * Generalizar el algoritmo anterior para averiguar todos los números primos que existen
 * entre 2 y 1000 (a este proceso se le conoce como criba de Eratóstenes, que no es que
 * tenga mayor importancia, pero sirve para ponerle un título interesante a este ejercicio)
 * @author Saulolo
 */
public class Eratostenes {


	/**
	 * Implementa la criba de Eratóstenes para averiguar todos los números primos entre 2 y max.
	 * @param max El número máximo hasta el cual se buscarán los números primos.
	 * @return Un array de booleanos donde cada posición indica si el número es primo o no.
	 */
	public boolean[] cribaEratostenes(int max) {
		boolean[] esPrimo = new boolean[max + 1];

		//Iniciar todos los valores a true.
		for (int i = 2; i <= max; i++) {
			esPrimo[i] = true;
		}

		//Implementar la criba
		for(int p = 2; p * p <= max; p++) {
			//SI esPrimo[p] sigue siebndo true, entonces es un número primo.
			if (esPrimo[p]) {
				//Marcar todos los múltiplos de p como no primos.
				for (int multiplo = p * p; multiplo < max; multiplo += p) {
					esPrimo[multiplo] = false;
				}
			}
		}
		return esPrimo;
	}
}
