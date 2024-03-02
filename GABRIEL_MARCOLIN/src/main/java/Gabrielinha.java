import java.util.Scanner;

public class Gabrielinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Abrindo o console que esta nos requisitos do exercício.

        System.out.println("Bem vindo a calculadora da Dona Gabrielinha AYAYA");
        System.out.println("O que você deseja fazer hoje?");
        System.out.println("Digite 1 para calcular o preço total do pedido.");
        System.out.println("Digite 2 para calcular o troco do cliente");
        System.out.println("Digite 3 para sair.");

        int opcao = sc.nextInt();

        //Utilizando Switch/Case para o realizarmos o comando respectivo a opção que o cliente escolheu.

        switch (opcao) {
            case 1:
                System.out.println("Qual o valor do produto (em reais) que o cliente está comprando?");
                double valor = sc.nextDouble();
                System.out.println("Qual a quantidade de produtos que ele está comprando?");
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

            default:
                System.out.println("Esta não é uma opção válida!");
                break;
        }
    }

    //Esta função foi utilizada para realizar o cadastro do pedido, multiplicando o valor do produto pela quantidade do mesmo.

    public static double total_compra(double valor, double qnt) {
        double total = (valor * qnt);
        System.out.println("O total da compra do cliente ficou: " + total + " reais.");
        return total;
    }

    //Esta função foi utilizada para calcular o troco do cliente APENAS se o cliente já tiver um pedido criado,
    //no caso, se ele tiver selecionado a opção 1.

    public static void calcular_troco_com_pedido(double total, double pagamento) {
        double troco = (total - pagamento);


        //Este if foi utilizado para validar se o cliente está fornecendo o dinheiro necessário para zerar
        //o valor que precisa ser pago. Vale ressaltar que foi utilizado a função Math.abs para tornar o
        //valor de troco positivo, já que é o valor que o cliente ainda vai precisar pagar.

        if (troco > 0) {
            System.out.println("O cliente ainda precisa pagar " + troco + " reais");
        } else {
            System.out.println("O troco que ficou para o cliente é de " + Math.abs(troco) + " reais.");
        }
    }

    //Esta função foi utilizada para calcular o troco do cliente caso ele ainda não tenho NÃO tenha um pedido criado,
    //no caso, se ele tiver selecionado a opção 2.

    public static void calcular_troco_sem_pedido(Scanner sc) {
        System.out.println("Qual o valor total do pedido do cliente (em reais)?");
        double total = sc.nextDouble();

        System.out.println("Quantos reais o cliente está fornecendo para pagar a compra?");
        double pagamento = sc.nextDouble();

        double troco = (total - pagamento);

        //Mesma validação feita na função calcular_troco_com_pedido.

        if (troco > 0) {
            System.out.println("O cliente ainda precisa pagar " + troco + " reais");
        } else {
            System.out.println("O troco que ficou para o cliente é de " + Math.abs(troco) + " reais.");
        }
    }
}
