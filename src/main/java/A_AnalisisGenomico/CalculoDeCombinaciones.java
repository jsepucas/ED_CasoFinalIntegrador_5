package A_AnalisisGenomico;

import java.util.ArrayList;
import java.util.List;

public class CalculoDeCombinaciones {

    public static List<String> generarCombinaciones(int n) {
        String[] bases = {"A", "C", "G", "T"};
        List<String> result = new ArrayList<>();
        generarCombinacionesRecursivo("", bases, n, result);
        return result;
    }

private static void generarCombinacionesRecursivo(String current, String[] bases, int n, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
    for (String base : bases) {
        generarCombinacionesRecursivo(current + base, bases, n, result);
    }
}
    public static void main(String[] args) {
    int tamaño = 3;
    List<String> combinaciones = generarCombinaciones(tamaño);
    System.out.println("Combinaciones genéticas de tamaño " + tamaño + ":");
    combinaciones.forEach(System.out::println);
    }
}
