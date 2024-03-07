package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
            String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            System.out.println("Qual planta foi vendida?");
                String qualPlanta = scanner.nextLine();
            
            System.out.println("Quantas " + qualPlanta + "(s) foram vendidas?");
                Float qntdPlanta = scanner.nextFloat();
            
            System.out.println("Qual é o valor da(o) " + qualPlanta + "? (Caso seja valor quebrado use 'n,n') ");
                Float valorPlanta = scanner.nextFloat();

            float valorFinal = (qntdPlanta * valorPlanta);

            System.out.println("O valor da(o) " + qualPlanta + " é " + valorFinal + (" reais"));
                scanner.nextLine();

            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
                String escolha2 = scanner.nextLine();

            if (escolha2.equals("2")) {
                System.out.println("Qual o valor de dinheiro recebido?");
                    Float valorRece = scanner.nextFloat();
                        
                if(valorRece < valorFinal) {
                    float trocoFalta = (valorRece - valorFinal) *-1;
                    System.out.println("Ainda falta " + trocoFalta + " reais!");
                }   
                    else if(valorRece == valorFinal) {
                        System.out.println("Não precisa de troco! ");
                    } 
                        else {
                            float troco = (valorRece - valorFinal);
                            System.out.println("O troco é de: " + troco + " reais!");
                        }     
            }
                else if(escolha2.equals("3")) {
                System.out.println("Obrigado por usar a calculadora!");
                }   
        }

    }   
}