package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_17_NotasDeClase;

/**
 * El usuario de este programa será un profesor, que introducirá las notas de sus 30 alumnos de una
 * en una. El algoritmo debe decirle cuántos suspensos y cuántos aprobados hay. Las notas pueden
 * valer entre 1 y 10, y el programa no debe aceptar valores fuera de ese rango.
 * @author Saulolo
 */
public class NotasClase {

    private int numSuspensos = 0;
    private int numAprobados = 0;


    /**
     * Registra una nota en el sistema y actualiza el recuento de aprobados y suspendidos.
     * Si la nota es mayor o igual a 5, se incrementa el contador de aprobados.
     * Si la nota es menor que 5, se incrementa el contador de suspendidos.
     * @param nota La nota a agregar al sistema.
     */
    public void agregarNotas(int nota) {
        if (nota >= 5) numAprobados++;
        else numSuspensos++;
    }


    public int getNumSuspensos() {
        return numSuspensos;
    }

    public int getNumAprobados() {
        return numAprobados;
    }
}
