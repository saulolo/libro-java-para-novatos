package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_6;

/**
 * Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor. Complétalo con
 * otro método que nos diga si los números, además de estar ordenados, son consecutivos.
 * @author Saulolo
 */
public class NumerosOrdenados {

    private int x;
    private int y;
    private int z;

    /**
     * Contructor
     */
    public NumerosOrdenados() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    /**
     * Constructor con parámetros.
     * @param x El primer número.
     * @param y El segundo número.
     * @param z El tercer número.
     */
    public NumerosOrdenados(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Establece los valores de los números enteros.
     * @param x El nuevo valor para el primer número entero.
     * @param y El nuevo valor para el segundo número entero.
     * @param z El nuevo valor para el tercer número entero.
     */
    public void setNumeros(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Verifica si tres valores estan ordenadnos de forma ascendente.
     * @return true si los numeros estan ordenados de menor a mayor, false en caso cotrario.
     */
    public boolean estanOrdenados() {
        boolean resultado;
        resultado = ((x < y) && (y < z)) ? true : false;
        return resultado;
    }

    /**
     * Verifica si los valores estan ordenados de manera consecutiva.
     * @return true si los números estan ordenados consecutivamente, false en caso contrario.
     */
    public boolean sonConsecutivos() {
        boolean resultado;
        resultado = ((x == (y - 1)) && (y == (z - 1))) ? true : false;
        return resultado;
    }

}
