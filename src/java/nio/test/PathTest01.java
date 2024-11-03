package nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

    public static void main(String[] args) {

        Path path = Paths.get("Espera-se um URI aqui ");
        path.getFileName();

    }
}
