// José Angulo
public class Cliente {
    // Atributos
    private String nombre;
    private int edad;
    private int id;
    private char genero;

    // Constructores
    public Cliente() {
    }

    public Cliente(String nombre, int edad, int id, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.genero = genero;
    }

    // Getters, Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 3)
            this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18)
            this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

    public String getGenero() {
        return switch (this.genero) {
            case 'M' -> "Masculino";
            case 'F' -> "Femenino";
            case 'O' -> "Otro";
            default -> "No establecido";
        };
    }

    public void setGenero(char genero) {
        // M, F, O, N
        if (genero == 'M' || genero == 'F' || genero == 'O' || genero == 'N') {
            this.genero = genero;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", id=" + id +
                ", genero=" + genero +
                '}';
    }
}
