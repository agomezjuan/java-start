public class Proyecto {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    private int pTiempo;
    private double pCapital;
    private double pInteres;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    public Proyecto() {
        this.pTiempo = 0;
        this.pCapital = 0;
        this.pInteres = 0;
    }

    public Proyecto(int pTiempo, double pCapital, double pInteres) {
        this.pTiempo = pTiempo;
        this.pCapital = pCapital;
        this.pInteres = pInteres;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    public double compararInversion(int pTiempo, double pCapital, double pInteres) {
        /**
         * Método para comparar la diferencia en el total de intereses generados para el
         * proyecto.
         * 
         * @return Respuesta al Reto.
         */
        this.pTiempo = pTiempo;
        this.pCapital = pCapital;
        this.pInteres = pInteres;

        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return diferencia;
    }

    public double calcularInteresSimple() {
        double interesSimple = this.pCapital * (this.pInteres / 100) * this.pTiempo;
        return Math.round(interesSimple);
    }

    public double calcularInteresCompuesto() {
        double interesCompuesto = this.pCapital * (Math.pow((1 + (this.pInteres / 100)), this.pTiempo) - 1);
        return Math.round(interesCompuesto);
    }

    public double compararInversion() {
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return diferencia;
    }

    public static void main(String[] args) {
        /**
         * 
         */

        Proyecto p1 = new Proyecto();

        System.out.println(p1.calcularInteresSimple());
        System.out.println(p1.calcularInteresCompuesto());
        System.out.println(p1.compararInversion(12, 7000000, 1.9));

        Proyecto p2 = new Proyecto(12, 7000000, 1.9);

        System.out.println(p2.calcularInteresSimple());
        System.out.println(p2.calcularInteresCompuesto());
        System.out.println(p2.compararInversion());

    }

}
