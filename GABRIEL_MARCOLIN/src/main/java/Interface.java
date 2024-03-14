import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;
        Sale[] sales = new Sale[0];

        System.out.println("Bem vindo a calculadora da Dona Gabrielinha AYAYA");

        do {
            System.out.println("O que você deseja fazer hoje?");
            System.out.println("Digite 1 para criar um pedido.");
            System.out.println("Digite 2 para ver seu histórico de vendas.");
            System.out.println("Digite 3 para sair.");
            choise = sc.nextInt();
            sc.nextLine();

            switch (choise) {
                case 1:
                    Sale sale = new Sale();
                    // Aumenta o tamanho do array chamando a função increaseArraySize.
                    sales = Sale.increaseArraySize(sales);

                    // Adiciona a nova venda no final do array.
                    sales[sales.length - 1] = sale;
                    break;

                case 2:
                    if (sales.length > 0) {
                        for (int i = 0; i < sales.length; i++) {
                            System.out.println("Venda " + (i + 1));
                            System.out.println("Valor da venda: " + sales[i].valor);
                            System.out.println("Desconto na venda: " + sales[i].discount);
                            System.out.println("Valor pago na venda: " + sales[i].payment);
                            System.out.println();
                        }
                    } else {
                        System.out.println("Nenhuma venda foi feita ainda.");
                    }
                    break;

                case 3:
                    System.out.println("Tchau tchau!!!.");
                    break;

                default:
                    System.out.println("Esta não é uma opção válida.");
            }
        } while (choise != 3);
    }
}