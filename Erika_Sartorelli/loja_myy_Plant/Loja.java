import java.util.ArrayList;

class Vendedor {
    String nome;
    int idade;
    String loja;
    double salariopouco;
    ArrayList<Double> salarioDoMes = new ArrayList<>();

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    public double calcular() {
        double soma = 0;
        for (double salario : salarioDoMes) {
            soma += salario;
        }
        return soma / salarioDoMes.size();
    }

    public double Bonus() {
        return salariopouco * 0.2;
    }
}

class Cliente {
    String nome;
    int idade;

    public void apresentese() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Loja {
    String nomeFantasia;
    String cnpj;
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    public void apresentese() {
        System.out.println("Nome: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
    }
}

