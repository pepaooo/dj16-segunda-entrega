// José Luis Angulo Cabello

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        // Definición de variables
        String codigo = "0";
        int numeroProductos = 0;
        double subtotal = 0;
        double total = 0;
        double iva = 0;
        String mensajeEntrada = "Producto (<Enter> para salir): ";

        // Input de Datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tecleee los códigos de los productos de la venta");
        while (!codigo.equals("")) {
            System.out.print(mensajeEntrada);
            codigo = parseaCodigo(teclado.nextLine());
            if (!codigo.equals("")) {
                Producto producto = new Producto(codigo);
                if (!producto.getNombre().equals("INEXISTENTE")) {
                    numeroProductos++;
                    subtotal += producto.getPrecio();
                    System.out.println("\t\t" + producto);
                    System.out.println("\t\t+ Lleva " + numeroProductos + " productos ($ " + subtotal + " antes del IVA)");
                } else {
                    System.out.println("\t\tProducto " + producto.getNombre());
                }
            }
        }
        System.out.println("Fin de la venta\n\n");

        iva = obtieneIva(subtotal, 16);
        total = subtotal + iva;

        System.out.println("RESUMEN FINAL: " + numeroProductos + " productos");
        System.out.println("Subtotal: $ " + subtotal);
        System.out.println("IVA:      $ " + iva);
        System.out.println("Total:    $ " + total);
    }

    private static String parseaCodigo(String entrada) {
        String resultado = "";
        if (entrada.length() > 0) {
            resultado = entrada;
        }
        return resultado;
    }

    private static double obtieneIva(double subtotal, double iva) {
        return subtotal * iva / 100;
    }
}
