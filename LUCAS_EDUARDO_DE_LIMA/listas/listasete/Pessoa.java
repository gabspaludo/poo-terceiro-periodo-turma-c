package LUCAS_EDUARDO_DE_LIMA.listas.listasete;

public abstract class Pessoa {

        /*Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
    - Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
    - Métodos apresentarse calcularMedia e calcularBonus.
    - Método apresentarse deve printar o nome, idade e Loja.
    - calcularMedia deve trazer a média dos salários.
    - calcularBonus onde a fórmula é [salarioBase * 0.35].*/
        protected String nome;
        protected Integer idade;
        protected Endereco endereco;
    
        public Pessoa(String nome, Integer idade, Endereco endereco) {
            this.nome = nome;
            this.idade = idade;
            this.endereco = endereco;
        }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract void apresentarse();
    }
    