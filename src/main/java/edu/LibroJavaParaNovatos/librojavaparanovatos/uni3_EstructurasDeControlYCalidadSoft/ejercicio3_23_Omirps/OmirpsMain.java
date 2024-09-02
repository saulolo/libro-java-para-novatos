package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_23_Omirps;

import java.util.List;
import java.util.Scanner;

public class OmirpsMain {

	public static void main(String[] args) {

		Omirps p = new Omirps();

		System.out.println("NÚMEROS PRIMOS");
		System.out.println("Introduce un número entero: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		// Descomenta este código para probar la lista de omirps

		int[] omirps = p.listaOmirps(n);

		for (int i = 0; i < n; i++) {
			System.out.println(omirps[i]);
		}


		// Descomenta este código si quieres probar el método esOmpirp()

		if (p.esOmirp(n))
			System.out.println("El número " + n + " es omirp");
		else
			System.out.println("El número " + n + " no es omirp");

		// Descomenta este código para probar la lista de primos

		int[] primos = p.listaPrimos(n);

		for (int i = 0; i < n; i++) {
			System.out.println(primos[i]);
		}

		// Descomenta este código si quieres probar el método esPrimo()

		if (p.esPrimo(n))
			System.out.println("El número " + n + " es primo");
		else
			System.out.println("El número " + n + " no es primo");
	}
}
