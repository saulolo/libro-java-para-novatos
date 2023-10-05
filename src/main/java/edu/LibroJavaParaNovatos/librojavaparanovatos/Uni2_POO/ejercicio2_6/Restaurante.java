package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni2_POO.ejercicio2_6;

import static edu.LibroJavaParaNovatos.librojavaparanovatos.utils.Constants.*;

/**
 *
 * @author Saulolo
 *
 */

/*En un restaurante especializado en huevos fritos con chorizo necesitan un programa que les calcule
cuántos platos de huevos con chorizo pueden preparar con la cantidad de existencias disponibles en la
cámara frigorífica.
Escribe los siguientes métodos:
- constructor(int, double): recibirá el número de docenas de huevos y de kilos de chorizo disponible en
el frigorífico.
- addHuevos(int): incrementa el número de docenas de huevos.
- addChorizos(double): incrementa el número de kilos de chorizo.
- getNumPlatos(): devuelve el número de platos de huevos con chorizo que se pueden ofrecer con las
existencias actuales, teniendo en cuenta que cada plato necesita una media de 2 huevos y 200 gramos de
chorizo.
- sirvePlato(): disminuye el número de huevos y de kilos de chorizo porque se ha servido un plato
(2 huevos menos y 200 gramos de chorizo menos)
- getHuevos(): devuelve el número de huevos (no de docenas) que quedan en la cámara.
- getChorizo(): devuelve el número de kilos de chorizo que quedan en la cámara.
 */


/**
 * Esta clase representa un restaurante que utiliza huevos y chorizos como ingredientes
 * para preparar platos. Permite agregar ingredientes, calcular cuántos platos se pueden
 * cocinar y servir platos.
 */
public class Restaurante {

    private int huevos; // Número de huevos.
    private int chorizos; // Gramos de chorizos.

    /**
     * Constructor parametrizado que inicializa un objeto Restaurante con dos cantidades
     * de ingredientes, huevos y chorizos.
     *
     * @param docenaDeHuevos Cantidad de huevos por docenas.
     * @param kgDeChorizos   Cantidad de chorizo en Kg.
     */
    public Restaurante(int docenaDeHuevos, double kgDeChorizos) {
        this.huevos = docenaDeHuevos * 12; // Almacenamos el número de huevos, no de docenas.
        this.chorizos = (int) kgDeChorizos * 1000; // Vamos a guardar la cantidad en gramos.
    }

    /**
     * Agrega una cantidad de docenas de huevos al inventario del restaurante.
     *
     * @param num Cantidad de docenas de huevos a agregar.
     */
    public void addHuevos(int num) {    // Incrementa el número de huevos
        huevos = huevos + (num * DOCENA);
    }

    /**
     * Agrega una cantidad de kilogramos de chorizo al inventario del restaurante.
     *
     * @param num Cantidad de kilogramos de chorizo a agregar.
     */
    public void addChorizos(double num) {     // Incrementa la cantidad de gramos de chorizo. El método recibe la
        chorizos = (int) (chorizos + (num * KG)); // La cantidad se expresa en kg, así que la multiplicamos por 1000.
    }

    /**
     * Calcula cuántos platos se pueden cocinar con las cantidades actuales de huevos y chorizo.
     *
     * @return El número máximo de platos que se pueden preparar.
     */
    public int getNumPlatos() {    // Calcula cuántos platos se pueden cocinar con las cantidades actuales de huevos y chorizo
        // Calculamos cuántos platos se pueden preparar con los huevos actuales
        int n1 = huevos / DOS; // Cada plato necesita 2 huevos
        // Calculamos cuántos platos se pueden preparar con los chorizos actuales
        int n2 = chorizos / DOSCIENTOS; // Cada plato necesita 200 gr de chorizo
        // El número máximo de platos que se pueden preparar será el menor entre n1 y n2
        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }
    }

    /**
     * Resta una cantidad al número de huevos y chorizos, como resultado de haber servido un plato.
     */
    public void sirvePlatos() {  // (2 huevos menos y 200 gr de chorizo menos)
        huevos = huevos - DOS;
        chorizos = chorizos - DOSCIENTOS;
    }

    /**
     * Obtiene el número actual de huevos en inventario.
     *
     * @return El número actual de huevos.
     */
    public int getHuevos() {   // Devuelve el número actual de huevos

        return huevos;
    }

    /**
     * Obtiene la cantidad actual de chorizo en inventario en kilogramos.
     *
     * @return La cantidad actual de chorizo en inventario en kilogramos.
     */
    public double getChorizos() {     // Devuelve el número actual de kg de chorizo
        return ((double) chorizos / KG);
    }
}


