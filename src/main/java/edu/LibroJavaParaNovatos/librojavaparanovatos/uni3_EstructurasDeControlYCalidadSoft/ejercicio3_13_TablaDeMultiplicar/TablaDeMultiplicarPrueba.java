package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_13_TablaDeMultiplicar;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Saulolo
 */
public class TablaDeMultiplicarPrueba {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String into = "TABLA DE MULTIPLICAR";
        JOptionPane.showMessageDialog(null, into);

        TablaDeMultiplicar miPrimerNumero = new TablaDeMultiplicar();

        int numero;
        System.out.print("Ingrese el número que desea visualizar su tabla de multiplicar: ");
        numero = input.nextInt();

        miPrimerNumero.setNumeroTabla(numero);

        miPrimerNumero.mostrarTabla();

        input.close();

    }

}
