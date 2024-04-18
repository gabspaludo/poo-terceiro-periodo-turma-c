package CLARA_LIOTTO.Lista5;

class Vendedor {
    
    public String nome = "João";
    public int idade = 30;
    public Loja loja;
    public String cidade = "São Paulo";
    public String bairro = "Centro";
    public String rua = "Rua das Flores";
    public double salarioBase = 2000.0;
    public double[] salarioRecebido = {2100.0, 2200.0, 2300.0};

    public void apresentarSe() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Loja: " + loja.nomeFantasia);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}