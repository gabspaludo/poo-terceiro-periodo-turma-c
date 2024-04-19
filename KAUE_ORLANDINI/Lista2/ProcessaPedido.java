package KAUE_ORLANDINI.Lista2;

import java.util.Date;

public class ProcessaPedido extends Pedido {

    Date dataAtual = new Date();

    void processar() {
        System.out.print("valor: " + String.valueOf(valor) + ", data de criacao: " + String.valueOf(dataCriacao) + ", item: " + String.valueOf(nome) + ", cliente: " + String.valueOf(cliente));
    }
    private void confirmarPagamento() {
        if (dataVencimentoReserva.before(dataAtual)) {
            System.out.println("Reserva vencida");
        } else {
            System.out.println("pagamento aprovado");
        }
    }

}