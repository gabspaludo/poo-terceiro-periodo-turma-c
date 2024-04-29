package listas.listacinco;

/*2. Criar classe Cliente:
com os atributos nome, idade, cidade, bairro e rua.
Método apresentarse deve printar o nome, idade.*/

public class Cliente extends Pessoa {


    public Cliente(String nome, Integer idade, String cidade, String bairro, String rua) {
        super(nome, idade, cidade, bairro, rua);
    }

    @Override
    public void apresentarse() {
        System.out.println("Olá eu sou o " + nome+ " tenho " +idade+ " anos.");
    }
}
