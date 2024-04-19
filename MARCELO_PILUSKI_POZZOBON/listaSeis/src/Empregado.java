package listaSeis.src;

public class Empregado {
    public int id;
    public String nome;
    public int idade;
    public String nomeLoja = new Loja().nome;
    public Double salarioBase;
    public Double[] salarioRecebido = new Double[99];
    public Double[] bonusMensal = new Double[99];
    
    public Empregado(Endereco endereco) { // Construtor com parâmetro Endereco
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void apresentarse() {
        System.out.println("Olá, eu sou o " + this.nome + ", moro na cidade " + endereco.getCidade() + ", no bairro "
                + endereco.getBairro()
                + ", na rua " + endereco.getRua() + "!");
    }
}
