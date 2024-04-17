package lista_05.classes.processa_pedido;

import java.util.Date;

import lista_05.classes.pedido.Pedido;

public class ProcessaPedido {
  private Pedido pedido;

  public ProcessaPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  public void processar() {
    this.confirmarPagamento();
  }

  private void confirmarPagamento() {
    Date dataDeVencimento = this.pedido.getDataVencimentoReserva();
    Date dataDoPagamento = this.pedido.getDataPagamento();
    System.out.println(dataDeVencimento);
    System.out.println(dataDoPagamento);
    // boolean pagamentoOk = this.verficarDataDeVencimento(dataDeVencimento, dataDoPagamento);
    // System.out.println("Situação do pagamente: " + (pagamentoOk ? "Pagamento confirmado" : "Pagamento não confirmado"));
  }

  public Pedido getPedido() {
    return pedido;
  }

  public void verficarDataDeVencimento(Date dataDeVencimento, Date dataDoPagamento) {
    
  }
}
