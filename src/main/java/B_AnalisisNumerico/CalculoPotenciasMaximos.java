package B_AnalisisNumerico;

public class CalculoPotenciasMaximos {

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    public static int encontrarMaximo(int[] datos, int indice) {
        if (indice == 0) {
            return datos[0];
        } else {
            return Math.max(datos[indice], encontrarMaximo(datos, indice - 1));
        }
    }

    public static void main(String[] args) {
        int potencia = calcularPotencia(2, 8);
        System.out.println("2 elevado a la 8 es: " + potencia);

        int[] datos = {3, 6, 2, 8, 5};
        int maximo = encontrarMaximo(datos, datos.length - 1);
        System.out.println("El máximo es: " + maximo);
    }
}
}
