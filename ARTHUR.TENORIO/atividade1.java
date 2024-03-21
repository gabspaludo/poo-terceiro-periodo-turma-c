import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a operação que deseja fazer: 1 - Calcular preço total 2 -Calcular troco 3 - Sair");
		int console = scanner.nextInt();
		
		switch (console) {
		    case 1: 
		        valortotal();
		        break;
		    case 2:
		        troco();
		        break;
		    case 3:
		        System.out.println("Saindo...");
		        System.exit(0);
		        
		}
	}
	
private static void valortotal(){
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite a quantidade de intens comprados");
	    int quantidade = scanner.nextInt();
	    System.out.println("Digite o valor");
	    double valor = scanner.nextDouble();
	    double total = quantidade * valor;
	    System.out.println("o valor total da compra é" + total + "reais");
	    
	}
	
	private static void troco() {
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor recebido pelo cliente: R$");
        double valorRecebido = scanner.nextDouble();
        System.out.print("Digite o valor total da compra: R$");
        double valorTotal = scanner.nextDouble();

        double troco = valorRecebido - valorTotal;
        System.out.println("O troco a ser dado ao cliente é: R$" + troco);
	}
	    
	}
	