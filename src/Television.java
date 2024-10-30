enum Resolucion {HD, FULLHD, UHD}

public class Television implements Controles {
    public int volumenActual;
    public boolean encendido;
    public double canalActual;
    public Resolucion resolucionActual;

    @Override
    public void encender() {
        this.encendido = true;
        this.volumenActual = 0;
        this.canalActual = 0;
        this.resolucionActual = Resolucion.FULLHD;

    }

    @Override
    public int subeVolumen() {
        this.volumenActual += 5;
        return 0;
    }

    @Override
    public int bajaVolumen() {
        this.volumenActual += 5;
        return 0;
    }
}
