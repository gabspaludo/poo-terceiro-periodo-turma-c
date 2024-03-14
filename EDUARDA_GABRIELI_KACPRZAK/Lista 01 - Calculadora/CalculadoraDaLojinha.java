import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDaLojinha {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        ProductsSale sale = new ProductsSale(0, 0.0, 0.0);
        ProductsSale MySales = new ProductsSale(0, 0.0, 0.0); //verificar se vai ser utilizado
        ProductsSale changeSale = new ProductsSale(0, 0, 0);
        
        ArrayList<ProductsSale> recordSales = new ArrayList<ProductsSale>();

        int choice = 0;
        double amountReceived = 0;
        double change;
        double discount = 0;
        double discountOffered = 0;
        boolean discountApplied = false;

        String opc = "S";
        while (opc.equals("S") || opc.equals("s")) {
            System.out.println("Bem vindo(a) ao Sistema da Lojinha!");
            System.out.println("Deseja iniciar o programa? ");
            System.out.println("S/N:   ");
            opc = scan.next();

            while (choice != 4) {
                System.out.println("\n");
                System.out.println("\n-------------------------------------------");
                System.out.println("Menu:");
                System.out.println("[1] - Calcular Preço");
                System.out.println("[2] - Calcular Troco");
                System.out.println("[3] - Ver Histórico de Vendas");
                System.out.println("[4] - Sair");
                System.out.printf("Escolha uma das opções: ");

                try {
                    choice = scan.nextInt();
                    scan.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.printf("%nDigite a quantidade de produtos comprados: ");
                            sale.setQuantity(scan.nextInt());

                            System.out.printf("%nDigite o preço unitário do produto: R$");
                            sale.setPrice(scan.nextDouble());

                            discountApplied = sale.getQuantity() >= 10;

                            if (discountApplied) {

                                discount = 0.05 * sale.totalAmount();

                                discountOffered = sale.totalAmount() - discount;
                                sale.setDiscountOffered(discountOffered);
                                System.out.println("\n-------------------------------------------");
                                System.out.println("\nResumo da compra: ");
                                System.out.println("Obs: Compra atende requisitos p/ Desconto!");
                                System.out.printf("\nQnt. de produtos comprados: %d ", sale.getQuantity());
                                System.out.printf("\nValor total da compra com desconto: R$%.2f",
                                        sale.getDiscountOffered());

                            } else {
                                System.out.println("\n-------------------------------------------");
                                System.out.println("\nResumo da compra: ");
                                System.out.printf("%nQnt. de produtos comprados: %d ", sale.getQuantity());
                                System.out.printf("%nTotal da compra: R$%.2f ", sale.totalAmount());

                            }

                            recordSales.add(sale);
                            
                            break;

                        case 2:
                            System.out.printf("%nDigite o valor da compra: R$");
                            changeSale.setPrice(scan.nextDouble());

                            System.out.printf("%nDigite o valor recebido pelo cliente: R$");
                            amountReceived = scan.nextDouble();

                            change = changeSale.calculateChange(amountReceived);

                            if (amountReceived < changeSale.getPrice()) {
                                System.out.println("\n-------------------------------------------");
                                System.out.printf("\nAvisa o cliente que faltam R$%.2f",
                                        (changeSale.getPrice() - amountReceived));
                            } else {
                                System.out.println("\n-------------------------------------------");
                                System.out.printf("%nResumo da operação: ");
                                System.out.printf("%nValor da compra: R$%.2f ", changeSale.getPrice());
                                System.out.printf("%nQtd. recebida pelo cliente: R$%.2f ", amountReceived);
                                System.out.printf("%n");
                                System.out.printf("%nTroco do cliente: R$%.2f ", change);
                            

                            }
                            recordSales.add(changeSale);
                            recordSales.add(MySales);
                            break;

                        case 3:
                            System.out.println("\n-------------------------------------------");
                            System.out.println("\n Registro de vendas:");
                            System.out.println("\n-------------------------------------------");

                            for (int i = 0; i < recordSales.size(); i++) {
                                //tirei o ProducsSale sale = recordSales.get(i); mas ainda não testei
                                recordSales.get(i);
                                System.out.printf("%n");
                                System.out.println("Venda " + (i + 1) + ":");
                                System.out.printf("Quantidade de plantas vendidas: %d%n", sale.getQuantity());
                                System.out.printf("Valor de venda por plantas: R$%.2f%n", sale.getPrice());
                                System.out.printf("Valor recebido pelo cliente: R$%.2f%n", amountReceived);
                                
                                if (sale.getChange() > 0){
                                    System.out.printf("Troco do cliente: R$%.2f%n", sale.getChange());
                                }
                                
                                if (discountApplied) {
                                    System.out.println("Esta venda atendeu requisitos P/ DESCONTO!");
                                    System.out.printf("Valor total com Desconto Aplicado: R$%.2f%n ", sale.getDiscountOffered());

                                } else {
                                    System.out.printf("\nSem desconto.");
                                    System.out.printf("Total da venda: R$%.2f%n", sale.totalAmount());
                                    System.out.printf("%n");

                                                                        
                                }
                            }

                            break;

                        case 4:
                            System.out.println("\n-------------------------------------------");
                            System.out.println("Obrigado por utilizar o Sistema da Lojinha!");
                            System.out.println("Fechando...");
                            System.out.println("\n-------------------------------------------");
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
