import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
     * adivinar introduciendo el número por teclado. En el caso que el número a
     * adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
     * mayor”, de lo contrario, “El número que busca es menor”. El programa
     * finalizará cuando se introduzca el número correcto. Nota: usar la clase
     * Random para generar el número aleatorio.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 100);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número!");
        int numeroDelUsuario = sc.nextInt();

        while (numeroAleatorio != numeroDelUsuario) {
            if (numeroAleatorio > numeroDelUsuario) {
                System.out.println("\nEl número que busca es mayor.");
                System.out.println("Adivina el número!");
                numeroDelUsuario = sc.nextInt();
            } else {
                System.out.println("\nEl número que busca es menor.");
                System.out.println("Adivina el número!");
                numeroDelUsuario = sc.nextInt();
            }
        }

        if (numeroDelUsuario == numeroAleatorio) {
            System.out.println("\nMuy bien, " + numeroAleatorio + " es el número correcto.");
        }
        sc.close();

    }

}
