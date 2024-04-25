package lista5;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProcessaPedido {
    
    public void processar(int idPedido, LocalDate dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, ArrayList<Item> itens) {
        
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);

        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(Pedido pedido) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataVencimentoReserva = pedido.getDataVencimentoReserva();

        if (dataAtual.isBefore(dataVencimentoReserva) || dataAtual.isEqual(dataVencimentoReserva)) {
            System.out.println("Pagamento confirmado. Reserva não está vencida.");
        } else {
            System.out.println("Pagamento não pode ser confirmado. Reserva está vencida.");
        }
    }


    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Maria", 25, "Cidade A", "Bairro A", "Rua A");
        Vendedor vendedor = new Vendedor("João", 30, "Loja A", "Cidade A", "Bairro A", "Rua A", 2000.0, new ArrayList<>());
        Loja loja = new Loja("Loja ABC", "ABC LTDA", "123456789", "Cidade B", "Bairro B", "Rua B");
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Produto A", "Tipo A", 100.0));
        itens.add(new Item(2, "Produto B", "Tipo B", 150.0));

        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(1, LocalDate.of(2024, 4, 15), cliente, vendedor, loja, itens);
    }
}
