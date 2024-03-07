package exercicio1;

import java.util.Scanner;

public class Main {
    String qualPlanta;
    float qntdPlanta;
    float valorPlanta;
    float valorFinal;
    String escolha2;
    Scanner scanner;
    float recebido;
    float produto;
    float trocoFalta;
    float trocoSobra;

    public static void main(String[] args) {
        Main main = new Main();
        main.scanner = new Scanner(System.in);

        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
        String escolha = main.scanner.nextLine();

        if (escolha.equals("1")) {
            System.out.println("Qual planta foi vendida?");
            main.qualPlanta = main.scanner.nextLine();

            System.out.println("Quantas " + main.qualPlanta + "(s) foram vendidas?");
            main.qntdPlanta = main.scanner.nextFloat();

            System.out.println("Qual é o valor da(o) " + main.qualPlanta + "? (Caso seja valor quebrado use 'n,n') ");
            main.valorPlanta = main.scanner.nextFloat();

            main.valorFinal = main.qntdPlanta * main.valorPlanta;

            System.out.println("O valor da(o) " + main.qualPlanta + " é " + main.valorFinal + " reais");
            main.scanner.nextLine();

            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            main.escolha2 = main.scanner.nextLine();

            if (main.escolha2.equals("2")) {
                System.out.println("Qual o valor de dinheiro recebido?");
                float valorRece = main.scanner.nextFloat();

                if (valorRece < main.valorFinal) {
                    float trocoFalta = main.valorFinal - valorRece;
                    System.out.println("Ainda falta " + trocoFalta + " reais!");
                } else if (valorRece == main.valorFinal) {
                    System.out.println("Não precisa de troco! ");
                } else {
                    float troco1 = valorRece - main.valorFinal;
                    System.out.println("O troco é de: " + troco1 + " reais!");
                }
            } else if (main.escolha2.equals("3")) {
                System.out.println("Obrigado por usar a calculadora! Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        } else if (escolha.equals("2")){
            System.out.println("Qual valor recebido? ");
            main.recebido = main.scanner.nextFloat();
            
            System.out.println("Qual o valor do produto? ");
            main.produto = main.scanner.nextFloat();

            if (main.recebido < main.produto){
                main.trocoFalta = main.produto - main.recebido;
                System.out.println("Ainda falta " + main.trocoFalta + " reais!" );
            } else if (main.recebido == main.produto) {
                System.out.println("Não precisa de troco!");
            } else{
                main.trocoSobra = main.recebido - main.produto;
                System.out.println("O troco é de " + main.trocoSobra + " reais!");
            }
        } else if (escolha.equals("3")){
            System.out.println("Saindo...");
        }else {
            System.out.println("Opção inválida");
        }
    }
}
