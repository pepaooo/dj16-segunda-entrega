public class Radio implements Controles {
    public boolean estatus;
    public int nivelVolumen;
    public Estacion estacion;

    @Override
    public void encender() {
        this.estacion = Estacion.MIX;
        this.nivelVolumen = 0;
        this.estatus = true;

    }

    @Override
    public int subeVolumen() {
        this.nivelVolumen += 5;
        return 0;
    }

    @Override
    public int bajaVolumen() {
        this.nivelVolumen -= 5;
        return 0;
    }
}
