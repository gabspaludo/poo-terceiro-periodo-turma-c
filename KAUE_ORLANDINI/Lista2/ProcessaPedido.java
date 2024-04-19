package KAUE_ORLANDINI.Lista2;

public class ProcessaPedido extends Pedido {

    double dataAtual;

    void processar() {
        System.out.println("valor: ".concat(valor).concat(", data de criacao: ").concat(dataCriacao).concat(", item: ").concat(nome).concat(", cliente: ").concat(cliente));
    }
    private void confirmarPagamento() {
        if (dataVencimentoReserva <= dataAtual  ) {
            System.out.println("Reserva vencida");
        } else {
            System.out.println("pagamento aprovado");
        }
    }

}