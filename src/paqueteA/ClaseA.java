package paqueteA;

public class ClaseA {
    public int aPublico = 1;
    private int aPrivado = 2;
    protected int aProtected = 3;
    int aDefault = 4;

    public void metodoPublico() {
        this.aPublico = 11;
        this.aPrivado = 22;
        this.aProtected = 33;
        this.aDefault = 44;
    }

    private void metodoPrivado() {
        this.aPublico = -11;
        this.aPrivado = -22;
        this.aProtected = -33;
        this.aDefault = -44;
    }

    @Override
    public String toString() {
        return "ClaseA{" +
                "aPublico=" + aPublico +
                ", aPrivado=" + aPrivado +
                ", aProtected=" + aProtected +
                ", aDefault=" + aDefault +
                '}';
    }
}

