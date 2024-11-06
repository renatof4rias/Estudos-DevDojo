package colecoes.test;

public class Carro {
    private String nome;
    private String ano;

    public Carro(String nome, String ano) {
        this.nome = nome;
        this.ano = ano;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Carro carro = (Carro) obj;
        return nome != null && nome.equals(carro.nome) && ano != null && ano.equals(carro.ano);
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
}
