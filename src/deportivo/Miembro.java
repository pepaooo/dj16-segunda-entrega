package deportivo;

public class Miembro extends Persona {
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String tipoMiembro;

    public Miembro() {
        super();
        setTipoMiembro("INEXISTENTE");
        setCorreoElectronico("INEXISTENTE");
        setTelefono("INEXISTENTE");
        setDireccion("INEXISTENTE");
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(String tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }

    @Override
    public String toString() {
        return "Miembro{" +
                "direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", tipoMiembro='" + tipoMiembro + '\'' +
                '}';
    }
}
