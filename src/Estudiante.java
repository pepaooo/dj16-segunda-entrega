public final class Estudiante extends Persona implements MetodosComunes {
    // Estudiante es Persona
    // Estudiante es una subclase de Persona

    // Atributos adicionales a los de Persona
    private int matricula;
    private String carrera;

    // Constructores
    public Estudiante() {
        setMatricula(1000);
        setCarrera("Unknown");
        setEdad(18);
    }

    // Métodos adicionales a los de Persona
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula >= 1000)
            this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        if (carrera != null && carrera.length() > 2)
            this.carrera = carrera;
    }

    @Override
    public void setEdad(int edad) {
        if (edad >= 15) {
            super.setEdad(edad); // Por medio del metodo del padre
        } else {
            // No lo acepto
        }
    }

    @Override
    public boolean alta() {
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
               "matricula=" + matricula +
               ", carrera='" + carrera + '\'' +
               ", [" + super.toString() + "]" +
               '}';
    }

    @Override
    public boolean altaBBDD() {
        return false;
    }

    @Override
    public boolean bajaBBDD() {
        return false;
    }

    @Override
    public int cambioBBDD() {
        return 0;
    }
}
