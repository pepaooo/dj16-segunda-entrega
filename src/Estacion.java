public enum Estacion {
    // Frecuencia, Grupo, Audiencia
    DISNEY(98.3, "RC", 10),
    MIX(106.5, "M", 7),
    REACTOR(105.7, "RC", 8),
    OPUS(94.5, "M", 5);
    private double frecuencia;
    private String grupo;
    private int audiencia;

    Estacion(double frecuencia, String grupo, int audiencia) {
        this.frecuencia = frecuencia;
        this.grupo = grupo;
        this.audiencia = audiencia;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public String getGrupo() {
        return grupo;
    }

    public int getAudiencia() {
        return audiencia;
    }

    @Override
    public String toString() {
        return "Estacion{" +
                "frecuencia=" + frecuencia +
                ", grupo='" + grupo + '\'' +
                ", audiencia=" + audiencia +
                '}';
    }
}
