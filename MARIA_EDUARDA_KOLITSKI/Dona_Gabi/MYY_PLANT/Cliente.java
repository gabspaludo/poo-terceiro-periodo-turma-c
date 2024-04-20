package Dona_Gabi.MYY_PLANT;

public class Cliente extends Pessoa {
    public Cliente(String nome, Integer idade, Endereco endereco) {
        super(nome, idade, endereco);
    }

    void apresentarSe() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}