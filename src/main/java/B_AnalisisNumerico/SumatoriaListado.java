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

    private static void listarNumerosRecursivo(int current, int hasta, List<Integer> lista) {
        lista.add(current);
        if (current < hasta) {
            listarNumerosRecursivo(current + 1, hasta, lista);
        }
    }

    public static void main(String[] args) {
        int resultadoSumatoria = sumatoriaRecursiva(10);
        System.out.println("Sumatoria de 10 es: " + resultadoSumatoria);

        List<Integer> numeros = listarNumeros(1, 10);
        System.out.println("Números del 1 al 10:");
        numeros.forEach(System.out::println);
    }

}
