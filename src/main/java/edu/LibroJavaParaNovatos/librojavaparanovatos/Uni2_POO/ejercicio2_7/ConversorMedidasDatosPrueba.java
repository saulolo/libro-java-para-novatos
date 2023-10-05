package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni2_POO.ejercicio2_7;

/**
 * @author Saulolo
 */
public class ConversorMedidasDatosPrueba {

    public static void main(String[] args) {


        System.out.println("Probando el conversor de medidas.");
        ConversorMedidasDatos medidasDatos = new ConversorMedidasDatos(300L, "KB");

        System.out.println("300 Kb equivalen a: " + medidasDatos.getGigaByte() + " GB");



    }







}


