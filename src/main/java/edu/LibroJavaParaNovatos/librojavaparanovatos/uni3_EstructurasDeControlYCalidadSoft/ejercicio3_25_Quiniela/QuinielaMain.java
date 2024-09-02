package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_25_Quiniela;

public class QuinielaMain {

	public static void main(String[] args) {

		Quiniela miQuiniela = new Quiniela();

		char[] quinielaGenerada = miQuiniela.generarQuiniela();

		System.out.println("Los resultados de la quiniela son:");
		for (char quiniela : quinielaGenerada) {
			System.out.print(quiniela + " - " );
		}
	}
}
