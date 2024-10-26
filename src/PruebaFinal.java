public class PruebaFinal {
    public static void main(String[] args) {
        System.out.println("final");
        // final en la definición de una variable (constante) o atributo
        int variable = 10;
        variable = 10 + 7;

        final int CONSTANTE = 30;
        // CONSTANTE = 10; // Error en compilación, ES INMUTABLE (final)
        System.out.println("Constante: " + CONSTANTE);
        System.out.println(Integer.MAX_VALUE);

        // Los métodos final no pueden ser sobreescritos en una subclase

        // Las clases también pueden ser finales
        // Una clase final no la puedo heredar (no puede ser superclase)

    }
}
