import java.util.Locale;
import java.util.Scanner;

public class App {
    static int user_action;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        do {
            System.out.println("------ESCOLHA UMA OPÇÃO------");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");

            user_action = in.nextInt();

            switch (user_action) {
                case 1:
                    System.out.println("Insira a quantidade de plantas:");
                    String quantPlantas = in.next();
                    System.out.println("Insira o valor das plantas:");
                    String valorPlantas = in.next();
                    System.out.println("A quantidade de plantas é: "+ quantPlantas + "\nO valor de cada planta é: " + "R$" + valorPlantas);
                    int calcPlantas;
                    calcPlantas = (int) Integer.parseInt(quantPlantas) * Integer.parseInt(valorPlantas);
                    System.out.println("O preço total da compra das plantas é: " + "R$" + calcPlantas);
                    break;
                case 2:
                    System.out.println("Insira o valor pago pelo cliente:");
                    String valorPago = in.next();
                    System.out.println("Insira o valor total da compra:");
                    String valorTotal = in.next();
                    double valorTroco;
                    valorTroco = (double) Integer.parseInt(valorPago) - Integer.parseInt(valorTotal);
                    System.out.println("O troco é: R$" + valorTroco);
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            } while (user_action != 4);
            in.close();
    }
    
}
