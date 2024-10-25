// José Luis Angulo Cabello
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    // Constructores
    public Producto() {
        setNombre("INEXISTENTE");
        setCodigo("0");
        setPrecio(0);
    }

    public Producto(String codigo) {
        this();
        switch (codigo) {
            case "1":
                setCodigo(codigo);
                setNombre("Cuaderno");
                setPrecio(50);
                break;
            case "3":
                setCodigo(codigo);
                setNombre("Pluma");
                setPrecio(13);
                break;
            case "5":
                setCodigo(codigo);
                setNombre("Regla");
                setPrecio(16.5);
                break;
            case "8":
                setCodigo(codigo);
                setNombre("Goma");
                setPrecio(7);
                break;
            case "9":
                setCodigo(codigo);
                setNombre("Lápiz");
                setPrecio(7.5);
                break;
            case "11":
                setCodigo(codigo);
                setNombre("Carpeta");
                setPrecio(126);
                break;
            case "22":
                setCodigo(codigo);
                setNombre("Tinta");
                setPrecio(554);
                break;
            case "99":
                setCodigo(codigo);
                setNombre("Sobres");
                setPrecio(32);
                break;
            case "123":
                setCodigo(codigo);
                setNombre("Folder");
                setPrecio(5);
                break;
        }
    }

    // Métodos

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.length() > 0)
            this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0)
            this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0)
            this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " ($ " + precio + " )";
    }
}
