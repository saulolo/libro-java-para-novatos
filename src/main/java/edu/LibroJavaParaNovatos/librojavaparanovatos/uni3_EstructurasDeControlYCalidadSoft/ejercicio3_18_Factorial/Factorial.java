package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_18_Factorial;

/**
 * Calcular el factorial de un número entero N. Recuerda que el factorial de un número es el
 * producto de ese número por todos los enteros menores que él. Por ejemplo, el factorial de 5
 * (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.
 * Cuando funcione, prueba a calcular el factorial de un número muy grande, como 288399849! o algo
 * parecido, y verás qué risa.
 * @author Saulolo
 */
public class Factorial {


    /**
     * Calcula el factorial de un número entero no negativo.
     * @param n el número entero del cual se calculará el factorial.
     * @return el factorial de tipo long del número dado.
     * @throws IllegalArgumentException si se proporciona un número negativo.
     */
    public long calculoFactorial(int n) {
        if (n < 0) throw new IllegalArgumentException("El factorial no esta definido para números negativos");

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
