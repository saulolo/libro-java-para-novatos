package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni3_EstructurasDeControlYCalidadSoft.ejercicio3_2;

/**
 * Calcular la raíz cuadrada de un número introducido por teclado. Hay que tener la precaución de comprobar
 * que el número sea positivo.
 * @author Saulolo
 */
public class RaizCuadrada {


    /**
     * Calcula la raiz cuadrada de un número.
     * @param num El número a calcular debe de ser mayor que cero.
     * @return Una cadena que contiene el resultado del cálculo de la raíz cuadrada o un mensaje de error
     * si el número es negativo.
     */
    public String calcularRaizCuadrada(int num) {
        if (num >= 0) {
            int raiz = (int) Math.sqrt(num);
            return "La raíz cuadrada de " + num + " es " + raiz;
        } else {
            return "Número introducido no válido";
        }
    }

}


