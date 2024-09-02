package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_24_LoteriaPrimitiva;

public class LoteriaPrimitivaMain {

	public static void main(String[] args) {

		LoteriaPrimitiva miLoteria = new LoteriaPrimitiva();
		int[] numerosGenerados = miLoteria.generadorNumeros();

		System.out.print("Los números generados son: ");
		for (int numero : numerosGenerados) {
			System.out.print(numero + " ");
		}
	}
}
