import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora da Dona Gabrielinha AYAYA");
        System.out.println("O que você deseja fazer hoje?");
        System.out.println("Digite 1 para criar um pedido.");
        System.out.println("Digite 2 para ver seu histórico de vendas.");
        System.out.println("Digite 3 para sair.");

        int choise = sc.nextInt();
        sc.nextLine();

        switch (choise) {
            case 1:
                Sale sale = new Sale();
                break;

            case 2: //ver histórico de vendas.
                break;
            case 3:
                return;
            default:
                System.out.println("Esta não é uma opção válida.");
        }
    }
}