package colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortCarById implements Comparator<Carro> {

    @Override
    public int compare(Carro carro1, Carro carro2) {

        return carro1.getId().compareTo(carro2.getId());


    }
}

public class SortListTest02 {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        Carro c1 = new Carro(1L, "Carro 01", "2011", 16765);
        Carro c2 = new Carro(2L, "Carro 22", "2012", 3415);
        Carro c3 = new Carro(3L, "Carro 03", "2013", 42135);
        Carro c4 = new Carro(4L, "Carro 04", "2014", 15);
        Carro c5 = new Carro(10L, "Carro 05", "2015", 56165);
        Carro c6 = new Carro(6L, "Carro 06", "2016", 9815123);
        Carro c7 = new Carro(7L, "Carro 07", "2017", 2341123);
        carros.add(c2);
        carros.add(c5);
        carros.add(c3);
        carros.add(c4);
        carros.add(c7);
        carros.add(c6);
        carros.add(c1);

        for (Carro carro : carros) {
            System.out.println(carro.getNome());
        }

        System.out.println("--------------- Via Nomes ------------------");
        Collections.sort(carros);
        for (Carro carro : carros) {
            System.out.println(carro.getNome());
        }

        System.out.println("--------------- Via ID ------------------");
        Collections.sort(carros, new SortCarById());
        for (Carro carro : carros) {
            System.out.println(carro.getNome());
        }









    }
}
