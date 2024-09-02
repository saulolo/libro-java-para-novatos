package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_27_NumeroSecreto;

/**
 * El ordenador elegirá un número al azar entre 1 y 100. El usuario irá introduciendo números por teclado, y el
 * ordenador le irá dando pistas: "mi número es mayor" o "mi número es menor", hasta que el usuario acierte.
 * Entonces el ordenador le felicitará y le comunicará el número de intentos que necesitó para acertar el número
 * secreto, sin humillarlo en caso de que hayan sido más de cinco.
 * @author Saulolo
 */
public class NumeroSecreto {

    private final int numeroSecreto;
    private int intentos;

    public NumeroSecreto() {
        numeroSecreto = (int) (Math.random() * 100) + 1;
        intentos = 0;
    }

    public String adivinaNumero(int a) {
        intentos++;
        if (a > numeroSecreto) {
            return "Mi número es menor.";
        } else if (a < numeroSecreto) {
            return "Mi número es mayor.";
        } else {
            return "¡Felicidades! Acertaste el número en " + intentos + " intentos.";
        }
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public int getIntentos() {
        return intentos;
    }
}
