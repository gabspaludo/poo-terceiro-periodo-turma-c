package atividadeObjeto;

// Para suprir tais novas necessidades, precisamos conseguir, via sistema, representar a empresa, os funcionários e clientes.  

// 1. Crie uma classe Vendedor com:
// Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
// Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
// Métodos apresentarse calcularMedia e calcularBonus.
// Método apresentarse deve printar o nome, idade e Loja.
// calcularMedia deve trazer a média dos salários.
// calcularBonus onde a formulá é [salarioBase * 0.2]

public class Vendedor extends Endereco {
    String nome;
    int idade;
    String loja;
    String cidade;
    double salarioBase;
    double salarioRecebido[] = { 1000.00, 1002.00, 1082.00 };

    public Vendedor(String estado, String cidade, String bairro, String numero, String complemento, String nome,
            int idade, String loja) {
        super(estado, cidade, bairro, numero, complemento);
        this.nome = nome;
        this.idade = idade;
        this.loja =  loja;
    }

    public void apresentarse() {
        String apresentar = "Vendedor: " + nome + "\nIdade: " + idade + "\nLoja: " + loja;
        System.out.println(apresentar);

    }

    public void calcularMedia() {
        double media = 0;
        for (double i : salarioRecebido) {
            media = media + i;
        }
        media = media / 3;
        System.out.println(media);
    }

    public void calcularBonus() {
        System.out.println(salarioBase * 0.2);

    }
}
