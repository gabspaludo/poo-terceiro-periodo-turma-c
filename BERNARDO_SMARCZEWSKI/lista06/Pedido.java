package lista06;

import java.util.Date;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimento;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private Item[] itens;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, Item[] itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
        calcularDataVencimentoReserva();
    }

    private void calcularDataVencimentoReserva() {
        long tresDiasEmMilissegundos = 3 * 24 * 60 * 60 * 1000;
        long dataCriacaoEmMilissegundos = dataCriacao.getTime();
        dataVencimento = new Date(dataCriacaoEmMilissegundos + tresDiasEmMilissegundos);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Loja: " + loja.nome);
        System.out.println("ID do Pedido: " + id);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Data de Pagamento: " + dataPagamento);
        System.out.println("Data de Vencimento da Reserva: " + dataVencimento);
        System.out.println("Vendedor: " + vendedor.nome);
        System.out.println("Comprador: " + cliente.nome);
        System.out.println("Valor Total: " + calcularValorTotal());
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
