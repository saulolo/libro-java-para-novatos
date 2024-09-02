package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_17_NotasDeClase;

import java.util.Scanner;

/**
 * @author Saulolo
 */
public class NotasClaseMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int notaIntroducida;

        NotasClase notas = new NotasClase();

        for (int i = 1; i <= 30; i++) {
            System.out.print("Por favor introduzca la calificacion del estudiante " + i + " :");

            do {
                notaIntroducida = input.nextInt();
                if ((notaIntroducida < 0) || (notaIntroducida > 10)) System.out.println("El numero" +
                        " debe de estar entre 0 y 10. Introduzcalo de nuevo.");
            } while ((notaIntroducida < 0) || (notaIntroducida > 10));
            notas.agregarNotas(notaIntroducida);
        }


        System.out.println("Numero de estudiantes de supensos: " + notas.getNumSuspensos());
        System.out.println("Numero de estudiantes aprobados: " + notas.getNumAprobados());


    }


}
