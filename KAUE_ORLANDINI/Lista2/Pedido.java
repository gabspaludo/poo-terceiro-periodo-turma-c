package KAUE_ORLANDINI.Lista2;

public class Pedido extends Item {

    double[] itens = new double[5];

    public String id;

    public String nome;
    
    public String dataCriacao;
    
    public String dataPagamento;
    
    public double dataVencimentoReserva;
    
    public String cliente;
    
    public String loja;

    public String valor;
    
    public String vendedor;

    void calcularValorTotal(){
        System.out.println("valor total: ".concat(valor));
    }
    
    
    
    
    void gerarDescricaoVenda() {
        System.out.println("data de criacao: ".concat(dataCriacao).concat(", valor: ").concat(valor));
    }
    
}
