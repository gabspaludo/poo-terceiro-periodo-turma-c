package CLARA_LIOTTO.Lista5;

import java.util.Date;

public class ProcessarPedido {
    public void processar(Pedido pedido) {
        if (confirmarPagamento(pedido)) {
            System.out.println("Pagamento confirmado e pedido processado.");
            // Adicione mais lógica conforme necessário
        } else {
            System.out.println("Não foi possível processar o pedido.");
        }
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date agora = new Date();
        if (pedido.getDataPagamento() == null && agora.before(pedido.getDataVencimentoReserva())) {
            pedido.setDataPagamento(agora); // Aqui você definiria o pagamento como confirmado
            return true;
        }
        return false;
    }
}
