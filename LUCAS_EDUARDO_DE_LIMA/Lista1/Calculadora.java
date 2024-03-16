package LUCAS_EDUARDO_DE_LIMA.Lista1;

import java.util.Scanner;

/*Pedir pro usuario digitar o preço da planta

Pedir pro usuário digitar a quantidade de plantas que foi comprada

Multiplicar o preço x quantidade pra obter o valor total da compra

Pedir pro usuario digitar a quantia que foi paga

Calcular o troco que deve ser dado ao cliente

quantidade paga - valor total

Criar um menuzinho com 3 opções
1 - calcular total
2 - calcular troco
3 - sair (exibir uma mensagem e fechar o menu)*/

//Scanner serve para ler o que o usuario digitar
//system.out mostra no console o que foi escrito

public class Calculadora {
    public static void main(String[] args) {
        Scanner preco_planta = new Scanner(System.in);
        Scanner quantidade_planta = new Scanner(System.in);
        Scanner valor_pago = new Scanner(System.in);
        Scanner opcao_escolhida = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.println(" 1 - Calcular total");
            System.out.println(" 2 - Calcular troco");
            System.out.println(" 3 - Sair");
            System.out.println("Escolha uma opção ");
            int opcao = opcao_escolhida.nextInt();

            if (opcao ==3){
                System.out.println("Sistema encerrado !!!");
                opcao_escolhida.close();
                return;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o preço da planta:");
                    double preco = preco_planta.nextDouble();
                    System.out.println("Digite a quantidade de plantas:");
                    int quantidade = quantidade_planta.nextInt();
                    total = preco * quantidade;
                    System.out.println("O valor total é de: " +total );
                    break;
                
                    case 2:
                    System.out.println("Digite a quantia que foi paga:");
                    double valor_pagado = valor_pago.nextDouble();
                    double troco_cliente = valor_pagado - total;
                    System.out.println("O valor de troco é de: " +troco_cliente);

                    break;


                default:
                System.out.println("Opção inválida");
                    break;
            }

        }

    }
}
