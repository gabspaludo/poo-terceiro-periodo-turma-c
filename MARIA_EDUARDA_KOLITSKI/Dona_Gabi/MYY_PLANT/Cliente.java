package MARIA_EDUARDA_KOLITSKI.Dona_Gabi.MYY_PLANT;

import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);

    String nome;
    int idade; 
    String cidade;
    String bairro;
    String rua;
    
    void lerNome() {
        System.out.println("Digite o nome:");
        nome = scanner.nextLine();
    }

    void lerIdade() {
        System.out.println("Digite a idade:");
        idade = Integer.parseInt(scanner.nextLine());
    }

    void lerCidade() {
        System.out.println("Digite a cidade:");
        cidade = scanner.nextLine();
    }

    void lerBairro() {
        System.out.println("Digite o bairro:");
        bairro = scanner.nextLine();
    }

    void lerRua() {
        System.out.println("Digite a rua:");
        rua = scanner.nextLine();
    }

    void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.lerNome();
        cliente.lerIdade();
        cliente.lerCidade();
        cliente.lerBairro();
        cliente.lerRua();

        System.out.println("\n>>> Informações do Cliente <<<");
        cliente.apresentarSe();
    }
}