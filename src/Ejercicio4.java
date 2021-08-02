import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
         * número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
         * tabla y mostrar los datos.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un número para generar su tabla de multiplicar: ");
        int numero = sc.nextInt();

        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
