package colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        // Expectate type Object, with inconsistency
        List tipoObject = new ArrayList();
        tipoObject.add("ajsdhfakjsdhf");
        tipoObject.add(1234);

        // Expectate Only String, with consistency
        List<String> tipoGenerics = new ArrayList<>();
        tipoGenerics.add("asdfasdf");
        tipoGenerics.add("asdfasnfjkas");

        for (int i = 0; i < tipoObject.size(); i++) {
            System.out.println(tipoObject.get(i));
        }

        for (String tipoGeneric: tipoGenerics) {
            System.out.println(tipoGeneric);
        }


    }
}