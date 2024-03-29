package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_7_ContarCifras;

/**
 * Determinar el número de cifras de un número entero. El algoritmo debe funcionar para números de hasta 5 cifras,
 * considerando los negativos. Por ejemplo, si se introduce el número 5342, la respuesta del programa debe ser 4.
 * Si se introduce –250, la respuesta debe ser 3.
 * Para los quisquillosos: no, el 0 a la izquierda no cuenta.
 * @author Saulolo
 */
public class ContarCifras {


    /**
     * Devuelve la cantidad de cifras de un número y lanza una excepción si tiene mas de 5 cifras.
     * @param numero Número entero del cual se desea contar las cifras.
     * @return Devuelve la cantidad de cifras que tiene un número menor a 5 cifras.
     * @throws Exception Si el número tiene mas de 5 cifras.
     */
    public int contarCifras(int numero) throws Exception {

        String numeroTexto = String.valueOf(numero);
        int cantidadCifras = numeroTexto.length();

        if (cantidadCifras > 5) throw new Exception("El número tiene mas de 5 cifras");
        return cantidadCifras;

    }

                /* OTRAS POSIBLES SOLUCIONES */

    /*
        // SOLUCIÓN 1:
    // Devuelve el número de cifras del número por encadenamiento de ifs
    public int calculaNumCifras(int n) {

	int numCifras = 0;

	n = (int)(Math.abs(n));

	if (n >= 0 && n <= 9) numCifras = 1;
	if (n >= 10 && n <= 99) numCifras = 2;
	if (n >= 100 && n <= 999) numCifras = 3;
	if (n >= 1000 && n <= 9999) numCifras = 4;
	if (n >= 10000 && n <= 99999) numCifras = 5;

	return numCifras;
    }

    // SOLUCIÓN 2:
    // Devuelve el número de cifras del número por divisiones sucesivas
    public int calculaNumCifras(int n) {

	int numCifras = 1;

	if (numero / 10 != 0) numCifras = 2;
	if (numero / 100 != 0) numCifras = 3;
	if (numero / 1000 != 0) numCifras = 4;
	if (numero / 10000 != 0) numCifras = 5;

	return numCifras;
    }


    // SOLUCIÓN 3:
    // Devuelve el número de cifras del número utilizando un bucle para
    // hacer las divisiones sucesivas entre 10
    public int calculaNumCifras(int n) {

	int numCifras = 0;

	do {
	  n = n / 10;
	  numCifras++;
	}
	while (n != 0);

	return numCifras;
    }


    // SOLUCIÓN 4:
    // Devuelve el número de cifras del número convirtiéndolo a cadena
    public int calculaNumCifras(int n) {
	String str = new String((int)(Math.abs(n)));
	return str.length();
    }
     */
}
