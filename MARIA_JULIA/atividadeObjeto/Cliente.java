package atividadeObjeto;

// 2. Criar classe Cliente:
// com os atributos nome, idade, cidade, bairro e rua.
// Método apresentarse deve printar o nome, idade.

public class Cliente extends Endereco {
    String nome;
    int idade;

    public Cliente(String estado, String cidade, String bairro, String numero, String complemento, String nome,
            int idade) {
        super(estado, cidade, bairro, numero, complemento);
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentarse() {
        String apresentar = "Cliente: " + nome + "\nIdade: " + idade;
        System.out.println(apresentar);
    }
}
