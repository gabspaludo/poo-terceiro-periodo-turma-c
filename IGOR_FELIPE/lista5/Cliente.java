package lista5;

public class Cliente extends Infos{
    public Loja loja;
    public Cliente(String nome, Integer idade, String cidade, String bairro, String rua,Loja loja){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.loja = loja;
    };

    public void apresentarse(){
        System.out.println("Meu nome é "+nome+" tenho "+idade+" anos de idade");
    }
}
