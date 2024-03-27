package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_8_MayorMenorMediano;

/**
 * Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el menor y cuál el mediano.
 * Y da gracias a que no lo hemos hecho con 4 variables. Prohibido usar arrays, suponiendo que sepas
 * lo que son. Es un ejercicio de lógica, no de bucles.
 * @author Saulolo
 */
public class MayorMenorMediano {


    /**
     * Determina el número mayor, el número menor y el número mediano de tres números dados.
     * @param numeroA El primer número entero.
     * @param numeroB El segundo número entero.
     * @param numeroC El tercer número entero.
     * @return Un String indicando cual es el número mayor, el número menor y el número mediano.
     */
    public String determinarTamanioNumero(int numeroA, int numeroB, int numeroC) {

        int mayor = Math.max(numeroA, Math.max(numeroB, numeroC));

        int menor = Math.min(numeroA, Math.min(numeroB, numeroC));

        int mediano = numeroA + numeroB + numeroC - mayor - menor;

        return "El número mayor es: " + mayor +
        " el nuúmero mediano es: " + mediano +
        " el número mediano es: " + menor;
    }
}
