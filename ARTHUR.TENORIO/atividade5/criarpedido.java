package atividade5;

import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar dados falsos para pedido
        Cliente cliente = new Cliente("Maria", 25, "São Paulo", "Centro", "Rua B");
        Vendedor vendedor = new Vendedor("João", 30, "Myy Plant", "São Paulo", "Centro", "Rua A", 2000.0, new ArrayList<>());
        Loja loja = new Loja("Myy Plant", "Myy Plant Ltda", "123456789", "São Paulo", "Centro", "Rua C", new ArrayList<>(), new ArrayList<>());
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Produto A", "Tipo A", 100.0));
        itens.add(new Item(2, "Produto B", "Tipo B", 150.0));
        
        // Criar e processar pedido
        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(1, new Date(), cliente, vendedor, loja, itens);
    }
}
