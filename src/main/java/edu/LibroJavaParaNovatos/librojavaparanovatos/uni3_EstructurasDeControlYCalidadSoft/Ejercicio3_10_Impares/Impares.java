package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_10_Impares;

/**
 * Escribir todos los números impares entre dos números A y B introducidos por teclado. En esta ocasión, cualquier
 * de ellos puede ser el mayor. Habrá que comprobar, entonces, cuál de los dos números, A o B es mayor, para empezar
 * a escribir los impares desde uno o desde otro.
 * @author Saulolo
 */
public class Impares {

    /**
     * Imprime los números impares que se encuentren entre el rango de dos números dados.
     * @param numeroA Primer número entero.
     * @param numeroB Segundo número entero.
     */
    public void numerosImpares(int numeroA, int numeroB) {
        int menor;
        int mayor;

        if (numeroA < numeroB) {
            menor = numeroA;
            mayor = numeroB;
        } else {
            menor = numeroB;
            mayor = numeroA;
        }
        for (int i = menor; i <= mayor ; i++) {

            if (i %2 ==1) {
                System.out.println(i);
            }
        }
    }
}
