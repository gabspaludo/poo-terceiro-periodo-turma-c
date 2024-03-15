package poo;

import java.util.Scanner;

public class Calc {
    
    static class Sale {
        int quantidade;
        double precoTotal;
        double desconto;

        Sale(int quantidade, double precoTotal, double desconto) {
            this.quantidade = quantidade;
            this.precoTotal = precoTotal;
            this.desconto = desconto;
        }
    }

    
    static Sale[] historicoVendas = new Sale[100];
    static int numVendas = 0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            exibirMenu();
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    registrarVenda();
                    break;
                case 2:
                    calcularDesconto();
                    break;
                case 3:
                    calcularTroco();
                    break;
                case 4:
                    System.out.println("Saindo da calculadora. ");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("[1] - Registrar Venda");
        System.out.println("[2] - Calcular Desconto");
        System.out.println("[3] - Calcular Troco");
        System.out.println("[4] - Sair");
        System.out.print("Escolha a opção desejada: ");
    }

    private static void registrarVenda() {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de plantas vendidas: ");
        int quantidade = Scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = Scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;

        
        double desconto = 0;
        if (quantidade >= 10) {
            desconto = precoTotal * 0.05; 
            precoTotal -= desconto;
        }

        
        Sale novaVenda = new Sale(quantidade, precoTotal, desconto);
        historicoVendas[numVendas] = novaVenda;
        numVendas++;

        System.out.println("Venda registrada com sucesso!");
        Scanner.close();
    }

    private static void calcularDesconto() {
        if (numVendas > 0) {
            
            Sale ultimaVenda = historicoVendas[numVendas - 1];
            System.out.println("Desconto aplicado na última venda: R$" + ultimaVenda.desconto);
        } else {
            System.out.println("Nenhuma venda registrada ainda.");
        }
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
            scanner .close();
         }     
        
    }
}