package com.fag.calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

    private static ArrayList<Double> vendas = new ArrayList<>();
    private static ArrayList<Double> quantidades = new ArrayList<>();
    private static ArrayList<Double> descontos = new ArrayList<>();
    static int i = 0;

    static double indiceVendas = 0;

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
                mostrarvendas();
                return;
            case 4:
                System.out.println("calculadora encerrada.");
                return;     
            default:
                System.out.println("opcao invalida");
                    
        }
    }
      
    }

public static void exibirMenu(){
    System.out.println("[1]:calcular preco total");
    System.out.println("[2]:calcular troco");
    System.out.println("[3]:mostrar vendas");
    System.out.println("[4]:sair");
}
    
public static void calcularpreco(Scanner scanner) {
    
    System.out.println("digite a quantidade de itens: ");
    double quantidade = scanner.nextInt();

    System.out.println("digite o preco do produto: ");
    double precoproduto = scanner.nextDouble();

    double descontoAplicado = 0;

    double valortotal = quantidade * precoproduto;

    if (quantidade>=11) {
        valortotal = valortotal * 0.95;
        descontoAplicado = valortotal * 0.05;
    } else {
        valortotal = quantidade * precoproduto;
    }

    System.out.println("Valor Total: R$" + valortotal);
    
    descontos.add(descontoAplicado);
    vendas.add(valortotal);
    quantidades.add(quantidade);
    
}



public static void calculartroco(Scanner scanner){ 
    System.out.println("Digite o valor pago:");
    double valorpago = scanner.nextDouble();
    
    System.out.println("digite o valor da compra");
    double valordacompra = scanner.nextDouble();

    double valortroco = valorpago - valordacompra;
    
    System.out.println("o valor do troco é de: R$" + valortroco);
}



public static void mostrarvendas() {
    if (vendas.isEmpty()) {
        System.out.println("Nenhuma venda registrada.");
        return;
    }

    System.out.println("----- Vendas Registradas -----");
        for (int i = 0; i < vendas.size(); i++) {
            System.out.printf("Venda %d: Quantidade: %.2f, Valor: R$%.2f, Desconto: R$%.2f\n",
                    i + 1, quantidades.get(i), vendas.get(i), descontos.get(i));
}
} 
}




 
