public enum Nivel {
    // Valores permitidos
    BRONCE(2, 0), PLATA(3, 6), ORO(5, 12);

    // Atributos
    private int descuento;
    private int meses;

    // Constructor
    Nivel(int descuento, int msi) {
        this.descuento = descuento;
        this.meses = msi;
    }

    public int getDescuento() {
        return descuento;
    }

    public int getMeses() {
        return meses;
    }

    @Override
    public String toString() {
        return "Nivel { " +
                 this.name() +
                ", Descuento: " + getDescuento() +
                "% }" +
                ", Meses sin intereses: " + getMeses() +
                " }";
    }
}
