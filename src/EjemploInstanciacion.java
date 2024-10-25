public class EjemploInstanciacion {

    public static void main(String[] args) {

        System.out.println("Otro de ejemplo de creación de objetos");
        CuentaBancaria o1 = new CuentaBancaria();
        System.out.println(o1);
        CuentaBancaria o2 = new CuentaBancaria();
        System.out.println(o2);

        CuentaBancaria o3 = new CuentaBancaria(12345);
        System.out.println(o3);

        CuentaBancaria o4 = new CuentaBancaria(23456);
        System.out.println(o4);

        CuentaBancaria o5 = new CuentaBancaria(34567);
        System.out.println(o5);

        CuentaBancaria o6 = new CuentaBancaria(123);
        System.out.println(o6);

        o1.setNumeroCuenta(12345);
        o1.setNombreCliente("Pe");
        o1.setSaldo(100000.99);
        o1.setSaldo(-10);
//        System.out.println("Cuenta 1. Nombre Cliente: " + o1.getNombreCliente() + ", Saldo: $" + o1.getSaldo());
        o1.setSaldo(o1.getSaldo() + 123);
        System.out.println(o1);
//        System.out.println("Cuenta 1. Nombre Cliente: " + o1.getNombreCliente() + ", Saldo: $" + o1.getSaldo());
        System.out.println(o1);
        o1.depositar(500);
//        System.out.println("Cuenta 1. Nombre Cliente: " + o1.getNombreCliente() + ", Saldo: $" + o1.getSaldo());
        System.out.println(o1);
        o1.depositar(-5000);
//        System.out.println("Cuenta 1. Nombre Cliente: " + o1.getNombreCliente() + ", Saldo: $" + o1.getSaldo());
        System.out.println(o1);
        boolean retiro1 = o1.retirar(30_000);
//        System.out.println("Cuenta 1. Nombre Cliente: " + o1.getNombreCliente() + ", Saldo después de retiro: $" + o1.getSaldo() + ", Retiro exitoso: " + retiro1);
        System.out.println(o1);
        boolean retiro2 = o1.retirar(-30_000);
//        System.out.println("Cuenta 1. Nombre Cliente: " + o1.getNombreCliente() + ", Saldo después de retiro: $" + o1.getSaldo() + ", Retiro exitoso: " + retiro2);
        System.out.println(o1);
        System.out.println();

        Cliente antonio = new Cliente();
        antonio.setNombre("Antonio");
        antonio.setEdad(23);
        antonio.setGenero('M');
//        System.out.println("Genero de " + antonio.getNombre() + " es " + antonio.getGenero());
        System.out.println(antonio);

        Casa casaAntonio = new Casa();
        casaAntonio.pinta("Amarillo");
//        System.out.println(casaAntonio.getColor());
        System.out.println(casaAntonio);

        casaAntonio.setColor("Gris");
//        System.out.println(casaAntonio.getColor());
        System.out.println(casaAntonio);

        casaAntonio.setPrecio(1000);
//        System.out.println(casaAntonio.getPrecio());
        System.out.println(casaAntonio);

        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");

        matrix.setAnioCreacion(1999);
        matrix.setDuracionEnMinutos(120);
        matrix.setMejorPelicula(true);
        matrix.setCostoProduccion(1000);
       /* System.out.println("Pelicula: [Nombre: " + matrix.getNombre() + ", Año: " + matrix.getAnioCreacion()
                           + ", Duracion: " + matrix.getDuracionEnMinutos()
                           + ", Costo: $" + matrix.getCostoProduccion()
                           + ", MejorPelicula: " + matrix.isMejorPelicula() + "]");*/
        System.out.println(matrix);

        Usuario usuario1 = new Usuario("123", "Pepe", 39);
        System.out.println(usuario1);
    }
}
