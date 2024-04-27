package listas.listaseis;

import java.time.LocalDate;
import java.util.List;

/*Criar uma classe Pedido com:
- Atributos, id, dataCriacao, dataPagamento, dataVencimentoReserva(a reserva vence depois de 3 dias da criação do pedido), cliente, vendedor, Loja e array de itens.
- Método calcularValorTotal, retorna o valor total do pedido.
- Método gerarDescricaoVenda, retorna o print informando a data de criação do pedido e seu valor total. */

public class Pedido {
    long id;

    LocalDate dataCriacao;

    LocalDate dataPagamento;

    LocalDate dataVencimentoReserva;

    String cliente;

    String vendedor;

    Loja lojinha;

    List <Item> itens;



    

    public Pedido(long id, LocalDate dataCriacao, LocalDate dataPagamento, String cliente, String vendedor, Loja lojinha) {
        this.id = id;
        this.dataCriacao
        this.tipo = tipo;
        this.valor = valor;
    }




}
