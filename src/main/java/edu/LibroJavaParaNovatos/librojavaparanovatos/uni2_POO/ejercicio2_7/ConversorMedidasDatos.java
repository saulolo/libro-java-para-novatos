package edu.LibroJavaParaNovatos.librojavaparanovatos.uni2_POO.ejercicio2_7;

import static edu.LibroJavaParaNovatos.librojavaparanovatos.utils.Constants.*;
/**
 * Se desea construir una clase capaz de convertir cualquier medida de información en cualquier otra.
 * Al constructor se le pasará un número entero y una unidad de medida, y existirán métodos para
 * convertir a cualquier otra unidad. Por ejemplo:
 * getByte(): devolverá la cantidad expresada en Bytes.
 * getBits(): devolverá la cantidad expresada en bits.
 * getGb(): devolverá la cantidad expresada en gigabits
 * getMB(): devolverá la cantidad expresada en gigabytes
 * getMiB(): devolverá la cantidad expresada en mebibytes
 * Etc.
 * @author Saulolo
 */
public class ConversorMedidasDatos {

    private long bits;

    /**
     * Constructor de la clase que inicializa el objeto ConversorMedidasDatos con una cantidad y su unidad de medida.
     *
     * @param numero La cantidad de información en la unidad de medida especificada.
     * @param unidadMedida La unidad de medida de la cantidad (por ejemplo, "B" para bytes, "KB" para kilobytes, etc.).
     * @throws IllegalArgumentException Si se proporciona una unidad de medida no válida.
     */
    public ConversorMedidasDatos(long numero, String unidadMedida) {
        if(unidadMedida.equals("B")) bits = numero * BITS_PER_BYTE;
        else if (unidadMedida.equals("KB")) bits = numero * BITS_PER_KILOBYTE;
        else if (unidadMedida.equals("MB")) bits = numero * BITS_PER_MEGABYTE;
        else if (unidadMedida.equals("GB")) bits = numero * BITS_PER_GIGABYTE;
        else if (unidadMedida.equals("TB")) bits = numero * BITS_PER_TERABYTE;
        else if (unidadMedida.equals("PB")) bits = numero * BITS_PER_PETABYTE;
        else throw new IllegalArgumentException("Unidad de medida no válida " + unidadMedida);
    }


    /**
     * Obtiene la cantidad de información actual en bits.
     *
     * @return La cantidad de información en bits.
     */
    public Long getBits() {
        return bits;
    }

    /**
     * Convierte la cantidad de información actual de bits a bytes.
     *
     * @return La cantidad de información en bytes.
     */
    public long getByte() {
        long Byte = bits / BITS_PER_BYTE;
        return Byte;
    }

    /**
     * Convierte la cantidad de información actual de bits a kilobytes.
     *
     * @return La cantidad de información en kilobytes.
     */
    public long getKiloByte() {
        long kiloByte = bits / BITS_PER_KILOBYTE;
        return kiloByte;
    }

    /**
     * Convierte la cantidad de información actual de bits a megabytes.
     *
     * @return La cantidad de información en megabytes.
     */
    public long getMegaByte() {
        long megaByte = bits / BITS_PER_MEGABYTE;
        return megaByte;
    }

    /**
     * Convierte la cantidad de información actual de bits a gigabytes.
     *
     * @return La cantidad de información en gigabytes.
     */
    public long getGigaByte() {
        long gigaByte = bits / BITS_PER_GIGABYTE;
        return gigaByte;
    }

    /**
     * Convierte la cantidad de información actual de bits a terabytes.
     *
     * @return La cantidad de información en terabytes.
     */
    public long getTeraByte() {
        long teraByte = bits / BITS_PER_TERABYTE;
        return teraByte;
    }

    /**
     * Convierte la cantidad de información actual de bits a petabytes.
     *
     * @return La cantidad de información en petabytes.
     */
    public long getPetaByte() {
        long petaByte = bits / BITS_PER_PETABYTE;
        return petaByte;
    }

}


