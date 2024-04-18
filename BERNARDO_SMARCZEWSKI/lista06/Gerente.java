package lista06;

public class Gerente extends Vendedor {
    private double[] salarioRecebido;

    public Gerente(String nome, int idade, Loja loja, double salarioBase, Endereco endereco, double[] salarioRecebido) {
        super(nome, idade, loja, salarioBase, endereco);
        this.salarioRecebido = salarioRecebido;
    }

    @Override
    public void apresentarse() {
        System.out.println("Gerente: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    @Override
    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}