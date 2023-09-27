package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */

/*¿Puedes adivinar qué salida por pantalla produce este programa antes de
ejecutarlo? Necesitarás buscar primero qué significan los operadores += y
%=
class Adivinanza {
 public static void main (String[] args) {
  int num = 5;
  num += num – 1 * 4 + 1;
  System.out.println(num);
  num = 4; num %= 7 * num % 3 * 7;
  System.out.println(num);
 }
}

*/
public class Ejercicio1_15 {

    public static void main(String[] args) {

        String into = ("CORRIGE LOS ERRORES");
        JOptionPane.showMessageDialog(null, into);

        /*
        El programa realiza las siguientes operaciones:
        1. Inicializa una variable num con el valor de 5.
        2. Luego, realiza la operación num += num - 1 * 4 + 1, que incrementa num en 2 unidades,
        por lo que num se convierte en 7.
        3. Imprime el valor de num, que es 7.
        Luego, reinicializa la variable num con el valor de 4 y realiza la operación num %= 7
        * num % 3 * 7, que calcula el residuo de la división de num por 7. El resultado es 4.
        Finalmente, imprime el nuevo valor de num, que es 4.
        En resumen, el programa muestra las siguientes salidas:
        7
        4
        El código utiliza operadores de asignación (+= y %=) y operadores aritméticos para
        realizar estas operaciones en la variable num.
         */
        
        
    }
}
