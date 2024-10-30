public class Generica<T> {
    public int atributoEntero;
    public T atributo;

    // Métodos
    public Generica() {
    }

    public Generica(int numero) {
        this.atributoEntero = numero;
    }

    public Generica(T valor) {
        this.atributo = valor;
    }

    public void despliega() {
        System.out.println("Valor del atributo: " + this.atributo);
    }

    @Override
    public String toString() {
        return "Generica{" +
                "atributoEntero=" + atributoEntero +
                ", atributo=" + atributo +
                '}';
    }
}
