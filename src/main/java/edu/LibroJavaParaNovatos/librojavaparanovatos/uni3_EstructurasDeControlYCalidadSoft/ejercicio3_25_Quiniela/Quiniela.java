package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_25_Quiniela;

/**
 * Generar combinaciones al azar para la quiniela (14 valores dentro del conjunto 1, X o 2, por si hay alguien de otro
 * planeta que no sepa cómo se rellena una quiniela). El resultado debe ser algo así, pero generado al azar:
 * 1 - X - X - 2 - 1 - 1 - 1 - 2 - 2 - X - 1 - X - X - 2
 * @author Saulolo
 */
public class Quiniela {

	/**
	 * Genera una quiniela al azar.
	 * @return quiniela generada.
	 */
	public char[] generarQuiniela() {
		char[] quiniela = new char[14];

		for (int i = 0; i < quiniela.length; i++) {
			int valor = (int) (Math.random() * 3);

			if (valor == 0) quiniela[i] = 'X';
			else  if (valor == 1) quiniela[i] = '1';
			else quiniela[i] = '2';
		}
		return quiniela;
	}
}
