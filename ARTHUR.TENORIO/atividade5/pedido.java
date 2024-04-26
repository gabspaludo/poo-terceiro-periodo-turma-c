package atividade7;
import java.util.Date;

class Pedido {
    private int id;
    private Date dataCriacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private Item itemSelecionado;

    public Pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, Item itemSelecionado) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itemSelecionado = itemSelecionado;
    }

    public int getId() {
        return id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Loja getLoja() {
        return loja;
    }

    public Item getItemSelecionado() {
        return itemSelecionado;
    }
}
