import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Gabrielinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora da Dona Gabrielinha AYAYA");
        System.out.println("O que você deseja fazer hoje?");
        System.out.println("Digite 1 para calcular o preço total do pedido.");
        System.out.println("Digite 2 para calcular o troco da cliente");
        System.out.println("Digite 3 para sair.");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Qual o valor do produto (em reais) que a cliente está comprando?");
                double valor = sc.nextDouble();
                System.out.println("Qual a quantidade de produtos que ela está comprando?");
                double qnt = sc.nextDouble();
                System.out.println("Quantos reais o cliente está fornecendo para pagar a compra?");
                double pagamento = sc.nextDouble();

                double total = total_compra(valor, qnt);
                calcular_troco_com_pedido(total, pagamento);
                break;

            case 2:
                calcular_troco_sem_pedido(sc);
                break;

            case 3:
                return;
        }
    }

    public static double total_compra(double valor, double qnt) {
        double total = (valor * qnt);
        System.out.println("O total da compra do cliente ficou: " + total + " reais.");
        return total;
    }

    public static void calcular_troco_com_pedido(double total, double pagamento) {
        double troco = (total - pagamento);

        if (troco > 0) {
            System.out.println("O cliente ainda precisa pagar " + troco + " reais");
        } else {
            System.out.println("O troco que ficou para a cliente é de " + Math.abs(troco) + " reais.");
        }
    }

    public static void calcular_troco_sem_pedido(Scanner sc) {
        System.out.println("Qual o valor total do pedido do cliente (em reais)?");
        double total = sc.nextDouble();

        System.out.println("Quantos reais o cliente está fornecendo para pagar a compra?");
        double pagamento = sc.nextDouble();

        double troco = (total - pagamento);

        if (troco > 0) {
            System.out.println("O cliente ainda precisa pagar " + troco + " reais");
        } else {
            System.out.println("O troco que ficou para a cliente é de " + Math.abs(troco) + " reais.");
        }
    }
}