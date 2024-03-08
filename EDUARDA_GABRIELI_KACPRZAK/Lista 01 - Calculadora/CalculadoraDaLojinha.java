import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDaLojinha {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        ProductsSale sale = new ProductsSale(0, 0.0); 

        int choice = 0;
        double amountReceived;
        double change;

        String opc = "S";
        while (opc.equals ("S") || opc.equals("s")){
            System.out.printf("%nBem vindo(a) ao Sistema da Lojinha!");
            System.out.printf("%nDeseja iniciar o programa? ");
            System.out.printf("%nS/N:   ");
            opc = scan.next();
    
        while (choice != 3) {
            System.out.printf("%n-------------------------------------------%n");
            System.out.println("Menu:");
            System.out.println("[1] - Calcular Preço");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma das opções: ");

             try {
                choice = scan.nextInt();
                scan.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.printf("%nDigite a quantidade de produtos comprados: ");
                    sale.setQuantity(scan.nextInt());
            
                    System.out.printf("Digite o preço unitário do produto: R$");
                    sale.setPrice(scan.nextDouble());

                    System.out.printf("%nResumo da compra: ");
                    System.out.printf("%nQnt. de produtos comprados: R$%d ", sale.getQuantity());
                    System.out.printf("%nTotal da compra: R$%.2f ", sale.totalAmount());
                    System.out.printf("%n");

                    break;

                case 2:
                    System.out.printf("%nDigite o valor da compra: R$");
                    sale.setPrice(scan.nextDouble());

                    System.out.printf("%nDigite o valor recebido pelo cliente: R$");
                    amountReceived = scan.nextDouble();

                    change = sale.calculateChange(amountReceived);

                    if (amountReceived < sale.getPrice()){
                        System.out.printf("%nAvisa o cliente que falta R$%.2f", (sale.getPrice() - amountReceived));
                    } else {
            
                    System.out.printf("%nResumo da operação: ");
                    System.out.printf("%nValor da compra: R$%.2f ", sale.getPrice());
                    System.out.printf("%nQtd. recebida pelo cliente: R$%.2f ", amountReceived);
                    System.out.printf("%n");
                    System.out.printf("%nTroco do cliente: R$%.2f ", change);
                    System.out.printf("%n");

                    }

                    break;
            
                case 3:
                    System.out.printf("%n-------------------------------------------");
                    System.out.printf("%n");
                    System.out.printf("%nObrigado por utilizar o Sistema da Lojinha!");
                    System.out.printf("%nFechando...");
                    System.out.printf("%n");
                    System.out.printf("%n-------------------------------------------");
                    System.out.printf("%n%n");

                    break;

                default: 
                    System.out.printf("%n%n%n");
                    System.out.printf("Algo deu errado. Confira se os dados inseridos estão corretos.");
                    break;
            }
                    } catch (InputMismatchException e) {
                        System.out.printf("%n%n%n");
                        System.out.println("Erro! Por favor, insira os dados numéricos utilizando '.' ");
                        scan.nextLine(); 
                    }
            }
        }
        scan.close();
        
    }
}

