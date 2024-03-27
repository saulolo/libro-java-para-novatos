package edu.LibroJavaParaNovatos.librojavaparanovatos.uni3_EstructurasDeControlYCalidadSoft.Ejercicio3_4_AnioBisiesto;


/**
 * Determinar si un año es bisiesto o no. Los años bisiestos son múltiplos de 4; utilícese el operador
 * módulo. ¡Pero hay más excepciones! Los múltiplos de 100 no son bisiestos, aunque sean múltiplos de 4.
 * Pero los múltiplos de 400 sí, aunque sean múltiplos de 100. Qué follón. La Tierra es muy maleducada al no
 * ajustarse a los patrones de tiempo humanos.
 * Resumiendo: un año es bisiesto si es divisible entre 4, a menos que sean divisible entre 100. Sin embargo,
 * si un año es divisible entre 100 y además es divisible entre 400, también resulta bisiesto.
 * Ahora, prográmalo, a ver qué sale.
 * @author Saulolo
 */
public class AnioBisiesto {


    public String calcularAnioBisiesto (int anio) {
        if ((anio %4 == 0 && anio %100 != 0) || (anio %400 == 0)) return "El año " + anio + " es bisiesto";
        else return "El año " + anio + " No es bisiesto";
    }

}
