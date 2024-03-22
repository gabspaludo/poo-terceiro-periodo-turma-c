import java.util.Locale;
import java.util.Scanner;

public class App {
    static double totalVendas = 0;
    static double totalDescontos = 0;
    static double[][] vendasDiarias = new double[12][30]; // Matriz para armazenar as vendas diárias para cada mês e dia
    static double[] totalVendasMes = new double[12];
    static int user_action; // Movendo a declaração da variável para o escopo global

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        do {
            System.out.println("------ESCOLHA UMA OPÇÃO------");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registrar Venda");
            System.out.println("[4] - Obter Quantidade de Vendas Diárias por Mês e Dia");
            System.out.println("[5] - Obter Quantidade de Vendas Totais por Mês");
            System.out.println("[6] - Sair");

            user_action = in.nextInt();

            switch (user_action) {
                case 1:
                    calcularPrecoTotal(in);
                    break;
                case 2:
                    calcularTroco(in);
                    break;
                case 3:
                    registrarVenda(in);
                    break;
                case 4:
                    obterVendasDiariasPorMesEDia(in);
                    break;
                case 5:
                    obterVendasTotaisPorMes(in);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (user_action != 6);

        in.close();
    }

    static void calcularPrecoTotal(Scanner in) {
        System.out.println("Insira a quantidade de plantas:");
        int quantPlantas = in.nextInt();
        System.out.println("Insira o valor das plantas:");
        double valorPlantas = in.nextDouble();

        double calcPlantas = quantPlantas * valorPlantas;

        if (quantPlantas > 10) {
            double desconto = calcPlantas * 0.05; // Desconto de 5%
            calcPlantas -= desconto;
            totalDescontos += desconto;
        }

        totalVendas += calcPlantas;

        System.out.println("O preço total da compra das plantas é: R$" + calcPlantas);
    }

    static void calcularTroco(Scanner in) {
        System.out.println("Insira o valor pago pelo cliente:");
        double valorPago = in.nextDouble();
        System.out.println("Insira o valor total da compra:");
        double valorTotal = in.nextDouble();

        double valorTroco = valorPago - valorTotal;
        System.out.println("O troco é: R$" + valorTroco);
    }

    static void registrarVenda(Scanner in) {
        System.out.println("Insira o valor da venda:");
        double valorVenda = in.nextDouble();
        System.out.println("Insira o mês (1 a 12):");
        int mes = in.nextInt();
        System.out.println("Insira o dia do mês (1 a 30):");
        int dia = in.nextInt();

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
            vendasDiarias[mes - 1][dia - 1] += valorVenda;
            totalVendasMes[mes - 1] += valorVenda;
            System.out.println("Venda registrada com sucesso para o dia " + dia + " do mês " + mes + ".");
        } else {
            System.out.println("Mês ou dia inválido. Por favor, insira valores válidos.");
        }
    }

    static void obterVendasDiariasPorMesEDia(Scanner in) {
        System.out.println("Insira o mês (1 a 12):");
        int mes = in.nextInt();
        System.out.println("Insira o dia do mês (1 a 30):");
        int dia = in.nextInt();

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
            System.out.println("Quantidade de vendas para o dia " + dia + " do mês " + mes + ": R$" + vendasDiarias[mes - 1][dia - 1]);
        } else {
            System.out.println("Mês ou dia inválido. Por favor, insira valores válidos.");
        }
    }

    static void obterVendasTotaisPorMes(Scanner in) {
        System.out.println("Insira o mês (1 a 12):");
        int mes = in.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("Quantidade total de vendas para o mês " + mes + ": R$" + totalVendasMes[mes - 1]);
        } else {
            System.out.println("Mês inválido. Por favor, insira um mês entre 1 e 12.");
        }
    }
}
