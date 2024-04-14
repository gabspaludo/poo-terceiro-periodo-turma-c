package lista_05.classes.processa_pedido;

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
    String dataDeVencimento = this.pedido.getDataVencimentoReserva();
    String dataDoPagamento = this.pedido.getDataPagamento();
    boolean pagamentoOk = this.verficarDataDeVencimento(dataDeVencimento, dataDoPagamento);
    System.out.println("Situação do pagamente: " + (pagamentoOk ? "Pagamento confirmado" : "Pagamento não confirmado"));
  }

  public Pedido getPedido() {
    return pedido;
  }

  public boolean verficarDataDeVencimento(String dataDeVencimento, String dataDoPagamento) {
    int diaDeVencimento = Integer.parseInt(dataDeVencimento.split("/")[0]);
    int mesDeVencimento = Integer.parseInt(dataDeVencimento.split("/")[1]);
    int diaDoPagamento = Integer.parseInt(dataDoPagamento.split("/")[0]);
    int mesDoPagamento = Integer.parseInt(dataDoPagamento.split("/")[1]);

    if ((mesDoPagamento - mesDeVencimento) > 1 && diaDoPagamento > 3) {
      return false;
    } else if (mesDoPagamento == mesDeVencimento && diaDoPagamento > diaDeVencimento) {
      return false;
    } else if (mesDoPagamento == mesDeVencimento && (diaDoPagamento - diaDeVencimento) < 3) {
      return true;
    } else {
      System.out.println("caiu no ss");
      switch (mesDeVencimento) {
        case 1:
          return diaDeVencimento - diaDoPagamento > 28 ? true : false;
        case 2:
          return diaDeVencimento - diaDoPagamento > 25 ? true : false;
        case 3:
          return diaDeVencimento - diaDoPagamento > 28 ? true : false;
        case 4:
          return diaDeVencimento - diaDoPagamento > 27 ? true : false;
        case 5:
          return diaDeVencimento - diaDoPagamento > 28 ? true : false;
        case 6:
          return diaDeVencimento - diaDoPagamento > 27 ? true : false;
        case 7:
          return diaDeVencimento - diaDoPagamento > 28 ? true : false;
        case 8:
          return diaDeVencimento - diaDoPagamento > 28 ? true : false;
        case 9:
          return diaDeVencimento - diaDoPagamento > 27 ? true : false;
        case 10:
          return diaDeVencimento - diaDoPagamento > 28 ? true : false;
        case 11:
          return diaDeVencimento - diaDoPagamento > 27 ? true : false;
        case 12:
          return diaDeVencimento - diaDoPagamento > 28 ? true : false;
        default:
          System.out.println("Mês não encontrado");
          return false;
      }
    }
  }
}
