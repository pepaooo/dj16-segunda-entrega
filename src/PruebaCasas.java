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
        System.out.println("miCasa [Color: " + miCasa.color + ", Precio: $" + miCasa.precio + "]");

        otraCasa.precio = 100;
        otraCasa.ventanas = 20;
        otraCasa.color = "Blanco";
        System.out.println("otraCasa [Color: " + otraCasa.color + ", Precio: $" + otraCasa.precio + "]");

        System.out.println("Paso de objetos como parámetro");
        numero = 100;
        otraCasa.color = "Rojo";
        subrutina(numero, otraCasa);
        System.out.println(numero + " ++ " + otraCasa.color);


        // Instanciación de otra clase (Cliente)
        Cliente ana = new Cliente();
        ana.edad = 99;
        ana.id= 12345;
        ana.genero = 'F';
        ana.nombre = "Ana Luccía Pérez Andrade";


        Cliente luis = new Cliente();
        luis.nombre = "Luis Benitez Pérez";
        luis.edad = 50;
        luis.genero = 'M';

    }

    public static void subrutina(int numero, Casa casa) {
        System.out.println(numero + " .. " + casa.color);
        numero = 200;
        casa.color = "Azul";
        System.out.println(numero + " -- " + casa.color);
    }

}
