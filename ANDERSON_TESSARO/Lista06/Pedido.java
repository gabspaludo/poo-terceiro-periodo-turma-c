package ANDERSON_TESSARO.Lista06;

import java.util.Date;
import java.util.Vector;

public class Pedido {
    Integer id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    Cliente cliente;
    @SuppressWarnings("rawtypes")
    Vector vendedor;
    Loja loja;
    Item[] itens;

    public float calcularValorTotal() {
        float total = 0;
        for (Item item : Item) {
            total += item.valor;
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Pedido criado em: " + dataCriacao + ", Valor total: R$ " + calcularValorTotal());
    }
}
