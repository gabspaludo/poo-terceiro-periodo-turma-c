package ANDERSON_TESSARO.Lista06;

import java.util.Date;
import java.util.Vector;

public class ProcessaPedido {
    public void processar(Cliente cliente, Vector vendedor, Loja loja, Item[] itens) {
        Pedido pedido = new Pedido();
        pedido.cliente = cliente;
        pedido.vendedor = vendedor;
        pedido.loja = loja;
        pedido.itens = itens;
        pedido.dataCriacao = new Date();
        // Definir dataVencimentoReserva 3 dias após a criação do pedido
        // Confirmar o pagamento
        confirmarPagamento(pedido);
        // Outras operações necessárias
    }

    private void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        // Verificar se a data atual é anterior à data de vencimento da reserva
        if (dataAtual.before(pedido.dataVencimentoReserva)) {
            // Confirmar o pagamento
            pedido.dataPagamento = dataAtual;
            System.out.println("Pagamento confirmado.");
        } else {
            System.out.println("Erro: Reserva vencida.");
        }
    }
}
