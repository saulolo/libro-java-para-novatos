package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_3;

/**
 *@author Saulolo
 */

public class MiNumero {

    /**
     * Escribe en Java una clase llamada MiNumero que calcule el doble, el triple y el cuádruple de un número
     * y permita sumarlo y restarlo con otros números. Los métodos de la clase deben ser:
     * - Constructor sin parámetros (establecerá el número a cero)
     * - Constructor con parámetro entero (asignará ese valor al número)
     * - Método cambiaNumero(int): permite asignar un nuevo valor al número
     * - Método suma(int): permite sumar una cantidad al número
     * - Método resta(int): permite restar una cantidad al número
     * - Método getValor(): devuelve el valor actual del número
     * - Método getDoble(): devuelve el doble del valor actual del número
     * - Método getTriple(): devuelve el triple del valor actual del número
     * - Método getCuádruple(): devuelve el cuádruple del valor actual del número
     */

    private int numero;

    // Constructor sin parámetros: establece el número a 0
    public MiNumero() {
        numero = 0;
    }

    // Constructor parametrizado para establecer valor del número
    public MiNumero(int num) {
        this.numero = num;
    }

    // Asigna un nuevo valor al número
    void cambiaNumero(int num) {
        numero = num;
    }

    /**
     * Método para sumar una cantidad al número
     * @param num Número
     */
    void suma(int num) {
        numero = numero + num;
    }


    /**
     * Método para restar una cantidad al número
     * @param num Número
     */
    void resta(int num) {
        numero = numero - num;
    }

    // Devuelve el valor actual del número
    public int getValor() {
        return numero;
    }

    // Devuelve el doble del valor actual del número
    public int getDouble() {
        return numero * 2;
    }

    // Devuelve el triple del valor actual del número
    public int getTriple() {
        return numero * 3;
    }

    // Devuelve el cuádruple del valor actual del número
    public int getCuadruple() {
        return numero * 4;
    }


}
