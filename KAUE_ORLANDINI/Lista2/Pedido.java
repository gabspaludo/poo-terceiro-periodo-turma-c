package KAUE_ORLANDINI.Lista2;

import java.util.Date;
import java.util.Scanner;

public class Pedido extends Item {

    Scanner scanner = new Scanner(System.in);

    double[] itens = new double[5];

    public String id;

    public String nome;
    
    Date dataCriacao = new Date();
    
    Date dataPagamento = new Date();
    
    Date dataVencimentoReserva = new Date(); 
    
    public String cliente;
    
    public String loja;

    public double valor;
    
    public String vendedor;

    void calcularValorTotal(){
        System.out.println("valor total: " + String.valueOf(valor));
    }
    
    void criarPedido(){
        System.out.println("qual o valor do pedido?");
        double valorPedido = scanner.nextInt();
        System.out.println("data de criacao "+ String.valueOf(dataCriacao) + ", valor: " + String.valueOf(valorPedido));
    }
    
    
    void gerarDescricaoVenda() {
        System.out.println("data de criacao "+ String.valueOf(dataCriacao) + ", valor: " + String.valueOf(valor));
    }
    
}
