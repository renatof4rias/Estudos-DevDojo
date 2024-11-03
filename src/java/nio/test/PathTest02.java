package nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {

        Path p3 = Paths.get("pasta");
        if (Files.notExists(p3)) {
            Path p4 = Files.createDirectory(p3);
        }

        Path filePath = Paths.get(p3.toString(), "jubileu.txt");
        Path file = Files.createFile(filePath);

        Path filee = Paths.get("C:\\Users\\Renato\\Desktop\\Estudos-DevDojo\\pasta\\jubileu.txt");

        Path origem = filee;
        Path destino = Paths.get(filee.getParent().toString(), "jubileu_do_sucesso.txt");
        Files.copy(origem, destino);


    }
}
