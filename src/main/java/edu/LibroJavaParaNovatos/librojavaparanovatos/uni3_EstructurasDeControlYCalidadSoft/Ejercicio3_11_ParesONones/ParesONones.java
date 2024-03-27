package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_11_ParesONones;

import edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_10_Impares.Impares;
import edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_9_Pares.Pares;

/**
 * Escribe un programa que pregunte al usuario si desea ver los números pares o impares y que, dependiendo de la
 * respuesta, muestre en la pantalla los números pares o impares entre A y B. Cualquiera de ellos puede ser el
 * mayor.
 * Y sí, es un batiburrillo de los dos anteriores, así que intenta reutilizar todoo el código que puedas.
 * En programación eso no se considera plagio, salvo que te pillen.
 * @author Saulolo
 */
public class ParesONones {


                                            /* SOLUCIÓN 1*/
    /**
     * Imprime los números pares o impares segun la opción específica, dentro de un rango de dos números enteros.
     * @param numeroA El primer número entero.
     * @param numeroB El segundo número entero.
     * @param parImpar La opción para imprimir números pares o impares. Debe ser "par" o "impar".
     */
    public void ParesONones(int numeroA, int numeroB, String parImpar) {

        int mayor;
        int menor;

        if (numeroA > numeroB) {
            mayor = numeroA;
            menor = numeroB;
        } else {
            mayor = numeroB;
            menor = numeroA;
        }

        if (parImpar.equalsIgnoreCase("par")) {
            for (int i = menor; i <= mayor; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if(parImpar.equals("impar")){
            for (int i = menor; i <= mayor; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }


                                           /* SOLUCIÓN 2*/
    /**
     * Imprime todos los números pares o impares entre dos números enteros, según la opción especificada.
     *
     * @param numeroA   El primer número del rango.
     * @param numeroB   El segundo número del rango.
     * @param parImpar  La opción para imprimir números pares o impares. Debe ser "par" o "impar".
     */
    public void ParesONones2do(int numeroA, int numeroB, String parImpar) {

        if (parImpar.equalsIgnoreCase("par")) {
            Pares par = new Pares();
            par.numerosPares(numeroA, numeroB);
        } else if (parImpar.equalsIgnoreCase("impar")){
            Impares impar = new Impares();
            impar.numerosImpares(numeroA, numeroB);
        }
    }
}
