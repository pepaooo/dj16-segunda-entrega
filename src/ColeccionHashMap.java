import java.util.HashMap;

public class ColeccionHashMap {
    public static void main(String[] args) {
        // Uso de hashmap de java.util
        // Cada elemento se compone de una llave-valor
        HashMap<Integer, String> personajes = new HashMap<>();
        personajes.put(1, "Ometéotl");
        personajes.put(5, "Ometecuhtli");
        personajes.put(10, "Omecíhuatl");
        personajes.put(8, "Ometéotl"); // Permite valores duplicados
        personajes.put(8, "Yaótl"); // Sustituye el valor

        System.out.println("Personajes: " + personajes);
        System.out.println("Personajes: " + personajes.get(8));

    }
}
