package atividadeObjeto;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

// 6. Criar uma classe ProcessaPedido com:
// - Método processar, que recebe os dados necessários para criação do pedido.
// - Método privado confirmarPagamento(confirma caso a reserva não esteja vencida, verificar se data atual não é superior a dataVencimentoReserva).
// - Criar teste para verificar método.


public class ProcessaPedido {

    public void processar(String idPedido, String dataCriacao, String dataPagamento, String dataVencimentoReserva, String cliente, String vendedor, String loja, ArrayList<Item> itens) throws ParseException{
        Pedido pedido = new Pedido(idPedido, dataCriacao, dataPagamento, dataVencimentoReserva, cliente, vendedor, loja);

    
        pedido.gerarDescricaoVenda();

        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (dataAtual.getTime() >= pedido.dataVencimentoReserva.getTime()) {
            System.out.println("Confirmado");
        } else {
            System.out.println("Recusado");
        }
    }
}
