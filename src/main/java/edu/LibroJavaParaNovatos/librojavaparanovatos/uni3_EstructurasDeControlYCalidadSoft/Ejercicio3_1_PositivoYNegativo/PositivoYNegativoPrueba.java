package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_1_PositivoYNegativo;


import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */
public class PositivoYNegativoPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "VALIDANDO NÚMERO POSITIVO O NEGATIVO");


        System.out.println("Ingresa un número por favor: ");
        int numero = input.nextInt();


        PositivoYNegativo positivoYNegativo = new PositivoYNegativo();

        positivoYNegativo.comprobarPositivoNegativo(numero);

        input.close();
    }

}


