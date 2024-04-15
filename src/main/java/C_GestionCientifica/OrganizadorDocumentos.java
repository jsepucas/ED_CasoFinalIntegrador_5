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

}
