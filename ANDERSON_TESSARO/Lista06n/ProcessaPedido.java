package Lista06n;

import java.sql.Date;
import java.util.Calendar;

public class ProcessaPedido {
    public void processar(Cliente cliente, Vendedor vendedor, String loja, Item[] itens) {
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setLoja(loja);
        pedido.setItens(itens);
        pedido.setDataCriacao(new Date(0));
        pedido.setDataVencimentoReserva(calcularDataVencimentoReserva());

        confirmarPagamento(pedido);
    }

    private Date calcularDataVencimentoReserva() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(0));
        calendar.add(Calendar.DAY_OF_MONTH, 3); // Adiciona 3 dias à data atual
        return (Date) calendar.getTime();
    }

    private void confirmarPagamento(Pedido pedido) {
        if (pedido.getDataVencimentoReserva().after(new Date(0))) {
            System.out.println("Pagamento confirmado!");
        } else {
            System.out.println("Reserva vencida. Pagamento não confirmado.");
        }
    }
}
