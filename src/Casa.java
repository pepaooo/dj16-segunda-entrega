import java.util.Objects;

// Jose Angulo
public class Casa {
    // Atributos
    private double precio;
    private int tamano; // metros cuadrados del terreno
    private int niveles;
    private int ventanas;
    private boolean enVenta;
    private String color;

    // Constructores
    public Casa() {
    }

    public Casa(double precio, int tamano, int niveles, int ventanas, boolean enVenta, String color) {
        this.precio = precio;
        this.tamano = tamano;
        this.niveles = niveles;
        this.ventanas = ventanas;
        this.enVenta = enVenta;
        this.color = color;
    }

    // Getters y Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0)
            this.precio = precio;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        if (tamano > 0)
            this.tamano = tamano;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        if (niveles > 0)
            this.niveles = niveles;
    }

    public int getVentanas() {
        return ventanas;
    }

    public void setVentanas(int ventanas) {
        if (ventanas > 0)
            this.ventanas = ventanas;
    }

    public boolean isEnVenta() {
        return enVenta;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Casa{");
        sb.append("precio=").append(precio);
        sb.append(", tamano=").append(tamano);
        sb.append(", niveles=").append(niveles);
        sb.append(", ventanas=").append(ventanas);
        sb.append(", enVenta=").append(enVenta);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Métodos
    public void pinta(String nuevoColor) {
        // Cambiando el estado del atributo de la casa
        this.color = nuevoColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return tamano == casa.tamano && niveles == casa.niveles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamano, niveles);
    }
}
