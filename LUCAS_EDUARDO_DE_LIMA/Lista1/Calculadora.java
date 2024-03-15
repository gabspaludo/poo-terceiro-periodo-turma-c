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
3 - sair (exibir uma mensagem e fechar o menu)

NOVAS ALTERAÇÕES: 

1. Desconto Especial:
    Quando um cliente compra mais de 10 plantas, Dona Gabrielinha oferece um desconto especial de 5% no valor total da compra.
   
    Entrada: Receber dois valores, primeiro a quantidade da referida planta, segundo a valor o preço da mesma.
    Saída: Retornar caso a quantidade informada for maior que 10 realizar o desconto.
   
2. Registro de Vendas:
    Dona Gabrielinha deseja manter um registro das vendas, incluindo a quantidade de plantas vendidas, o valor venda e os descontos aplicados.
   
    Entrada: Venda realizada sistema
    Saída: Armazenamento desses dados no sistema.

3. Adicionar ao menu existente função 2 e aprimorar cálculo do valor a pagar com a função 1.*/

//Scanner serve para ler o que o usuario digitar
//system.out mostra no console o que foi escrito

public class Calculadora {


    private static double[] valores = new double[100];

    private static int[] quantidades = new int[100];

    private static double[]  descontos = new double[100];
    private static int posicao;


    public static void main(String[] args) {

        double total = 0;

        while (true) {
            System.out.println("1 - Calcular total");
            System.out.println("2 - Calcular troco");
            System.out.println("3 - Salvar vendas");
            System.out.println("4 - Imprimir vendas");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção ");
            int opcao = new Scanner(System.in).nextInt();

            if (opcao ==5){
                System.out.println("Sistema encerrado !!!");
                return;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o preço da planta:");
                    double preco = new Scanner(System.in ).nextDouble();
                    System.out.println("Digite a quantidade de plantas:");
                    int quantidade = new Scanner(System.in).nextInt();
                    
                    if (quantidade > 10){
                        double descontoEspecial = (preco*quantidade)* 0.05;
                        total = (preco * quantidade) - descontoEspecial;
                        System.out.println("Desconto especial para 10 plantas aplicado!");
                        System.out.println("O valor com desconto é de:" + total);
                    }else{
                        total = preco * quantidade;
                        System.out.println("O valor total é de:" + total); 
                    }
                
                    case 2:
                    System.out.println("Digite a quantia que foi paga:");
                    double valor_pagado = new Scanner(System.in).nextDouble() ;
                    double troco_cliente = valor_pagado - total;
                    System.out.println("O valor de troco é de: " +troco_cliente);

                    break;

                    case 3:
                    System.out.println("Digite os valores das compras:");
                    double valor = new Scanner(System.in).nextDouble();

                    System.out.println("Insira a quantidade de itens:");
                    int qnt = new Scanner (System.in).nextInt();

                    System.out.println("Digite o valor do desconto:");
                    double desconto = new Scanner (System.in).nextDouble();                
                    
                    valores[posicao] = valor;
                    quantidades[posicao] = qnt;
                    descontos[posicao] = desconto;
                    posicao++;
                    break;

                    case 4:
                    for (int i=0; i < posicao; i++) {
                        System.out.println(
                            "Preço: R$ " + valores[i] + 
                            ", Quantidade: " + quantidades[i] + 
                            ", Desconto: R$ " + descontos[i]
                          );
                    }
                    break;
                default:
                System.out.println("Opção inválida");
                    break;
            }

        }

    }
}
