package segunda_versao.model;

public class Cliente extends Pessoa {

    @Override
    public void apresentarSe() {
        System.out.println("Nome do cliente: " + getNome());
        System.out.println("Idade do cliente: " + getIdade());
    }
}
