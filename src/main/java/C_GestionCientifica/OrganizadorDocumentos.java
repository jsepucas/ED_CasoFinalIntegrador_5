package C_GestionCientifica;

import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class OrganizadorDocumentos {

    public static List<String> ordenarLineas(String pathToFile) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(pathToFile));
        Collections.sort(lineas);
        return lineas;
    }

    public static void guardarDocumentoOrdenado(List<String> lineas, String outputPath) throws IOException {
        Path file = Paths.get(outputPath);
        Files.write(file, lineas);
    }


}
