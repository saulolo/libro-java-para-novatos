package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_6;


/**
 * @author Saulolo
 */

public class RestaurantePrueba {

    public static void main(String[] args) {


        // Creamos un restaurante con 4 docenas de huevos y 10 kg de chorizo
        Restaurante rest = new Restaurante(4,10);

        System.out.println("\n\nPROBANDO LA CLASE restaurante\n\n");
        System.out.println("Estado inicial:");
        System.out.println("  Huevos = " + rest.getHuevos() + ", chorizo = " + rest.getChorizos() + " kg");
        System.out.println("  Número de platos que se pueden preparar = " + rest.getNumPlatos());

        rest.addHuevos(2);   // Añadimos dos docenas de huevos
        rest.addChorizos(9);  // Añadimos nueve kg de chorizo
        System.out.println("Estado después de añadir huevos y chorizo:");
        System.out.println("  Huevos = " + rest.getHuevos() + ", chorizo = " + rest.getChorizos() + " kg");
        System.out.println("  Número de platos que se pueden preparar = " + rest.getNumPlatos());

        rest.sirvePlatos();   // Servimos un plato
        System.out.println("Estado después de servir un plato:");
        System.out.println("  Huevos = " + rest.getHuevos() + ", chorizo = " + rest.getChorizos() + " kg");
        System.out.println("  Número de platos que se pueden preparar = " + rest.getNumPlatos());

        rest.sirvePlatos();   // Servimos cinco platos
        rest.sirvePlatos();
        rest.sirvePlatos();
        rest.sirvePlatos();
        rest.sirvePlatos();
        System.out.println("Estado después de servir cinco platos más:");
        System.out.println("  Huevos = " + rest.getHuevos() + ", chorizo = " + rest.getChorizos() + " kg");
        System.out.println("  Número de platos que se pueden preparar = " + rest.getNumPlatos());


    }

}
