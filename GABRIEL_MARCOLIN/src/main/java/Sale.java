import java.util.Scanner;

public class Sale {
    double valor;
    int quantity;
    double payment;
    double total;
    double change;
    double discount;
    static Sale[] sales;
    int saleQuantity;
    Scanner sc = new Scanner(System.in);

    public Sale() {
        System.out.println("Qual o valor do produto (em reais) que o cliente está comprando?");
        this.valor = sc.nextDouble();
        System.out.println("Qual a quantidade de produtos que ele está comprando?");
        this.quantity = sc.nextInt();
        System.out.println("Quantos reais o cliente está fornecendo para pagar a compra?");
        this.payment = sc.nextDouble();

        calculatingChange();
        sales = new Sale[saleQuantity];
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

    //Função que aumenta o array original com base num novo array, que tem os mesmos
    //valores que o array original, porém, com +1 de tamanho.

    public static Sale[] increaseArraySize(Sale[] array) {
        Sale[] newArray = new Sale[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}