public class Pelicula {
    private String nombre;
    private int anioCreacion;
    private int duracionEnMinutos;
    private double costoProduccion;
    private boolean mejorPelicula;

    public Pelicula() {
    }

    public Pelicula(String nombre, int anioCreacion, int duracionEnMinutos, double costoProduccion, boolean mejorPelicula) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
        this.duracionEnMinutos = duracionEnMinutos;
        this.costoProduccion = costoProduccion;
        this.mejorPelicula = mejorPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public boolean isMejorPelicula() {
        return mejorPelicula;
    }

    public void setMejorPelicula(boolean mejorPelicula) {
        this.mejorPelicula = mejorPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
               "nombre='" + nombre + '\'' +
               ", anioCreacion=" + anioCreacion +
               ", duracionEnMinutos=" + duracionEnMinutos +
               ", costoProduccion=" + costoProduccion +
               ", mejorPelicula=" + mejorPelicula +
               '}';
    }
}
