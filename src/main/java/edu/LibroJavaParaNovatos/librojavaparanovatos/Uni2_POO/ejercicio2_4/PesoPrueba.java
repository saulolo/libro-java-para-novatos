package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni2_POO.ejercicio2_4;

/**
 * @author Saulolo
 */

public class PesoPrueba {

    public static void main(String[] args) {

        Peso peso1 = new Peso(68000.0, "gr");
        Peso peso2 = new Peso(4, "lb");
        Peso peso3 = new Peso(50, "kg");
        Peso peso4 = new Peso(100, "oz");

        System.out.println("PROBANDO EL MÉTODO getPeso");
        System.out.println("Mi peso es de 68000 gr, equivale a: " + peso1.getPeso() + " en Kg." );
        System.out.println("4 libras de carne, equivalen a: " + peso2.getOnzas() + " oz.");
        System.out.println("Mi perro pesa 50 Kg, su equivalente en kg es: " + peso3.getPeso() + " Kg.");
        System.out.println("100 onzas son: " + peso4.getPeso() + " gr.");

        System.out.println("PROBANDO EL RESTO DE GETTERS:");
        System.out.println("Diez kilogramos son " + peso3.getOnzas() +  " oz");
        System.out.println("Diez kilogramos son " + peso3.getLibras() +  " lb");
        System.out.println("Diez kilogramos son " + peso3.getGramos() +  " kg");

    }

}
