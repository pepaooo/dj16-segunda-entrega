public class Persona {
    // Atributos
    private String nombre;
    private char genero;
    private int edad;

    // Métodos

    // Constructores
    public Persona() {
        setNombre("Nombre de Persona");
        setEdad(0);
        setGenero('N');
    }

    // Getters, Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() > 3)
            this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        // M, F, O, N
        if (genero == 'M' || genero == 'F' || genero == 'O' || genero == 'N') {
            this.genero = genero;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0)
            this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", genero='" + genero + '\'' +
               ", edad='" + edad + '\'' +
               '}';
    }
}
