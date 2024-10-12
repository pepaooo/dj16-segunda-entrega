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
    }

}
