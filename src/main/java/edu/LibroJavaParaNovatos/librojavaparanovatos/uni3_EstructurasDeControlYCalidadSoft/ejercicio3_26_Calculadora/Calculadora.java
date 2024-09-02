package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_26_Calculadora;

/**
 * Diseñar un algoritmo que lea dos números, A y B, y un operador (mediante una variable de tipo carácter), y calcule
 * el resultado de operar A y B con esa operación. Por ejemplo, si A = 5 y B = 2, y operación = "+", el resultado debe
 * ser 7. El algoritmo debe seguir pidiendo números y operaciones indefinidamente, hasta que el usuario decida terminar
 * (utiliza un valor centinela para ello).
 * @author Saulolo
 */
public class Calculadora {


    public String operacion (String operador, int a, int b) {

        int resultado;
        switch (operador) {
            case "+":
                resultado = (a + b);
                break;
            case "-":
                resultado = (a - b);
                break;
            case "*":
                resultado = (a * b);
                break;
            case "/":
                if (b == 0) return "La division por cero no es posible";
                resultado = (a / b);
                break;
            default:
                return "Operador no válido";
        }
        return "EL resultado de la operación es: " + a + " " + operador + " " + b + " = " + resultado;
    }
}
