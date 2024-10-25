public class PruebaHerencia {
    public static void main(String[] args) {
        System.out.println("Ejemplo de herencia");

        // Personas
        Persona p1 = new Persona();
        System.out.println(p1);
        p1.setNombre("Jose");
        p1.setEdad(39);
        p1.setGenero('M');
        System.out.println("\t" + p1);

        // Estudiantes
        Estudiante e1 = new Estudiante();
        System.out.println(e1);
        e1.setNombre("Luis");
        e1.setEdad(10);
        e1.setMatricula(1001);
        e1.setCarrera("Ing. en Computación");
        System.out.println("\t" + e1);

        Estudiante e2 = new Estudiante();
        System.out.println(e2);
        e2.setNombre("Alex");
        e2.setEdad(30);
        e2.setMatricula(1001);
        e2.setCarrera("Ing. en Computación");
        System.out.println("\t" + e2);

        // Empleados
        Empleado emp1 = new Empleado();
        System.out.println(emp1);
        emp1.setNombre("Toño");
        emp1.setNumeroEmpleado(12345);
        emp1.setTurno('V');
        emp1.setEdad(30);
        System.out.println("\t" + emp1);
    }
}
