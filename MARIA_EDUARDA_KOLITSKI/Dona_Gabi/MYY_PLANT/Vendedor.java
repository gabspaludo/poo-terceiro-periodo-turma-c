package Dona_Gabi.MYY_PLANT;

public class Vendedor extends Pessoa {
    private Loja loja;
    private Double salarioBase;

    public Vendedor(String nome, Integer idade, Endereco endereco) {
        super(nome, idade, endereco);
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}