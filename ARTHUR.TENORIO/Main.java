import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Compra {
        int quantidade;
        double valorTotal;
        double desconto;

        public Compra(int quantidade, double valorTotal, double desconto) {
            this.quantidade = quantidade;
            this.valorTotal = valorTotal;
            this.desconto = desconto;
        }

        @Override
        public String toString() {
            return "Quantidade: " + quantidade + ", Valor Total: " + valorTotal + ", Desconto: " + desconto + "%";
        }
    }

    static List<Compra> vendas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha a operação: 1 - Registrar Venda, 2 - Calcular Troco, 3 - Listar Compras, 4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    registrarVenda(scanner);
                    break;
                case 2:
                    calcularTroco(scanner);
                    break;
                case 3:
                    listarCompras();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    private static void registrarVenda(Scanner scanner) {
        System.out.println("Digite a quantidade de itens comprados:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o valor unitário:");
        double valor = scanner.nextDouble();
        double total = quantidade * valor;

        double desconto = (quantidade >= 10) ? 5.0 : 0.0;
        total -= total * (desconto / 100);

        vendas.add(new Compra(quantidade, total, desconto));
        System.out.println("Venda registrada com sucesso!");
    }

    private static void listarCompras() {
        if (vendas.isEmpty()) {
            System.out.println("Não há vendas registradas.");
        } else {
            System.out.println("Registro de vendas:");
            for (Compra compra : vendas) {
                System.out.println(compra);
            }
        }
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.print("Digite o valor recebido pelo cliente: R$");
        double valorRecebido = scanner.nextDouble();
        System.out.print("Digite o valor total da compra: R$");
        double valorTotal = scanner.nextDouble();

        double troco = valorRecebido - valorTotal;
        System.out.println("O troco a ser dado ao cliente é: R$" + troco);
    }
}
