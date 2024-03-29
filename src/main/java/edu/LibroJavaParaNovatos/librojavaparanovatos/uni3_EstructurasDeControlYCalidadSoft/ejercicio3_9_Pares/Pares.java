package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_9_Pares;

/**
 * Ahora sí empiezan los bucles. Escribe un programa que muestre todos los números pares entre A y B,
 * siendo estos dos valores dos números introducidos por teclado. A debe ser menor que B, claro.
 * En caso contrario, el programa debe avisarnos, pero con cariño.
 * @author Saulolo
 */
public class Pares {


    /**
     * Imprime los números pares que se encuentran dentro del rango de dos números dados.
     * @param numeroA Primer número entero.
     * @param numeroB Primer número entero.
     */
    public void numerosPares(int numeroA, int numeroB) {

        if (numeroA > numeroB) {
            System.out.println("El primer número debe de ser menor que el segundo número.");
        } else {
            while (numeroA <= numeroB) {
                if (numeroA % 2 == 0) {
                    System.out.println(numeroA);
                }
                numeroA = numeroA + 1;
            }
        }
    }
}
