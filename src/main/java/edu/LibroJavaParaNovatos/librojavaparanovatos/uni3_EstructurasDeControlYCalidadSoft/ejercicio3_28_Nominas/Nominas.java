package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.ejercicio3_28_Nominas;

/**
 * Escribe un método que calcule el dinero que debe cobrar un trabajador a la semana, pasándole como parámetros el
 * número de horas semanales que ha trabajado y el precio que se le paga por cada hora. Si ha trabajado más de 40
 * horas, el salario de cada hora adicional es 1,5 veces el de las horas convencionales.
 * (Por si alguien no lo sabe, 40 horas es el número máximo de horas que se pueden trabajar semanalmente en España;
 * el resto a partir de ahí se consideran "horas extraordinarias" y se deben pagar de forma generosa)
 * Escribe otros métodos que calculen además:
 * - El salario bruto mensual, sabiendo que todas las horas que excedan de 40 semanales se consideran horas extra. Las
 * primeras 5 horas extra se cobran a 1,5 veces la tarifa normal, y las demás al doble de la tarifa normal.
 * - Los descuentos por impuestos: se le descontará un 10% si gana menos de 1000 € al mes, y un 15% si gana más de
 * esa cantidad.
 * El salario neto, es decir, el dinero que cobrará después de descontar los impuestos.
 * @author Saulolo
 */
public class Nominas {

    int semanas = 4;
    double horaExtra = 1.5;
    double horaExtraDoble = 2.0;
    double descuento10 = 0.1;
    double descuento15 = 0.15;


    /**
     * Calcula el salario semanal de un trabajador.
     * @param horasSemanales número de horas trabajadas en la semana.
     * @param valorHora      costo por hora de trabajo.
     * @return salario semanal.
     */
    public double salarioSemanal(int horasSemanales, double valorHora) {
        if (horasSemanales > 40) {
            int horasNormales = 40;
            int horasExtra = horasSemanales - 40;
            return (horasSemanales * valorHora) + (horaExtra * valorHora * horasExtra);
        }
        return horasSemanales * valorHora;
    }


    /**
     * Calcula el salario bruto mensual de un trabajador.
     * @param horasSemanales número de horas trabajadas en la semana.
     * @param valorHora      costo por hora de trabajo.
     * @return salario bruto mensual.
     */
    public double salarioMensual(int horasSemanales, double valorHora) {

        double salarioSemanalBase = 40 * valorHora;
        double salarioExtraSemanal = 0;

        if (horasSemanales > 40) {
            int horasExtra = horasSemanales - 40;
            int horasExtraDobles = Math.max(0, horasExtra - 5);
            int horasExtraSimples = Math.min(horasExtra, 5);

            salarioExtraSemanal = (horasExtraSimples * valorHora * horasExtra) +
                    (horasExtraDobles * valorHora * horasExtraDobles);
        }

        double salarioBrutoSemanal = salarioSemanalBase + salarioExtraSemanal;
        return salarioBrutoSemanal * semanas; // Asumimos 4 semanas en un mes.
    }


    /**
     * Calcula los impuestos basados en el salario bruto mensual.
     * @param salarioTotal salario bruto mensual.
     * @return descuento en base a impuestos.
     */
    public double impuestos(double salarioTotal) {
        if (salarioTotal < 1000) {
            return salarioTotal * descuento10;
        }
        return salarioTotal * descuento15;
    }


    /**
     * Calcula el salario neto mensual después de impuestos.
     * @param horasSemanales número de horas trabajadas en la semana.
     * @param valorHora costo por hora de trabajo.
     * @return salario neto mensual.
     */
    public double salarioNeto(int horasSemanales, double valorHora) {
        double salarioBrutoMensual = salarioMensual(horasSemanales, valorHora);
        double descuentos = impuestos(salarioBrutoMensual);
        return salarioBrutoMensual - descuentos;
    }
}

