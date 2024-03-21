import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Compra {
        int dia;
        int mes;
        int quantidade;
        double valorTotal;

        public Compra(int dia, int mes, int quantidade, double valorTotal) {
            this.dia = dia;
            this.mes = mes;
            this.quantidade = quantidade;
            this.valorTotal = valorTotal;
        }

        @Override
        public String toString() {
            return "Data: " + dia + "/" + mes + ", Quantidade: " + quantidade + ", Valor Total: " + valorTotal;
        }
    }

    static List<Compra> vendas = new ArrayList<>();
    static double[][] matrizVendas = new double[30][12]; // 30 dias e 12 meses

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
                    listarCompras(scanner);
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
        System.out.println("Digite o dia do mês que deseja registrar a venda:");
        int dia = scanner.nextInt();
        System.out.println("Digite o mês (1 a 12):");
        int mes = scanner.nextInt();
        System.out.println("Digite a quantidade de itens comprados:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o valor total da venda:");
        double valorTotal = scanner.nextDouble();

        matrizVendas[dia - 1][mes - 1] += valorTotal;

        vendas.add(new Compra(dia, mes, quantidade, valorTotal));
        System.out.println("Venda registrada com sucesso no dia " + dia + " do mês " + mes + "!");
    }

    private static void listarCompras(Scanner scanner) {
        System.out.println("Digite a data que deseja pesquisar (dia/mês):");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        System.out.println("Vendas realizadas em " + dia + "/" + mes + ":");

        int quantidadeTotalVendas = 0;
        double valorTotalVendas = 0.0;
        boolean encontrouVendas = false;
        for (Compra compra : vendas) {
            if (compra.dia == dia && compra.mes == mes) {
                System.out.println(compra);
                quantidadeTotalVendas += compra.quantidade;
                valorTotalVendas += compra.valorTotal;
                encontrouVendas = true;
            }
        }

        if (!encontrouVendas) {
            System.out.println("Não foram encontradas vendas para a data especificada.");
        } else {
            System.out.println("Quantidade total de vendas: " + quantidadeTotalVendas);
            System.out.println("Valor total das vendas: " + valorTotalVendas);
        }
    }

    private static void calcularTroco(Scanner scanner) {
        System.out.println("Função de calcular troco não implementada.");
    }
}