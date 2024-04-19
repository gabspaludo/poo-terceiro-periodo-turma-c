import java.util.Date;

public class ProcessaPedido {

    private Integer sequence = 0;

    public void  processaPedido() {
        Pedido pedido = new Pedido();

    }

    public void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();

        if (dataAtual.getTime() < pedido.getDataVencimentoReserva().getTime()) {
            System.out.println("A data de vencimento de sua reserva ainda não expirou.");

        }else{
            System.out.println("A data de vencimento de sua reserva expirou.");
        }
    }
}
