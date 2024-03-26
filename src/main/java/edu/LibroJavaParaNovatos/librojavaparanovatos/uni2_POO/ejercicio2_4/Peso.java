package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_4;

/**
 * @author Saulolo
 */

public class Peso {

    /**
     * Crea una clase llamada Peso que tenga estas características:
     * - Un constructor al que se le pase un peso y la unidad de medida en la que está tomado, que puede ser
     * Lb (libras), Oz (onzas), Kg (kilogramos) o g (gramos)
     * - Un método getLibras() que nos devuelva el peso en libras.
     * - Un método getOnzas() que nos devuelva el peso en onzas.
     * - Un método getPeso() que nos devuelve el peso en kilogramos.
     * Puedes encontrar en Internet las equivalencias entre estas unidades de medida.
     */

    private double gramos = 0;


    /**
     * Constructor parametrizado que inicializa un objeto Peso con una cantidad y una unidad de médida
     * y convierte cualquier unidad ingresada a gramos.
     * @param cantidad La cantidad del peso en la unidad especificada.
     * @param unidad La unidad de medida (gr, kr, lb ó oz).
     * @throws IllegalArgumentException Si se proporciona una unidad de médida no válida.
     */
    public Peso(double cantidad, String unidad) {
        if (unidad == "gr") gramos = cantidad;
        else if (unidad.equals("kg")) gramos = cantidad * 1000;
        else if (unidad.equals("lb")) gramos = cantidad / 0.0022;
        else if (unidad.equals("oz")) gramos = cantidad / 0.0353;
        else throw new IllegalArgumentException("Unidad no válida: " + unidad);
    }


    /**
     * Método para convertir un peso dado de gramos a libras.
     * @return El equivalente en libras del peso dado en gramos.
     */
    public double getLibras() {
        double libras = gramos * 0.002205;
        return libras;
    }


    /**
     * Método para convertir un peso dado de gramos a onzas.
     * @return El equivalente del peso dado en onzas.
     */
    public double getOnzas() {
        double onzas = gramos * 0.035274;
        return onzas;
    }


    /**
     * Método para convertir un peso dado de gramos a kilogramos.
     * @return El equivalente del peso dado en kilogramos.
     */
    public double getPeso() {
        double kilogramos = gramos / 1000;
        return kilogramos;
    }

    /**
     * Método para convertir un peso dado de gramos a los mismos gramos.
     * @return El equivalente del peso dado en gramos.
     */
    public double getGramos() {
        return gramos;
    }

}
