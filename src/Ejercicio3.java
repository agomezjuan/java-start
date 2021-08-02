import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Realizar un programa que calcule el sueldo de un trabajador, el programa
     * solicita el número de horas que has trabajado en un mes, las horas se pagan a
     * $30.000.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas horas ha trabajado este mes?");
        int horas = sc.nextInt();
        sc.close();

        int sueldo = horas * 30000;

        System.out.printf("El el sueldo de este mes es: $%d\n", sueldo);
    }
}
