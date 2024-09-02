package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_27_NumeroSecreto;

import java.util.Scanner;

/**
 * @author Saulolo
 */
public class NumeroSecretoMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumeroSecreto miNumeroSecreto = new NumeroSecreto();
        boolean acierto = false;

        System.out.println("¡Bienvenido al juego de adivinar el número secreto!");
        System.out.println("El ordenador ha elegido un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (!acierto) {
            System.out.print("Introduce un número: ");
            int numeroIntroducido = input.nextInt();
            String resultado = miNumeroSecreto.adivinaNumero(numeroIntroducido);
            System.out.println(resultado);
            if (resultado.startsWith("¡Felicidades!")) {
                acierto = true;
            }
        }

        System.out.println("Gracias por jugar.");
        input.close();
    }
}
