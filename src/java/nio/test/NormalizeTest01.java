package nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {

        String diretorioProjeto = "home/william/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());




    }
}
