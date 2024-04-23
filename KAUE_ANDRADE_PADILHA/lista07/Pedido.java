package lista07;

import java.util.Date;

public class Pedido {
  private Integer id;
  private Date dataCriacao;
  private Date dataPagamento;
  private Date dataVencimento;
  private Cliente cliente;
  private Vendedor vendedor;
  private Loja loja;
  private String empresaParceira;
  public Item[] itens = new Item[10];

  private int posicao = 0;

  public void salvar(Item item) {
    itens[posicao++] = item;
    item.id = posicao;
  }

  public float calcularValorTotal() {
    if (itens[0] == null) return 0;

    Float valorTotal = 0.0f;

    for (int i = 0; i < itens.length; i++) {
      valorTotal += itens[i].valor;
    }

    System.out.println("Valor total: " + valorTotal);
    return valorTotal;
  }

  public void gerarDescricaoVenda() {
    String msg = "Data de criação: ".concat(dataCriacao.toString())
    //.concat("\nItens: ").concat(gerarDescricaoItens()) // Exibir isso
    .concat("\nValor total: ").concat(calcularValorTotal() + "")
    .concat("\nEm parceria com: ").concat(empresaParceira);
    System.out.println(msg);
  }

  public void gerarDescricaoItens() {
    for (int i = 0; i < itens.length; i++) {
      if (itens[i] != null) {
        itens[i].gerarDescricao();
      }
    }
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public Date getDataCriacao() {
    return dataCriacao;
  }

  public void setDataPagamento(Date dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public Date getDataPagamento() {
    return dataPagamento;
  }

  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public Date getDataVencimento() {
    return dataVencimento;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setVendedor(Vendedor vendedor) {
    this.vendedor = vendedor;
  }

  public Vendedor getVendedor() {
    return vendedor;
  }

  public void setLoja(Loja loja) {
    this.loja = loja;
  }

  public Loja getLoja() {
    return loja;
  }

  public void setEmpresaParceira(String empresaParceira) {
    this.empresaParceira = empresaParceira;
  }

  public String getEmpresaParceira() {
    return empresaParceira;
  }
}
