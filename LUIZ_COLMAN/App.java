import java.util.Locale;
import java.util.Scanner;

public class App {
    static int user_action;
    static double totalVendas = 0;
    static double totalDescontos = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        do {
            System.out.println("------ESCOLHA UMA OPÇÃO------");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registrar Venda");
            System.out.println("[4] - Sair");

            user_action = in.nextInt();

            switch (user_action) {
                case 1:
                    System.out.println("Insira a quantidade de plantas:");
                    double quantPlantas = in.nextDouble();
                    System.out.println("Insira o valor das plantas:");
                    double valorPlantas = in.nextDouble();
                    System.out.println("A quantidade de plantas é: "+ quantPlantas + "\nO valor de cada planta é: " + "R$" + valorPlantas);
                    
                    double calcPlantas;
                    double calcPlantasDesconto;
                    calcPlantas = quantPlantas * valorPlantas;
                    calcPlantasDesconto = (quantPlantas > 10) ? calcPlantas * 0.95 : calcPlantas;
                    totalVendas += calcPlantasDesconto;
                    System.out.println("O preço total da compra das plantas é: " + "R$" + calcPlantasDesconto);
                    break;
                case 2:
                    System.out.println("Insira o valor pago pelo cliente:");
                    double valorPago = in.nextDouble();
                    System.out.println("Insira o valor total da compra:");
                    double valorTotal = in.nextDouble();
                    double valorTroco;
                    valorTroco = valorPago - valorTotal;
                    System.out.println("O troco é: R$" + valorTroco);
                    break;
                case 3:
                    System.out.println("Venda registrada.");
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (user_action != 4);
        in.close();
    }
}
