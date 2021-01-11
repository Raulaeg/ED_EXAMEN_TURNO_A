import java.util.*;
/**
 * Ejercicio examen 1 EVAL ED
 * @author RA�L AYALA EGGERS 13308993C
 * @version 1.0
 *
 */

public class EmpleadoED_13308993C {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /**
     * Constructor con dos par�metros
     * @param nombreCompleto nombre completo en may�sculas 
     * @param dni documento nacional de identidad con letra y sin espacios
     */
    public EmpleadoED_13308993C(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    
    /**
     * Calcula el salario bruto mensual en funci�n del salario base por hora y las horas extras
     * El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA
     * @param horasExtra n�mero de horas extra dedicadas redondeando a la baja (entero)
     * @return devuelve el salario bruto mensual en euros con dos decimales
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este m�todo no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE L�NEA        
        EmpleadoED_13308993C emp = new EmpleadoED_13308993C("RA�L AYALA", "13308993C");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes ser� de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }
}