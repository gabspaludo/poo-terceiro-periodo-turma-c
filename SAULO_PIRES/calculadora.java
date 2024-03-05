import java.util.Scanner;
//Scanner importado para perguntar/ler os dados enviados pelo usuário.//

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");

            int opcao = scanner.nextInt();
            //Nesta parte, o scanner está sendo utilizado para perguntar ao usuário qual opção ele quer.//

            if (opcao == 1) {
                calcPrecoTotal(scanner);
            } else if (opcao == 2) {
                calcTroco(scanner);
            } else if (opcao == 3) {
                System.out.println("Volte sempre!");
                break;
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }

    private static void calcPrecoTotal(Scanner scanner) {
        System.out.println("Digite a quantidade de plantas vendidas:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o preço unitário da planta:");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        System.out.println("O preço total da venda é: R$" + precoTotal);
    }

    private static void calcTroco(Scanner scanner) {
        System.out.println("Digite o valor recebido pelo cliente:");
        double valorRecebido = scanner.nextDouble();
        System.out.println("Digite o valor total da compra:");
        double valorTotalCompra = scanner.nextDouble();
        double troco = valorRecebido - valorTotalCompra;
        
        if (troco >= 0) {
            System.out.println("O troco a ser dado ao cliente é: R$" + troco);
        } else {
            System.out.println("O valor recebido é insuficiente para cobrir o valor total da compra.");
        }
    }
}