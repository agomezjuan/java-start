public class Ejercicio1 {
    public static void main(String[] args) {

        /**
         * Realizar la suma, la resta, la división y la multiplicación de dos números
         * leídos por teclado y mostrar en pantalla “La <operación> de <número 1> y
         * <número 2> es igual a <resultado> ”
         */

        // Lectura de datos
        System.out.println("Por favor, introduce un número: ");
        int primerNumero = Integer.parseInt(System.console().readLine());

        System.out.println("introduce otro, por favor: ");
        int segundoNumero = Integer.parseInt(System.console().readLine());

        // Operaciones
        int suma = primerNumero + segundoNumero;
        int resta = primerNumero - segundoNumero;
        int multiplicacion = primerNumero * segundoNumero;
        double division = (double) primerNumero / (double) segundoNumero;

        // Salida en pantalla
        System.out.println("La suma de " + primerNumero + " más " + segundoNumero + " es igual a " + suma);
        System.out.println("La resta de " + primerNumero + " menos " + segundoNumero + " es igual a " + resta);
        System.out.println(
                "La multiplicación de " + primerNumero + " por " + segundoNumero + " es igual a " + multiplicacion);
        System.out.printf("La división de %d entre %d es igual a %.2f\n", primerNumero, segundoNumero, division);

    }
}
