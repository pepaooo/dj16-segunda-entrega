package paqueteA;

public class Instanciacion {
    public static void main(String[] args) {
        ClaseA claseA = new ClaseA();
        claseA.aPublico = 111;
        claseA.aProtected = 333;
        claseA.aDefault = 444;
        System.out.println(claseA);
        claseA.metodoPublico();
        System.out.println(claseA);
        System.out.println();

    }
}
