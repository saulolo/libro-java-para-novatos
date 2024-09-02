package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_23_Omirps;

/**
 * Un omirp es una de esas cosas que nos hace dudar sobre la estabilidad mental de los matemáticos. Se trata de un
 * número primo que, al invertirlo, también da como resultado un número primo. Por ejemplo, el número 7951 es primo y,
 * si le damos la vuelta, obtenemos 1597, que también es primo. Por lo tanto, 7951 es un omirp.
 * Se trataría, pues, de introducir un número y que el programa determine si es un omirp o no. O más difícil todavía
 * (redoble de tambores): hacer un programa que muestre la lista de omirps entre 0 y N, siendo N un número introducido
 * por el usuario.
 * (Este último programa, me consta, es el tipo de cosas que te pueden pedir hacer en una entrevista de trabajo).
 * @author Saulolo
 */
public class Omirps {


	/**
	 * Determina si un número dado es primo o no.
	 * @param n El número a verificar si es primo.
	 * @return true si el número es primo, false en caso contrario.
	 */
	public boolean esPrimo(int n) {
		boolean primo;
		int numDivisores;

		numDivisores = calculaNumDivisores(n);

		if (numDivisores > 2) primo = false;
		else primo = true;

		return primo;
	}


	/**
	 * Determina si un número dado es un omirp o no.
	 * @param n El número a verificar si es omirp.
	 * @return true si el número es omirp, false en caso contrario.
	 */
	public boolean esOmirp(int n) {

		int inverso = invertir(n);
		boolean omirp;

		if ((esPrimo(n)) && (esPrimo(inverso)))
			omirp = true;
		else
			omirp = false;

		return omirp;
	}


	/**
	 * Devuelve una lista de los primeros n números primos.
	 * @param n El número de primos a devolver.
	 * @return Un array de enteros con los n primeros números primos.
	 */
	public int[] listaPrimos(int n) {

		int cont = 0; // Número de primos encontrados hasta ahora
		int i = 1;
		int[] primos = new int[n];

		while (cont < n) {
			if (esPrimo(i)) {
				primos[cont] = i;
				cont++;
			}
			i++;
		}
		return primos;

	}

	/**
	 * Devuelve una lista de los primeros n números omirps.
	 * @param n El número de omirps a devolver.
	 * @return Un array de enteros con los n primeros números omirps.
	 */
	public int[] listaOmirps(int n) {

		int cont = 0; // Número de omirps encontrados hasta ahora
		int i = 1;
		int[] omirps = new int[n];

		// Escribe los números de la barra de progreso
		for (i = 0; i <= 100; i = i + 2) {
			if (i % 10 == 0) System.out.print(i);
			else if (i % 10 > 2) System.out.print(" ");
		}
		System.out.println();

		i = 1;
		int porcentaje = 0;
		int nuevoporcentaje = 0;

		while (cont < n) {
			if (esOmirp(i)) {
				omirps[cont] = i;
				cont++;
				// El siguiente código es para mostrar la barra de progreso
				// (puedes quitarlo y funcionará bien)
				nuevoporcentaje = cont * 100 / n;
				if (nuevoporcentaje == porcentaje + 2) {
					System.out.print("|");
					porcentaje = nuevoporcentaje;
				}
			}
			i++;
		}
		return omirps;

	}



	/**
	 * Invierte un número entero.
	 * @param n El número a invertir.
	 * @return El número invertido.
	 */
	private int invertir(int n) {

		int numDigitos = contarDigitos(n);
		int[] digitos = new int[numDigitos];
		int inv = 0;

		// Creamos un array de enteros que contiene los dígitos de n
		for (int i = 0; i < numDigitos; i++) {
			digitos[i] = (n / (int)Math.pow(10, i)) % 10;
		}

		// Construimos el número invertido a partir del array
		for (int i = 0; i < numDigitos; i++) {
			inv = inv + digitos[i] * (int)Math.pow(10, (numDigitos - i - 1));
		}

		return inv;

	    /* También se puede resolver mediante conversión del número
	       en String, así:
	    String str = String(n);
	    String inverso = str.reverse();
	    int nInvertido = Integer.parseInt(inverso);
	    return nInvertido;
	    */

	}



	/**
	 * Cuenta el número de dígitos de un número entero.
	 * @param n El número del que se contarán los dígitos.
	 * @return El número de dígitos de n.
	 */
	private int contarDigitos(int n) {
		int cont = 0;
		while (n >= 1) {
			cont++;
			n = n / 10;
		}
		return cont;
	}



	/**
	 * Calcula el número de divisores de un número entero.
	 * @param n El número del que se contarán los divisores.
	 * @return El número de divisores de n.
	 */
	private int calculaNumDivisores(int n) {

		int numDivisores = 0;

		n = (int)Math.abs(n);
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) numDivisores++;
		}

		return numDivisores;
	}

}



