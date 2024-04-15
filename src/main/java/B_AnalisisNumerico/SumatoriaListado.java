package B_AnalisisNumerico;

public class SumatoriaListado {

    public static int sumatoriaRecursiva(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumatoriaRecursiva(n - 1);
        }
    }
}
