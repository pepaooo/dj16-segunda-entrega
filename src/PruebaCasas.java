// José Angulo
public class PruebaCasas {

    public static void main(String[] args) {
        System.out.println("Programación Orientada a Objetos 101");
        // Variables
        int numero = 10;
        double calificacion = 9.7; // Definición e incialización de una variable
        calificacion = numero;
        numero = 20;
        System.out.println("Número " + numero + ", calificación " + calificacion);

        // Objetos
        Casa miCasa = new Casa();
        Casa otraCasa = new Casa(); // Definición e inicialización de un objeto
        System.out.println("miCasa: " + miCasa + ", otraCasa " + otraCasa);
        otraCasa = miCasa;
        miCasa = new Casa();
        System.out.println("miCasa: " + miCasa + ", otraCasa " + otraCasa);
        System.out.println("miCasa [Color: " + miCasa.getColor() + ", Precio: $" + miCasa.getPrecio() + "]");

        otraCasa.setPrecio(100);
        otraCasa.setVentanas(20);
        otraCasa.setColor("Blanco");
        System.out.println("otraCasa [Color: " + otraCasa.getColor() + ", Precio: $" + otraCasa.getPrecio() + "]");

        System.out.println("Paso de objetos como parámetro");
        numero = 100;
        otraCasa.setColor("Rojo");
        subrutina(numero, otraCasa);
        System.out.println(numero + " ++ " + otraCasa.getColor());


        // Instanciación de otra clase (Cliente)
        Cliente ana = new Cliente();
        ana.setEdad(99);
        ana.setId(12345);
        ana.setGenero('F');
        ana.setNombre("Ana Luccía Pérez Andrade");


        Cliente luis = new Cliente();
        luis.setNombre("Luis Benitez Pérez");
        luis.setEdad(50);
        luis.setGenero('M');

    }

    public static void subrutina(int numero, Casa casa) {
        System.out.println(numero + " .. " + casa.getColor());
        numero = 200;
        casa.setColor("Azul");
        System.out.println(numero + " -- " + casa.getColor());
        System.out.println("Tdse");
    }

}
