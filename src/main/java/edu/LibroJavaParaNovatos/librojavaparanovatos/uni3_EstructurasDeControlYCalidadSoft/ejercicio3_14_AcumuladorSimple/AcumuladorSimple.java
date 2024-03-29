package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_14_AcumuladorSimple;

/**
 * Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998 + 1000.
 * No preguntes en los foros de programación, seguro que puedes hacerlo por ti mismo.
 * @author Saulolo
 */
public class AcumuladorSimple {


    /**
     * Calcula la suma de los numeros pares comprendido entre los numeros del 1 al 1000, ambos inclusive.
     * @return la suma de los numeros pares que hay entre el 1 y el 1000.
     */
    public int suma() {
        int acumulador = 0;

        for (int i = 1; i < 1000; i++) {

            if (i %2 == 0) {
                acumulador = acumulador +i;
            }
        }
        return acumulador;
    }

}
