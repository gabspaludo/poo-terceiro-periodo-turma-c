package Lista07;

import java.util.Date;

public class Pedido {
    @SuppressWarnings("unused")
    private int id;
    private Date dataCriacao;
    @SuppressWarnings("unused")
    private Date dataPagamento;
    @SuppressWarnings("unused")
    private Date dataVencimentoReserva;
    @SuppressWarnings("unused")
    private Cliente cliente;
    @SuppressWarnings("unused")
    private Vendedor vendedor;
    @SuppressWarnings("unused")
    private String loja;
    private Item[] itens;

    // Construtor, getters e setters
    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public String gerarDescricaoVenda() {
        return "Pedido criado em " + dataCriacao + ", Valor total: " + calcularValorTotal();
    }

    public void setCliente(Cliente cliente2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCliente'");
    }

    public void setVendedor(Vendedor vendedor2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVendedor'");
    }

    public void setLoja(String loja2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLoja'");
    }

    public void setItens(Item[] itens2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setItens'");
    }

    public void setDataCriacao(java.sql.Date date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataCriacao'");
    }

    public void setDataVencimentoReserva(java.sql.Date calcularDataVencimentoReserva) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataVencimentoReserva'");
    }

    public Date getDataVencimentoReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataVencimentoReserva'");
    }
}