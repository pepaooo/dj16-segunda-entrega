// José Angulo

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Manejo de Excepciones");
        System.out.print("Dame un número: ");
        try {
            numero = teclado.nextInt();
            System.out.println(1 / numero);
            System.out.println("Logré pasar de la división");
            System.out.println("Elemento del arreglo: " + args[numero]);
        } catch (ArithmeticException  e) {
            System.out.println("Una división por cero es una indeterminación");
        } catch (InputMismatchException e) {
            System.out.println("Sólo se aceptan datos numéricos");
        } catch (Exception e) {
            System.out.println("Error inesperado. " + e.getMessage());
        }
        System.out.println("Fin del programa");
    }
}
