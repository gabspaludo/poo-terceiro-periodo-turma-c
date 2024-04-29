package listas.listacinco;

/*2. Criar classe Cliente:
com os atributos nome, idade, cidade, bairro e rua.
Método apresentarse deve printar o nome, idade.*/

public abstract class Pessoa {

    String nome;

    Integer idade;

    String cidade;

    String bairro;

    String rua;

    protected Pessoa(String nome, Integer idade, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public abstract void apresentarse();
}
