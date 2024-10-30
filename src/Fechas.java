import java.time.LocalDate;
import java.time.LocalTime;

public class Fechas {
    public static void main(String[] args) {
        // Uso de fechas con java.time.LocalDate
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es: " + hoy);
        LocalDate nacimiento = LocalDate.of(1999, 12, 31);
        System.out.println("Fecha de nacimiento: " + nacimiento);
        LocalDate ingreso = LocalDate.parse("2022-01-01");
        System.out.println("Fecha de ingreso: " + ingreso);

        // Uso de horas con java.time.LocalTime
        LocalTime hora = LocalTime.now();
        System.out.println("La hora actual es: " + hora);
        LocalTime entrada = LocalTime.of(12,30);
        System.out.println("La hora de entrada es: " + entrada);
        LocalTime salida = LocalTime.parse("17:00");
        System.out.println("La hora de salida es: " + salida);
    }
}
