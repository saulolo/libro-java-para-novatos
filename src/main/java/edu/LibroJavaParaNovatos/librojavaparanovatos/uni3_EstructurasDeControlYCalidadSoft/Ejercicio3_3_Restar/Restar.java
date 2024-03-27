package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_3_Restar;

/**
 * Leídos dos números por teclado, llamémosles A y B, calcular y mostrar la resta del mayor menos el menor.
 * Por ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7,
 * el resultado debe ser B – A, es decir, 3.
 * @author Saulolo
 */
public class Restar {


    /**
     * Calcula la resta entre dos números enteros.
     * @param A Primer número ingresado.
     * @param B Segundo número ingresado.
     * @return la resta entre los dos números. Si A es mayor que B, se devuelve A - B; de lo contrario,
     * se devuelve B - A.
     */
    public int calcularResta(int A, int B) {
        return (A > B) ? A - B : B - A;
    }

}


