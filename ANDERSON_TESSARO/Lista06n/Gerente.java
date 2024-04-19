package Lista06n;

public class Gerente {
    private String nome;
    private int idade;
    private String loja;
    @SuppressWarnings("unused")
    private String cidade;
    @SuppressWarnings("unused")
    private String bairro;
    @SuppressWarnings("unused")
    private String rua;
    private double salarioBase;
    private double[] salarioRecebido;

    // Construtor, getters e setters
    public void apresentarse() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}