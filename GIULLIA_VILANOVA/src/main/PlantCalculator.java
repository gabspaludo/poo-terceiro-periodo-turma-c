package main;

import java.util.Scanner;

public class PlantCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int option;
        int confirm;
    

        do {
            exibitMenu();
            option = scanner.nextInt();
            confirm = scanner.nextInt();

            switch(option){
                case 1:
                    calculateTotalPrice();
                    break;
                case 2:
                    calculateChange();
                    break;
                case 3:
                    do {
                        System.out.println("Você realmente deseja fechar a aplicação?");
                        System.out.println("[1]Sim");
                        System.out.println("[2]Não");
                        switch(confirm){
                            case 1:
                                System.out.println("Fechando aplicação.");
                                break;
                            default:
                                System.out.println("Opção inválida, tente novamente.");
                                break;
                        }
                    } while (!(confirm == 1 || confirm == 2));
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while(!(option == 3 && confirm == 1));
        scanner.close();
    }   

    private static void exibitMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
    }

    private static void calculateTotalPrice(){
        System.out.println("Digite a quantidade da planta:");
        int quantity = scanner.nextInt();
        System.out.println("Digite o preço unitário da planta:");
        double price = scanner.nextDouble();

        double precoTotal = quantity * price;
        System.out.println("O preço total da venda é: " + price);
    }

    private static void calculateChange(){
        System.out.println("Digite o valor recebido pelo cliente:");
        double amountReceived = scanner.nextDouble();
        System.out.println("Digite o valor total da compra:");
        double totalValue = scanner.nextDouble();

        double change = amountReceived - totalValue;
        System.out.println("O troco a ser dado ao cliente é: " + change);
    }
}
