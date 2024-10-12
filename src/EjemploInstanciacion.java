public class EjemploInstanciacion {
    public static void main(String[] args) {
        System.out.println("Otro de ejemplo de creación de objetos");
        Casa casaAntonio = new Casa();
        Cliente antonio = new Cliente();
        antonio.nombre = "Antonio";
        antonio.edad = 23;
        antonio.genero = 'M';

        casaAntonio.pinta("Amarillo");
        System.out.println(casaAntonio.color);

        casaAntonio.color = "Gris";
        System.out.println(casaAntonio.color);

        casaAntonio.precio = 1000;
        System.out.println(casaAntonio.precio);

        Pelicula matrix = new Pelicula();
        matrix.nombre = "Matrix";
        matrix.anioCreacion = 1999;
        matrix.duracionEnMinutos = 120;
        matrix.mejorPelicula = true;
        matrix.costoProduccion = 1000;

        System.out.println("Pelicula: [Nombre: " + matrix.nombre + ", Año: " + matrix.anioCreacion
                           + ", Duracion: " + matrix.duracionEnMinutos
                           + ", Costo: $" + matrix.costoProduccion
                           + ", MejorPelicula: " + matrix.mejorPelicula + "]");
    }
}
