package ANDERSON_TESSARO.Lista06;

public class Gerente {
    String nome;
    Integer idade;
    Loja loja;
    String cidade;
    String bairro;
    String rua;
    Float salarioBase;
    Float[] salarioRecebido = new Float[3];

    public void apresentarse() {
        String msg = "Olá, eu sou o gerente " + nome + ", tenho " + idade + " anos e trabalho na loja " + loja.nome + ".";
        System.out.println(msg);
    }

    public void calcularMedia() {
        Float salarioTotal = 0.0f;
        for (int i = 0; i < salarioRecebido.length; i++) {
            salarioTotal += salarioRecebido[i];
        }

        Float media = salarioTotal / salarioRecebido.length;
        System.out.println("A média salarial é: R$ " + media);
    }

    public void calcularBonus() {
        Float bonus = salarioBase * 0.35f;
        System.out.println("O bônus é: R$ " + bonus);
    }
}
