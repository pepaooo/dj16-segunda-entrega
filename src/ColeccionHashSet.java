import java.util.Arrays;
import java.util.HashSet;

public class ColeccionHashSet {
    public static void main(String[] args) {
        // Utilización de HashSet
        HashSet<Integer> catalogoA = new HashSet<>(Arrays.asList(3, 6, 4, 9, 8, 10));
        System.out.println("catalogoA: " + catalogoA);

        HashSet<Integer> catalogoB = new HashSet<>(Arrays.asList(1, 10, 2, 8, 5, 7, 7));
        System.out.println("catalogoB: " + catalogoB);

        // Union A+B = B+A
        //catalogoA.addAll(catalogoB);
        //System.out.println("Union A+B: " + catalogoA);

        // Interseccion A*B = B*A
        //catalogoA.retainAll(catalogoB);
        //stem.out.println("Interseccion A y B: " + catalogoA);

        // Diferencia A-B != B-A
        //catalogoA.removeAll(catalogoB);
        //System.out.println("A-B: " + catalogoA);

        catalogoB.removeAll(catalogoA);
        System.out.println("B-A: " + catalogoB);
    }
}
