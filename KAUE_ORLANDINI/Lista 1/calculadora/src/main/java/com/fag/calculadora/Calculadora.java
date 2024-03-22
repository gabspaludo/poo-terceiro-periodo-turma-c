package com.fag.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                calcularpreco(scanner);
                break;
            case 2:
                calculartroco(scanner);
                break;
            case 3:
                System.out.println("calculadora encerrada.");
                return; 
            default:
                System.out.println("opcao invalida");
                    
        }
    }
      
    }

    private static void exibirMenu(){
        System.out.println("[1]:calcular preco total");
        System.out.println("[2]:calcular troco");
        System.out.println("[3]:sair");
    }
    
private static void calcularpreco(Scanner scanner) {
    System.out.println("digite a quantidade de itens: ");
    double quantidade = scanner.nextInt();

    System.out.println("digite o preco do produto: ");
    double precoproduto = scanner.nextDouble();

    double valortotal = ValorTotal.calcular(quantidade, precoproduto);

    System.out.println("Valor Total: R$" + valortotal);
}

private static void calculartroco(Scanner scanner){ 
    System.out.println("Digite o valor pago:");
    double valorpago = scanner.nextDouble();
    
    System.out.println("digite o valor da compra");
    double valordacompra = scanner.nextDouble();

    double valortroco = ValorTroco.calcular(valorpago, valordacompra);
    
    System.out.println("o valor do troco é de: R$" + valortroco);
}

}

class ValorTotal{

    public static double calcular(double quantidade, double precoproduto){
        return quantidade * precoproduto;
    }
}

class ValorTroco{

    public static double calcular(double valorpago, double valordacompra){
        return valorpago - valordacompra;
    }
}
 
