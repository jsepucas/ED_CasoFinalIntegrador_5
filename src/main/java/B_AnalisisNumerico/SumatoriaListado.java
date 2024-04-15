package B_AnalisisNumerico;

public class SumatoriaListado {

    public static int sumatoriaRecursiva(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumatoriaRecursiva(n - 1);
        }
    }

    public static List<Integer> listarNumeros(int desde, int hasta) {
        List<Integer> lista = new ArrayList<>();
        if (desde <= hasta) {
            listarNumerosRecursivo(desde, hasta, lista);
        }
        return lista;
    }

}
