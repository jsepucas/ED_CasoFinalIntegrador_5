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
