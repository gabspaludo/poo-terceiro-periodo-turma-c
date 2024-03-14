import java.util.Scanner;

public class Sale {
    private double valor;
    private int quantity;
    private double payment;
    private double total;
    private double change;
    private double discount;
    Scanner sc = new Scanner(System.in);

    public Sale() {
        System.out.println("Qual o valor do produto (em reais) que o cliente está comprando?");
        this.valor = sc.nextDouble();
        System.out.println("Qual a quantidade de produtos que ele está comprando?");
        this.quantity = sc.nextInt();
        System.out.println("Quantos reais o cliente está fornecendo para pagar a compra?");
        this.payment = sc.nextDouble();

        calculatingChange();
    }

    //Esta função foi utilizada para realizar o cadastro do pedido, multiplicando o valor do produto pela quantidade do mesmo.

    public double saleTotal() {

        if (this.quantity < 11) {
            this.total = (this.valor * this.quantity);
            System.out.println("O total da compra do cliente ficou: " + this.total + " reais.");
        } else {
            System.out.println("Desconto de 5% aplicado ao valor total de: " + String.valueOf(this.total = (this.valor * this.quantity)) + " reais.");
            System.out.println("O desconto é de: " + String.valueOf(this.discount = (this.total * 0.05)) + " reais.");
        }

        double saleTotal = (this.total - this.discount);
        return saleTotal;
    }

    //Esta função foi utilizada para calcular o troco do cliente APENAS se o cliente já tiver um pedido criado,
    //no caso, se ele tiver selecionado a opção 1.

    public void calculatingChange() {

        this.change = (saleTotal() - this.payment);

        //Este if foi utilizado para validar se o cliente está fornecendo o dinheiro necessário para zerar
        //o valor que precisa ser pago. Vale ressaltar que foi utilizado a função Math.abs para tornar o
        //valor de troco positivo, já que é o valor que o cliente ainda vai precisar pagar.

        if (this.change > 0) {
            System.out.println("O cliente ainda precisa pagar " + this.change + " reais.");
        } else {
            System.out.println("O troco que ficou para o cliente é de " + Math.abs(this.change) + " reais.");
        }
    }
}