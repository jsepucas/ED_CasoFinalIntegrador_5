package C_GestionCientifica;

import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class BuscadorTexto {

    public static List<Integer> buscarPalabra(String pathToFile, String palabra) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(pathToFile));
        List<Integer> lineasEncontradas = new ArrayList<>();
        for (int i = 0; i < lineas.size(); i++) {
            if (lineas.get(i).contains(palabra)) {
                lineasEncontradas.add(i + 1);  // Sumamos 1 para que la numeración de línea sea más humana
            }
        }
        return lineasEncontradas;
    }

}
