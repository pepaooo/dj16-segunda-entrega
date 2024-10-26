import java.io.Serializable;
import java.util.StringJoiner;

// José Angulo
public class CuentaBancaria implements MetodosComunes {

    private int numeroCuenta;
    private String nombreCliente;
    private double saldo;

    // Constructores
    public CuentaBancaria() {
        //System.out.println("CuentaBancaria Constructor");
        setSaldo(100);
        setNombreCliente("Default Client Name");
        setNumeroCuenta(123);
    }

    public CuentaBancaria(int numeroCuenta) {
        // Default Constructor
        this();
        // Simulando busqueda en la BD y extracción de la información para llenar los parámetros
        switch (numeroCuenta) {
            case 12345:
                setNumeroCuenta(numeroCuenta);
                setNombreCliente("Pepe");
                setSaldo(100);
                break;
            case 23456:
                setNumeroCuenta(numeroCuenta);
                setNombreCliente("Luis");
                setSaldo(100);
                break;
            case 34567:
                setNumeroCuenta(numeroCuenta);
                setNombreCliente("Alex");
                setSaldo(100);
                break;
        }
    }

    // Setters, Getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        if (numeroCuenta > 0)
            this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        if (nombreCliente.length() >= 3) {
            this.nombreCliente = nombreCliente;
        } else {
            this.nombreCliente = "Desconocido";
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
    }


    // Métodos
    public boolean depositar(double monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
            return true;
        } else {
            return false;
        }
    }

    public boolean retirar(double monto) {
        boolean resultado = false;
        if (monto > 0 && getSaldo() >= monto) {
            setSaldo(getSaldo() - monto);
            resultado = true;
        }
        return resultado;
    }

    // toString() -> String


    /*@Override
    public String toString() {
        return "CuentaBancaria{" +
               "numeroCuenta=" + numeroCuenta +
               ", nombreCliente='" + nombreCliente + '\'' +
               ", saldo=" + saldo +
               '}';
    }*/

    @Override
    public String toString() {
        return new StringJoiner(", ", CuentaBancaria.class.getSimpleName() + "[", "]")
                .add("numeroCuenta=" + numeroCuenta)
                .add("nombreCliente='" + nombreCliente + "'")
                .add("saldo=" + saldo)
                .toString();
    }

    @Override
    public boolean altaBBDD() {
        return false;
    }

    @Override
    public boolean bajaBBDD() {
        return false;
    }

    @Override
    public int cambioBBDD() {
        return 0;
    }
}
