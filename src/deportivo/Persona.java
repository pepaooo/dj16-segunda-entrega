package deportivo;

public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private char genero;

    public Persona() {
        setNombres("Nombres Persona");
        setApellidos("Apellidos Persona");
        setEdad(0);
        setGenero('N');
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }
}
