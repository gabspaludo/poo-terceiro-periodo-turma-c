package lista_05.classes.pedido;

import lista_05.classes.cliente.Cliente;
import lista_05.classes.item.Item;
import lista_05.classes.loja.Loja;
import lista_05.classes.vendedor.Vendedor;

public class Pedido {
  public int id;
  public String dataCriacao;
  public String dataPagamento;
  public String dataVencimentoReserva;
  public Cliente cliente;
  public Vendedor vendedor;
  public Loja loja;
  public Item[] itens;

  public Pedido(int id, String dataCriacao, String dataPagamento, String dataVencimentoReserva, Cliente cliente,
      Vendedor vendedor, Loja loja, Item... itens) {
    this.id = id;
    this.dataCriacao = dataCriacao;
    this.dataPagamento = dataPagamento;
    this.dataVencimentoReserva = dataVencimentoReserva;
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.loja = loja;
    this.itens = itens;
  }

  public String getDataVencimentoReserva() {
    return dataVencimentoReserva;
  }

  public String getDataPagamento() {
    return dataPagamento;
  }

  public double calcularValorTotal() {
    double valorTotal = 0;
    for (int i = 0; i < itens.length; i++) {
      valorTotal += itens[i].getValor();
    }
    return valorTotal;
  }

  public void gerarDescricaoVenda() {
    System.out
        .println(
            "Data de criação: ".concat(this.dataCriacao) + String.format(" - Valor %.2f", this.calcularValorTotal()));
  }
}
