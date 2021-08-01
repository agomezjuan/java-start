public class Ejercicio1 {
    public static void main(String[] args) {

        /**
         * Realizar la suma, la resta, la división y la multiplicación de dos números
         * leídos por teclado y mostrar en pantalla “La <operación> de <número 1> y
         * <número 2> es igual a <resultado> ”
         */

        String linea;

        // Lectura de datos
        System.out.println("Por favor, introduce un número: ");
        linea = System.console().readLine();
        int primerNumero;
        primerNumero = Integer.parseInt(linea);

        System.out.println("introduce otro, por favor: ");
        linea = System.console().readLine();
        int segundoNumero;
        segundoNumero = Integer.parseInt(linea);

        // Operaciones
        int suma;
        int resta;
        int multiplicacion;
        double division;

        suma = primerNumero + segundoNumero;
        resta = primerNumero - segundoNumero;
        multiplicacion = primerNumero * segundoNumero;
        division = (double) primerNumero / (double) segundoNumero;

        // Salida en pantalla
        System.out.println("La suma de " + primerNumero + " más " + segundoNumero + " es igual a " + suma);
        System.out.println("La resta de " + primerNumero + " menos " + segundoNumero + " es igual a " + resta);
        System.out.println(
                "La multiplicación de " + primerNumero + " por " + segundoNumero + " es igual a " + multiplicacion);
        System.out.println("La división de " + primerNumero + " entre " + segundoNumero + " es igual a " + division);

    }
}
