package atividadeObjeto;
// 2. Criar classe Cliente:
// com os atributoas nome, idade, cidade, bairro e rua.
// Método apresentarse deve printar o nome, idade.

public class Cliente {
    String nome;
    int idade;
    String cidade;
    String bairro;
    String rua;



    public void apresentarse() {
        String apresentar = "Cliente: "+ nome +"\nIdade: "+idade;
        System.out.println(apresentar);

    }
}
