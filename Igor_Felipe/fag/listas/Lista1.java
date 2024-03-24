package fag.listas;

import java.util.Scanner;

public class Lista1{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        boolean Continuar = true;

        while(Continuar == true){
        
            System.out.println("Calculadora escolha a opcao desejada: ");
            System.out.println("1-Calcular preco de venda");
            System.out.println("2-Calcular troco");
            System.out.println("0-Sair");
            int escolha;
            escolha = read.nextInt();
            
            switch (escolha){
                case 1:
                    int Qtd;
                    float Valor;

                    System.out.println("Digite a quantidade de produtos: ");
                    Qtd = read.nextInt();

                    System.out.println("Digite o valor do produto: ");
                    Valor = read.nextFloat();

                    float Resultado1 = Qtd * Valor;
                    System.out.println("O valor que terá que ser pago é: R$"+Resultado1);
                    System.out.println("Voltando para o menu principal...");
                break;
                case 2:
                    float ValorCompra;
                    float ValorEntregue;
                    float Resultado;
                    
                    System.out.println("Digite o valor da compra do cliente: ");
                    ValorCompra = read.nextFloat();
        
                    System.out.println("Digite o valor entregue pelo cliente: ");
                    ValorEntregue = read.nextFloat();
        
                    Resultado = ValorEntregue-ValorCompra;
                    if(Resultado < 0){
                        System.out.println("Valor insuficiente para a compra, falta R$"+Math.abs(Resultado)+" para efetuar a compra");
                    }else{
                        System.out.println("O valor do troco será: R$"+Resultado);
                        System.out.println("Voltando para o menu principal...");
                    }
                break;
                case 0:
                    System.out.println("Saindo da aplicação");
                    Continuar = false;    
                break;
                default:
                    System.out.println("Erro, número indisponível");
                    Continuar = true;
                break;
            }
        }
    }
}