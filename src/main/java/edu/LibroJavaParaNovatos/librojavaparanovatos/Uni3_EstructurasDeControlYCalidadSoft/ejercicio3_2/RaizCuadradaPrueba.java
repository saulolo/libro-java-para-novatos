package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni3_EstructurasDeControlYCalidadSoft.ejercicio3_2;


import edu.LibroJavaParaNovatos.librojavaparanovatos.Uni3_EstructurasDeControlYCalidadSoft.ejercicio3_1.PositivoYNegativo;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */
public class RaizCuadradaPrueba {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "RAÍZ CUADRADA");


        RaizCuadrada raizCuadrada = new RaizCuadrada();

        System.out.println("Ingresa un número, por favor: ");
        int numero = input.nextInt();


        System.out.println(raizCuadrada.calcularRaizCuadrada(numero));


    }

}


