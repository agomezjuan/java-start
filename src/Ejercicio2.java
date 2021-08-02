import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Realizar un programa que realice el promedio de las notas de un alumno, para
         * ello el programa va a tener que solicitar el nombre del alumno y las notas de
         * las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a 3.0
         * también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
         * “Reprobado” . Requisitos: Las notas que se ingresan pueden tener decimales.
         */
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce la nota de la primera evaluación: ");
        float primeraNota = s.nextFloat();

        System.out.print("Introduce la nota de la segunda evaluación: ");
        float segundaNota = s.nextFloat();

        System.out.print("Introduce la nota de la tercera evaluación: ");
        float terceraNota = s.nextFloat();

        s.close();

        float promedio = (primeraNota + segundaNota + terceraNota) / 3;

        System.out.printf("La nota promedio del alumno fue: %3.2f\n", promedio);

        if (promedio >= 3.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}
