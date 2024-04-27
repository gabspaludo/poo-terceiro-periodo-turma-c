package listas.listaseis;

public abstract class Pessoa {

    /*Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
- Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
- Métodos apresentarse calcularMedia e calcularBonus.
- Método apresentarse deve printar o nome, idade e Loja.
- calcularMedia deve trazer a média dos salários.
- calcularBonus onde a fórmula é [salarioBase * 0.35].*/

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
