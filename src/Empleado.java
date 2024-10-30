import java.io.Serializable;

public class Empleado extends Persona implements MetodosComplementarios {
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

//    @Override
//    public boolean alta() {
//        return false;
//    }

    @Override
    public String toString() {
        return "Empleado " + getNumeroEmpleado() + ", Turno: " + getTurno() + ", [ " + super.toString() + " ]";
    }

    @Override
    public String reporte(int numero) {
        return "";
    }

    @Override
    public boolean respalda(String destino) {
        return false;
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
