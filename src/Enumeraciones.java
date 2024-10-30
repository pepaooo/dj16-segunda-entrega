enum Turno {
    MATUTINO, VESPERTINO, MIXTO
}

public class Enumeraciones {
    // Ejemplo de definición y uso de enum
    public static void main(String[] args) {
        Turno turnoJuan = Turno.MATUTINO;
        Turno turnoPedro = Turno.MATUTINO;

        System.out.println("Turno de Juan: " + turnoJuan);
        System.out.println("Turno de Pedro: " + turnoPedro);

        if (turnoJuan == turnoPedro) {
            System.out.println("Van a la escuela en el mismo turno");
        }


        Nivel nivelJuan = Nivel.ORO;
        Nivel nivelPedro = Nivel.BRONCE;

        System.out.println("Nivel de Juan: " + nivelJuan + ", descuento de " + nivelJuan.getDescuento());
        System.out.println("Nivel de Pedro: " + nivelPedro + ", descuento de " + nivelPedro.getDescuento());

    }

}
