public class Empleado extends Persona {
    // Atributos
    private int numeroEmpleado;
    private char turno;

    // Constructores
    public Empleado() {
        setTurno('M');
        setNumeroEmpleado(1000);
        setEdad(18);
    }

    // Setters, Getters
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        if (numeroEmpleado > 0)
            this.numeroEmpleado = numeroEmpleado;
    }

    public String getTurno() {
        String resultado = "";
        if (this.turno == 'M'){
            resultado = "Matutino";
        } else {
            resultado = "Vespertino";
        }
        return resultado;
    }

    public void setTurno(char turno) {
        if (turno == 'M' || turno == 'V')
            this.turno = turno;
    }

    @Override
    public void setEdad(int edad) {
        if (edad >= 18)
            super.setEdad(edad);
    }

    @Override
    public String toString() {
        return "Empleado " + getNumeroEmpleado() + ", Turno: " + getTurno() + ", [ " + super.toString() + " ]";
    }
}
