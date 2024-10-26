public class ClaseConEstaticos {
    //Ejemplifica el uso de elementos estáticos y no estáticos
    // Atributos
    public int atributoNoEstatico = 0;
    public static int atributoEstatico = 1;

    // Métodos
    public void metodoNoEstatico() {
        System.out.println("Estoy dentro del método no estático");
        System.out.println("Atributo no estático: " + atributoNoEstatico);
    }

    public static int metodoEstatico(int numero) {
        System.out.println("Estoy ejecutando el método estático");
        System.out.println("Atributo estático: " + atributoEstatico);
        return numero * 2;
    }
}
