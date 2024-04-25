package KAUE_ORLANDINI.Lista2;

import java.util.Date;
import java.util.Scanner;

public class ProcessaPedido extends Pedido {

    Date dataAtual = new Date();

    

    
    public ProcessaPedido(double[] itens, String id, String nome, Date dataCriacao, Date dataPagamento,
            Date dataVencimentoReserva, String cliente, String loja, double valor, String vendedor, Date dataAtual) {
        super(itens, id, nome, dataCriacao, dataPagamento, dataVencimentoReserva, cliente, loja, valor, vendedor);
        this.dataAtual = dataAtual;
    }
    void processar() {
        System.out.print("valor: " + String.valueOf(getValor()) + ", data de criacao: " + String.valueOf(getDataCriacao()) + ", item: " + String.valueOf(getNome()) + ", cliente: " + String.valueOf(getCliente()));
    }
    private void confirmarPagamento() {
        if (getDataVencimentoReserva().before(dataAtual)) {
            System.out.println("Reserva vencida");
        } else {
            System.out.println("pagamento aprovado");
        }
    }
    public Date getDataAtual() {
        return dataAtual;
    }

    
}