import java.util.Scanner;

public class App {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int qtdPlanta = 0;
        float valorPlanta = 0;
        float valorTotal = 0;
        float valorRecebido = 0;
        float valorTroco = 0;
        int menu = 0;

        System.out.println("[1] - Calcular preço total:");
        System.out.println("[2] - Calcular Troco:");
        System.out.println("[3] - Sair:");
        menu = ler.nextInt();
        switch (menu) {
            case 1:
            System.out.println("Quantas plantas foram compradas: ");
            qtdPlanta = ler.nextInt();
            System.out.println("Digite o valor da planta:");
            valorPlanta = ler.nextFloat();
            valorTotal = valorPlanta * qtdPlanta;
            System.out.println("O valor total da compra é: " + valorTotal);
                    
                break;
            case 2: 
            System.out.println("Digite o valor recebido:");
            valorRecebido = ler.nextFloat();
            System.out.println("Digite o valor total da compra: " );
            valorTotal = ler.nextFloat();
            valorTroco = valorRecebido - valorTotal;
            if(valorRecebido < valorTotal){
                System.out.println("Está faltando dinheiro :( ");
            }
            System.out.println("O valor so troco é: " + valorTroco);
               
                break;
            
            case 3:
            System.out.println("Obrigada pela sua compra!!!");

        
            default:

                break;
        }
 






    }
}