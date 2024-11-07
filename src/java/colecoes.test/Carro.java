package colecoes.test;

import java.util.Objects;

public class Carro implements Comparable<Carro>{
    private Long id;
    private String nome;
    private String ano;
    private double preco;

    public Carro(Long id, String nome, String ano, double preco) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Double.compare(preco, carro.preco) == 0 && Objects.equals(id, carro.id) && Objects.equals(nome, carro.nome) && Objects.equals(ano, carro.ano);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ano, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    @Override
//    public int compareTo(Carro o) {
//        if(this.id < o.getId()){
//            return -1;
//        } else if (this.id.equals(o.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }

    @Override
    public int compareTo(Carro o) {

        return this.nome.compareTo(o.getNome());
    }
}
