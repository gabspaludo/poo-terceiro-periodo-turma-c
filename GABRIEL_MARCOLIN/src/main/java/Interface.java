import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        double[][] anualSales = new double[31][13];
        Scanner sc = new Scanner(System.in);
        int choice;
        Calendar calendar = null;
        Sale[] sales = new Sale[0];

        System.out.println("Bem vindo a calculadora da Dona Gabrielinha AYAYA");

        do {
            System.out.println("O que você deseja fazer hoje?");
            System.out.println("Digite 1 para criar um pedido.");
            System.out.println("Digite 2 para ver seu histórico de vendas.");
            System.out.println("Digite 3 para registrar as suas vendas anuais.");
            System.out.println("Digite 4 para visualizar suas vendas anuais.");
            System.out.println("Digite 5 para sair.");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
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
                     calendar = new Calendar(day, month);
                    break;

                case 4:

                    System.out.println("Vocẽ quer consultar as vendas de quais meses?\n[1]Janeiro\n[2]Fevereiro\n[3]Março\n[4]Abril");
                    System.out.println("[5]Maio\n[6]Junho\n[7]Julho\n[8]Agosto\n[9]Setembro\n[10]Outubro\n[11]Novembro\n[12]Dezembro");
                    month = sc.nextInt();

                    System.out.println("Qual dia você quer consultar deste mês?");
                    day = sc.nextInt();

                    calendar.consultSales(day,month,anualSales);
                    break;

                case 5:
                    System.out.println("Tchau tchau!!!.");
                    break;

                default:
                    System.out.println("Esta não é uma opção válida.");
            }
        } while (choice != 5);
    }
}
