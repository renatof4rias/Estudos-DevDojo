package colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest01 {
    public static void main(String[] args) {

    List<String> nomes = new ArrayList<>();
    nomes.add("renato");
    nomes.add("renato32");
    nomes.add("renato12");
    nomes.add("renato7");
    nomes.add("renato6");
    nomes.add("renato53");
    nomes.add("renato23");
    nomes.add("renato84");
    nomes.add("renato98");
    nomes.add("renato35");
    nomes.add("renato66");
    nomes.add("renato21");
    nomes.add("renato64");
    nomes.add("renato1");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        Collections.sort(nomes);

        System.out.println("Ordenado");
        for (String nome : nomes) {
            System.out.println(nome);
        }





    }
}
