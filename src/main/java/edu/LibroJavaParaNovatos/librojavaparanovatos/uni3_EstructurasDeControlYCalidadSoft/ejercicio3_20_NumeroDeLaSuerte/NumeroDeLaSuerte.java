package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_20_NumeroDeLaSuerte;

/**
 * El número de la suerte o lucky number, por si hay alguien de Cuenca, es una tontuna de los
 * numerólogos y otros charlatanes que se obtiene sumando todas las cifras de la fecha de nacimiento
 * de un modo azaroso. Por ejemplo, Como yo nací el 15 de octubre de 1974 (15-10-1974), se supone
 * que mi número de la suerte es 15+10+1974 = 1999. Ahora sumo todas las cifras de 1999 así:
 * 1+1+1+9 = 12. Como aún tengo dos dígitos, vuelvo a sumarlos. 1 + 2 = 3.
 * Por lo tanto, 3 es mi número de la suerte. Si alguna vez me toca la lotería y llevo un número
 * acabado en 3, os aviso.
 * Escribe un programa que, dada una fecha de nacimiento, calcule el número de la suerte de esa
 * persona.
 *
 * @author Saulolo
 */
public class NumeroDeLaSuerte {

    private int dia;
    private int mes;
    private int anio;
    private int luckyNumber;

    public NumeroDeLaSuerte(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Calcula el número de la suerte basado en la fecha de nacimiento proporcionada.
     *
     * @param dia  El día de nacimiento.
     * @param mes  El mes de nacimiento.
     * @param anio El año de nacimiento.
     * @return El número de la suerte calculado.
     * Si la fecha de nacimiento no es válida (por ejemplo, si el día está fuera del rango 1-31,
     * el mes fuera del rango 1-12 o el año es menor que 1), se imprime un mensaje de error
     * y se devuelve -1.
     */
    public int calcularLuckyNumber(int dia, int mes, int anio) {
        // Verificar si la fecha de nacimiento es válida
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1) {
            System.out.println("Fecha de nacimiento inválida.");
            return -1;
        }
        // Calcular el número de la suerte
        luckyNumber = dia + mes + anio;
        String luckyNumberString = String.valueOf(luckyNumber);
        int sumaDigitos = 0;
        for (int i = 0; i < luckyNumberString.length(); i++) {
            sumaDigitos += luckyNumberString.charAt(i) - '0';
        }
        // Continuar sumando los dígitos hasta que quede un solo dígito
        while (sumaDigitos >= 10) {
            int tempSuma = 0;
            while (sumaDigitos > 0) {
                tempSuma += sumaDigitos % 10;
                sumaDigitos /= 10;
            }
            sumaDigitos = tempSuma;
        }
        return sumaDigitos;
    }


    /**
     * Imprime el número de la suerte calculado a partir de la fecha de nacimiento proporcionada.
     * Utiliza el método {@code calcularLuckyNumber} para obtener el número de la suerte y lo muestra
     * en la consola.
     */
    public void impresion() {
        System.out.println("Tu numero de la suerte es el: " + calcularLuckyNumber(dia, mes, anio));
    }
}
