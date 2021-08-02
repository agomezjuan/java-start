import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /**
         * Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
         * que calcule el peso ideal. peso ideal mujeres = altura - 120 peso ideal
         * hombres = altura - 110
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor indique su género (H/M):");
        String sexo = sc.nextLine().toUpperCase();

        switch (sexo) {
            case "H":
                System.out.println("Ahora indique su altura (cm):");
                int alturaH = sc.nextInt();
                int pesoIdealHombre = alturaH - 110;
                System.out.println("Tu peso ideal es " + pesoIdealHombre + "Kg.");
                break;
            case "M":
                System.out.println("Ahora indique su altura (cm):");
                int alturaM = sc.nextInt();
                int pesoIdealMujer = alturaM - 120;
                System.out.println("Tu peso ideal es " + pesoIdealMujer);
                break;
            default:
                System.out.println("La opción escogida no es correcta.");
        }

        sc.close();
    }
}
