// José Luis Angulo Cabello

import java.util.Scanner;

public class Practica1_Opcionales {
    public static void main(String[] args) {
        // Definición de variables
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int nulo = 0;
        int respuesta = 0;
        // Input de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el total de votantes de esta casilla: ");
        int votantes = scanner.nextInt();

        String menu = """
                        SIMULACRO DE ELECCIONES 2024
                1. Candidata/o 1
                2. Candidata/o 2
                3. Candidata/o 3
                4. Ninguno (voto nulo)
                9. Terminar
                ¿Por quién vas a votar? (9 para terminar)
                """;
        while (respuesta != 9) {
            System.out.print(menu);
            respuesta = scanner.nextInt();
            if (respuesta < 1 || (respuesta > 4 && respuesta != 9)) {
                System.out.println("No es una opción válida, intente de nuevo");
            } else {
                switch (respuesta) {
                    case 1 -> candidato1++;
                    case 2 -> candidato2++;
                    case 3 -> candidato3++;
                    case 4 -> nulo++;
                }
            }
        }

        // Total de votos
        int totalDeVotos = candidato1 + candidato2 + candidato3 + nulo;
        double porcentajeCandidato1 = porcentaje(candidato1, totalDeVotos);
        double porcentajeCandidato2 = porcentaje(candidato2, totalDeVotos);
        double porcentajeCandidato3 = porcentaje(candidato3, totalDeVotos);
        double porcentajeNulo = porcentaje(nulo, totalDeVotos);

        // Impresión de resultados
        System.out.println();
        System.out.println("RESULTADOS FINALES");
        System.out.println("Candidata/o 1:   " + candidato1 + " (" + porcentajeCandidato1 + "%)");
        System.out.println(generaBarraHorizontal(porcentajeCandidato1));
        System.out.println("Candidata/o 2:   " + candidato2 + " (" + porcentajeCandidato2 + "%)");
        System.out.println(generaBarraHorizontal(porcentajeCandidato2));
        System.out.println("Candidata/o 3:   " + candidato3 + " (" + porcentajeCandidato3 + "%)");
        System.out.println(generaBarraHorizontal(porcentajeCandidato3));
        System.out.println("Votos nulos:   " + nulo + " (" + porcentajeNulo + "%)");
        System.out.println(generaBarraHorizontal(porcentajeNulo));
        System.out.println("Total de votos:  " + totalDeVotos);
        System.out.println("Porcentaje de participación [Votantes: "+ votantes + ", Total de votos registrados: " + totalDeVotos
                           + "]: " + ((double) totalDeVotos / votantes) * 100 + "%");
    }

    public static double porcentaje(int votosDelCandidato, int totalDeVotos) {
        if (votosDelCandidato == 0) {
            return 0.0;
        }
        return ((double) votosDelCandidato / totalDeVotos) * 100;
    }

    public static String generaBarraHorizontal(double porcentaje) {
        String result = "";
        int percentage = ((int) porcentaje / 10) * 2;
//        System.out.println(percentage);
        for (int i = 0; i < percentage; i++) {
            result += "*";
        }
        return result;
    }
}
