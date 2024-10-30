import java.util.ArrayList;

public class ColeccionArrayList {
    public static void main(String[] args) {
        // Ejemplo de ArrayList
        ArrayList<String> personajes = new ArrayList<>();
        // Agregar elementos
        personajes.add("Ometéotl");
        personajes.add("Ometecuhtli");
        personajes.add("Omecíhuatl");
        personajes.add("Xipe Tótec");
        personajes.add("Yaótl");
        personajes.add("Quetzalcóatl");
        personajes.add("Huitzilopochtli");
        personajes.add("Yaótl");

        System.out.println("Colección inicial: " + personajes);

        // Por posicion
        personajes.add(1, "Tonatiuh");
        personajes.addFirst("Coatlicue");
        personajes.addLast("Huehuetéotl");

        System.out.println("Colección final: " + personajes);
        // Extraer elementos
        System.out.println("Primer elemento: " + personajes.get(0));
        System.out.println("Último elemento: " + personajes.get(personajes.size() - 1));

        System.out.println(personajes.contains("Chantico")); // ¿Contiene Chantico?
        System.out.println(personajes.indexOf("Yaótl"));
        System.out.println(personajes.lastIndexOf("Yaótl"));
        System.out.println("Size: " + personajes.size());

        // Eliminar elementos
        personajes.remove("Yaótl");
        System.out.println("Después de eliminar a Yaótl: " + personajes);
        personajes.add("Yaótl");
        System.out.println("Colección final: " + personajes);
        personajes.removeIf(s -> s.equals("Yaótl"));
        System.out.println("Después de eliminar todos los Yaótl: " + personajes);


    }
}
