package KAUE_ORLANDINI.Lista2;

import java.util.Date;
import java.util.Scanner;

public class Pedido  {

    Scanner scanner = new Scanner(System.in);

    private double[] itens = new double[5];

    private String id;

    private String nome;
    
    private Date dataCriacao = new Date();
    
    private Date dataPagamento = new Date();
    
    private Date dataVencimentoReserva = new Date(); 
    
    private String cliente;
    
    private String loja;

    private double valor;
    
    private String vendedor;

    public Pedido(double[] itens, String id, String nome, Date dataCriacao, Date dataPagamento,
            Date dataVencimentoReserva, String cliente, String loja, double valor, String vendedor) {
        this.itens = itens;
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento;
        this.dataVencimentoReserva = dataVencimentoReserva;
        this.cliente = cliente;
        this.loja = loja;
        this.valor = valor;
        this.vendedor = vendedor;
    }

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

    public Scanner getScanner() {
        return scanner;
    }

    public double[] getItens() {
        return itens;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public String getLoja() {
        return loja;
    }

    public double getValor() {
        return valor;
    }

    public String getVendedor() {
        return vendedor;
    }

    
}