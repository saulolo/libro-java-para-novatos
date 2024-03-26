package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_2;

/**
 *@author Saulolo
 */

public class ConversorDivisas {

    /**
     * Escribe una clase llamada ConversorDivisas que convierta libras en euros y viceversa, mediante dos
     * métodos llamados librasToEuros() y eurosToLibras(). La clase contará con dos constructores.
     * El constructor ConversorDivisas() establecerá el tipo de cambio en 0,85.
     * El constructor ConversorDivisas(double) permitirá configurar el tipo de cambio al crear el objeto.
     * Como en el ejercicio anterior, también debes escribir un método main() que te permita comprobar que el
     * programa funciona correctamente a partir de datos introducidos por teclado (esto se dará por supuesto
     * en el resto de ejercicios del capítulo)
     */

    private double tipoCambio;
    private double euros;
    private double libras;


    //Constructor sin parámetros: establece tipo de cambio en 0.85
    public ConversorDivisas() {
        tipoCambio = 0.85;
    }

    // Constructor parametrizado para establecer tipo de cambio
    public ConversorDivisas(double tc) {
        tipoCambio = tc;
    }

    //Método que convierte de libras a euros
    public double librasToEuros(double lib) {
        euros = lib / tipoCambio;
        return euros;
    }


    //Método que convierte de euros a libras
    public double eurosToLibras(double eu) {
        libras = eu * tipoCambio;
        return libras;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
