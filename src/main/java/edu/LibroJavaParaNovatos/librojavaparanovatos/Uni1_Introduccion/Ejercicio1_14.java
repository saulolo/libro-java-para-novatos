package edu.LibroJavaParaNovatos.librojavaparanovatos.Uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */


/* Los siguientes programas contienen uno o varios errores que hacen que no
compilen. Modíficalos hasta que funcionen correctamente.
A)
class Suma {
 static int n1 = 50;
 public static void main (String[] args) {
   int n2 = 30, suma = 0, n3;
   suma = n1 + n2;
   System.out.println("La suma es: " + suma);
   suma = suma + n3;
   System.out.println(suma);
  }
}

B)
class Suma {
  public static void main (String[] args) {
   int n1 = 5, n2 = 6;
   boolean suma = 0;
   suma = n1 + n2;
   System.out.println(La suma es = suma);
  }
}

C)
class Cuadrado {
 public static void main (String[] args) {
 int n = 8;
 cuad = n * n;
 System.out.println("El cuadrado de " + N + " es: " + cuad);
 }
}

*/
public class Ejercicio1_14 {

    public static void main(String[] args) {

        String into = ("CORRIGE LOS ERRORES");
        JOptionPane.showMessageDialog(null, into);

        /*
        A) La variable n3 no tiene ningún valor asignado, por lo que la instrucción suma =
        suma + n3 falla. Basta con asignarle algún valor (aunque sea cero) antes de utilizarla
        por primera vez.
        B) La variable suma es de tipo boolean, lo que no tiene ningún sentido. Debería ser
        de tipo int. Así, el programa sí funciona.
        C) Se ha intentado usar una variable (cuad) sin haberla declarado previamente. Bastará
        con escribir int cuad; antes de usarla para solucionar el problema. También puede declararse
        la primera vez que se usa, es decir: int cuad = n * n;
         */

        
    }
}
