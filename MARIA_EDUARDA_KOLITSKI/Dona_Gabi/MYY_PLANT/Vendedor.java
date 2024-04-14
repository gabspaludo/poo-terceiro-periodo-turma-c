package MARIA_EDUARDA_KOLITSKI.Dona_Gabi.MYY_PLANT;

public class Vendedor {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    float salarioBase;
    float salarioRecebido1;
    float salarioRecebido2;
    float salarioRecebido3;

    float calcularMedia() {
        return (salarioRecebido1 + salarioRecebido2 + salarioRecebido3) / 3;
    }

    float calcularBonus() {
        return salarioBase * 0.2f;
    }

    void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
    }

    void lerSalarioRecebido1(float salario) {
        salarioRecebido1 = salario;
    }

    void lerSalarioRecebido2(float salario) {
        salarioRecebido2 = salario;
    }

    void lerSalarioRecebido3(float salario) {
        salarioRecebido3 = salario;
    }

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.nome = "João";
        vendedor.idade = 30;
        vendedor.loja = "Loja ABC";
        vendedor.cidade = "Cidade X";
        vendedor.bairro = "Bairro Y";
        vendedor.rua = "Rua Z";
        vendedor.salarioBase = 2000f;
        vendedor.lerSalarioRecebido1(2200f);
        vendedor.lerSalarioRecebido2(2300f);
        vendedor.lerSalarioRecebido3(2400f);

        System.out.println("\n>>> Informações do Vendedor <<<");
        vendedor.apresentarSe();
        System.out.println("Média Salarial: " + vendedor.calcularMedia());
        System.out.println("Bônus: " + vendedor.calcularBonus());
    }
}