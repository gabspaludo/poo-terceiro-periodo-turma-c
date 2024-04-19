package Dona_Gabi.MYY_PLANT;

import java.util.Date;

public class Pedido {
    private Integer id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Item[] itens;

    public Pedido(Integer id, Cliente cliente, Item[] itens) {
        Long diaMs = 86400000L;
        Long msAgora = new Date().getTime();
        Long msDaquiTresDias = msAgora + (3 * diaMs);

        this.id = id;
        this.cliente = cliente;
        this.itens = itens;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTresDias);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public Double calcularValorTotal() {
        Double total = 0d;

        for (Item item : itens) {
            total += item.getValor();
        }

        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor Total: " + calcularValorTotal());
    }
}