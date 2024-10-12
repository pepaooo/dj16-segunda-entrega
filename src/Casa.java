// Jose Angulo
public class Casa {
    // Atributos
    public double precio;
    public int tamano; // metros cuadrados del terreno
    public int niveles;
    public int ventanas;
    public boolean enVenta;
    public String color;

    // Métodos
    public void pinta(String nuevoColor) {
        // Cambiando el estado del atributo de la casa
        this.color = nuevoColor;
    }
}
