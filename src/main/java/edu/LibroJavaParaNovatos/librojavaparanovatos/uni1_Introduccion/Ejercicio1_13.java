package edu.LibroJavaParaNovatos.librojavaparanovatos.uni1_Introduccion;

import javax.swing.*;

/**
 *@author Saulolo
 */


/* ¿Qué mostrará el siguiente programa por pantalla, y por qué? (Pista: necesitarás averiguar
qué significa el prefijo 0x escrito delante de un número, y para qué sirve el operador >>>)
public class Incognita {
 public static void main(String[] args) {
  int i = 0x100;
  i = i >>> 1;
  System.out.println(i);
 }
}
*/
public class Ejercicio1_13 {

    public static void main(String[] args) {

        String into = ("PROGRAMA MISTERIOSO");
        JOptionPane.showMessageDialog(null, into);

        /*
        El objetivo de este ejercicio era que curiosearas un poco por internet para buscar
        información acerca de detalles del lenguaje de programación que ignoras. Es muy
        frecuente que los programadores tengan que hacer esto durante el desarrollo de un
        programa, y potenciaremos ese comportamiento a lo largo del libro. Si te has molestado
        en ejecutar el código misterioso en tu ordenador, habrás visto que muestra el número 128
        en la pantalla. Pero, ¿por qué?, En primer lugar, todos los números precedidos por “0x”
        se consideran escritos en hexadecimal. El hexadecimal es un sistema de numeración basado en
        16 dígitos, no en 10, como es lo más habitual. Esos dígitos son 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
        A, B, C, D, E y F, de modo que puedes encontrar números que incluyen, de hecho, letras en su
        interior, tales como 23A o FFE.
        ¿A qué número decimal equivale 100 en hexadecimal? Muy sencillo: a 256. Fíjate que 100,
        en hexadecimal (o sea, 0x100) no significa “cien”, sino “doscientos cincuenta y seis”.
        Lo que ocurre es que tú estás acostumbrado/a a ver “100” y pensar “cien”, porque siempre
        utilizas el sistema decimal, en el que, en efecto, “100” significa “cien”.
        Hazte a la idea de que el hexadecimal es un idioma distinto, aunque sea un idioma peculiar,
        porque solo sirve para expresar números, no cualquier concepto. Pero la idea es la misma.
        En inglés, “table” se refiere al concepto “mesa”, pero no se escribe “mesa”. Pues es lo
        mismo: “0x100” se refiere al concepto “doscientos cincuenta y seis”, pero no se escribe
        “256”.
        Para aprender más sobre el sistema hexadecimal y otros sistemas de numeración relacionados
        (como el binario y el octal) puedes leer algún libro sobre introducción a la informática.
        Yo mismo expliqué esto con bastante detalle en “Aprender a programar en C: de 0 a 99 en
        un solo libro”. Aquí no nos extenderemos más, porque este libro ya está quedando demasiado
        voluminoso.
        Bien, tenemos que la variable i vale 0x100, es decir, 256. ¿Qué ocurre al ejecutar
        i >>> 1? Si has curioseado un poco por internet, habrás encontrado que el operador
        “>>>” provoca un desplazamiento de bits a la derecha, rellenando con ceros. Un momento, un
        momento. ¿Un qué de qué?, Todos los números (y los caracteres, y las informacion
        multimedia…) se representan internamente en el ordenador codificados en binario, es decir,
        con ceros y unos. El número 256, en concreto, es 1111 1111 en binario. Desplazar a la derecha
        significa eso: que cada dígito binario se desplazará una posición a la derecha en el número original. Así que 1111 1111 se convierte en 0111 1111 (se rellena con ceros a la izquierda). Pues bien, el número 0111 1111 en decimal se escribe 128.
        Misterio resuelto.
        Si quieres saber más sobre el sistema de codificación binario, nuevamente te remito a mi
        libro “Aprender a programar en C: de 0 a 99 en un solo libro” o a cualquier otro manual
        de introducción a la informática de tu elección.

         */



        
    }
}
