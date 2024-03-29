package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_13_TablaDeMultiplicar;

/**
 * Vamos con un clásico de los cursos de introducción a la programación. El usuario teclea un número
 * y el programa muestra la tabla de multiplicar de ese número. Pero que quede bonito, por favor,
 * algo así como:
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * etc.
 * @author Saulolo
 */
public class TablaDeMultiplicar {

    private int numeroTabla;

    public void setNumeroTabla(int numeroTabla) {
        this.numeroTabla = numeroTabla;
    }


    /**
     * Muestra la tabla de multiplicar del 1 al 10 de un número establecido en el objeto.
     */
    public void mostrarTabla() {
        for (int i = 1; i <=10; i++) {
            int resultado =  numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }
    }
}
