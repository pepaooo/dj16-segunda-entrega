import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {

    public static int capturaEntero(String mensaje, int defaultValue) {
        Scanner teclado = new Scanner(System.in);
        int retorno = defaultValue;
        System.out.print(mensaje);
        try {
            retorno = teclado.nextInt();
        } catch (InputMismatchException e) {
            //retorno = 0;
        }
        return (retorno);
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de TRY");

        int codigo = 0;
        int piezas = 0;
        Integer total = 0;
        double precio = Double.parseDouble("10.5");

        codigo = capturaEntero("Dame el código del producto: ", -1);
        piezas = capturaEntero("¿Cuántas piezas te llevas?: ", -1);

        System.out.println("Me debes " + (piezas * 10));
    }
}
