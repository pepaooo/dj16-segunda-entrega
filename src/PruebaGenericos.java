public class PruebaGenericos {
    public static void main(String[] args) {
        // Ejemplo de uso de genericos
        Generica<String> miClaseString1 = new Generica<String>();
        System.out.println(miClaseString1);

        Generica<String> miClaseString2 = new Generica<>("Hola");
        System.out.println(miClaseString2);

        Generica<Integer> miClaseInteger1 = new Generica<>(100);
        System.out.println(miClaseInteger1);

        Generica<Double> miClaseDouble1 = new Generica<>(123.456);
        System.out.println(miClaseDouble1);

        Generica<Estudiante> miClaseEstudiante1 = new Generica<>();
        System.out.println(miClaseEstudiante1);
    }

}
