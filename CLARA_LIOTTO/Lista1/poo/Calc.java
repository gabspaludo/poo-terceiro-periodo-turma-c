 package poo-terceiro-periodo-turma-c.CLARA_LIOTTO.Lista1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    calcularPrecoTotal();
                    break;
                case 2:
                    calcularTroco();
                    break;
                case 3:
                    System.out.println("Saindo da calculadora. Até mais, Dona Gabrielinha!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 3);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
        System.out.print("Escolha a opção desejada: ");
    }

    private static void calcularPrecoTotal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de plantas vendidas: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        System.out.println("O preço total da venda é: R$ " + precoTotal);
    }

    private static void calcularTroco() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor recebido pelo cliente: ");
        double valorRecebido = scanner.nextDouble();

        System.out.print("Digite o valor total da compra: ");
        double valorTotalCompra = scanner.nextDouble();

        if (valorRecebido >= valorTotalCompra) {
            double troco = valorRecebido - valorTotalCompra;
            System.out.println("O troco a ser dado ao cliente é: R$ " + troco);
        } else {
            System.out.println("Valor insuficiente. O cliente deve pagar mais.");
        }
    }
}
    

