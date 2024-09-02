package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_19_SucesionFibonacci;

/**
 * La famosa sucesión de Fibonacci es una sucesión no convergente de números enteros que comienza
 * así:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, …
 * Cada número de la sucesión se calcula sumando los dos números anteriores (excepto los dos
 * primeros, que son, por definición, 0 y 1).
 * Se da la curiosa circunstancia de que los números de la sucesión de Fibonacci aparecen con
 * sorprendente precisión en muchas estructuras naturales, como los ángulos de crecimiento de
 * las ramas de árboles cuando son iluminados verticalmente, la disposición de los pétalos de
 * los girasoles o de las piñas en los pinos, la forma de las cochas de los caracoles, y
 * cosas así. Si lo piensas, es un poco inquietante que un producto de la imaginación humana
 * como son las matemáticas tenga una relación tan estrecha con la naturaleza. ¿O era al revés?
 * Bueno, al diablo. A lo que íbamos: escribe un programa que muestre en la pantalla los N
 * primeros términos de la sucesión de Fibonacci, siendo N un número entero introducido por el
 * usuario.
 * @author Saulolo
 */
public class SerieFibonacci {


    /**
     * Calcula y devuelve un array correspondinete a la serie fibonacci de un número dado.
     * @param limite  Número limite a calcluar su serie fibocanni.
     * @return La lista de números fibonacci que hay hasta el número introducido.
     */
    public int[] generarSerieFibonacci(int limite) {
        if (limite <= 0) {
            return new int[0]; // Devuelve un array vacío si el límite es menor o igual a cero
        }

        int[] serie = new int[limite]; // Creamos un array para almacenar la serie
        int numeroAnterior = 0;
        int numeroActual = 1;
        for (int i = 0; i < limite; i++) {
            serie[i] = numeroAnterior;   // Asignamos el valor actual de 'a' al índice 'i' del array
            int temp = numeroActual;
            numeroActual = numeroAnterior + numeroActual;
            numeroAnterior = temp;
        }
        return serie;
    }
}

