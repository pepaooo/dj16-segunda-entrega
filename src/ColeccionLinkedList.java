import java.util.LinkedList;

public class ColeccionLinkedList {
    public static void main(String[] args) {
        // Ejemplo de ArrayList
        LinkedList<String> personajes = new LinkedList<>();
        // Agregar elementos
        personajes.add("Ometéotl");
        personajes.add("Ometecuhtli");
        personajes.add("Omecíhuatl");
        personajes.add("Xipe Tótec");
        personajes.add("Yaótl");
        personajes.add("Quetzalcóatl");
        personajes.add("Huitzilopochtli");
        personajes.add("Yaótl"); // PErmite duplicados

        System.out.println("Colección inicial: " + personajes);

        // Por posicion
        personajes.add(1, "Tonatiuh");
        personajes.addFirst("Coatlicue");
        personajes.addLast("Huehuetéotl");

        // Push
        personajes.push("Nanahuatzin"); // Igual addFirst
        System.out.println("Colección final - Push: " + personajes);
        // Pop
        String pop = personajes.pop(); // getFirst() o get(0) y elimina de la lista
        System.out.println("Pop: " + pop);
        System.out.println("Colección final - Pop: " + personajes);
        //Peek
        String peek = personajes.peek();
        String peekFirst = personajes.peekFirst();
        System.out.println("Peek: " + peek + ", peekFirst: " + peekFirst);
        System.out.println("Colección final - peek: " + personajes);


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
