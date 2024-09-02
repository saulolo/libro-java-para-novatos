package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_16_EstadisticaBasica;

import java.util.Arrays;

/**
 * Calcular el valor máximo de una serie de 10 números introducidos por teclado. Completa luego la
 * clase para que también averigüe el valor mínimo, el medio, la desviación típica y la mediana.
 * Si no sabes lo que es alguna de estas cosas, háztelo mirar. También puedes probar en internet.
 * (Importante: calcular cosas como la desviación típica sin utilizar arrays es una tarea propia de
 * criaturas mitológicas, así que usaremos la solución de este ejercicio como excusa para introducir
 * los arrays en un contexto con significado. Pero, antes, deberías haber pensado un rato en las
 * posibles soluciones)
 * @author Saulolo
 */
public class EstadisticaBasica {

    //Atributos
    private int max = -999999;
    private int min = 999999;
    private int suma;
    private int[] n;
    private int numValores;


    //Constructor
    public EstadisticaBasica() {
        n = new int[10];
    }

    /**
     * Agrega un número al acumulador y realiza un seguimiento del mínimo y máximo.
     * @param num El número que se va a agregar.
     */
    public void addNumero(int num) {
        suma = suma + num;
        if(num > max) max = num; //Calculo el minimo
        if (num < min) min = num; //Calculo el máximo
        n[numValores] = num;  //Almaceno el número en el array n
        numValores++;
    }


    public int getMax() {
        return max;
    }


    public int getMin() {
        return min;
    }


    /**
     * Calcula y devuelve la media de los números almacenados en el objeto.
     * La media se calcula dividiendo la suma total de los números por el número total de elementos,
     * que en este caso es 10.
     * @return La media de los números almacenados en el objeto como un valor de tipo double.
     */
    public double media() {
        return (double) suma / 10;
    }


    /**
     * Calcula y devuelve la desviación estándar de los números almacenados en el objeto.
     * La desviación estándar se calcula como la raíz cuadrada de la varianza.
     * La varianza se calcula como el promedio de las diferencias al cuadrado entre cada número y la media.
     * @return La desviación estándar de los números almacenados en el objeto como un valor de tipo double.
     */
    public double getDesviacion() {
        double desv;
        double media;

        // Gracias que tenemos todos los valores almacenados en el array n, podemos calcular la desviación fácilmente
        media = media();
        desv = 0;

        for (int i = 0; i < 10; i++) {
            desv = desv + Math.pow(n[i] - media, 2);
        }
        desv = desv / 10;
        desv = Math.sqrt(desv);

        return desv;
    }


    /**
     * Calcula y devuelve la mediana de los números almacenados en el objeto.
     * La mediana se calcula ordenando los números almacenados y tomando el valor medio si hay un número impar de elementos,
     * o la media entre los dos valores centrales si hay un número par de elementos.
     * @return La mediana de los números almacenados en el objeto como un valor de tipo double.
     */
    public double getMediana() {
        Arrays.sort(n);  //Ordena el array

        // Calculamos la mediana (la media entre el quinto y el sexto números de la serie)
        // Gracias al array n es muy fácil: basta con acceder a n[4] (quinto) y n[5] (sexto)
        return ((double) (n[4] + n[5])) / 2;
    }
}
