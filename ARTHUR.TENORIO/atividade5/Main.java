package atividade7;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Myy Plant", "Myy Plant Ltda", "123456789", "São Paulo", "Centro", "Rua C");
        List<Item> itensCadastrados = new ArrayList<>();
        ProcessaPedido processador = new ProcessaPedido();

        itensCadastrados.add(new Item(1, "Planta A", "Planta", 50.0));
        itensCadastrados.add(new Item(2, "Planta B", "Planta", 70.0));

s
        System.out.println("Itens cadastrados:");
        for (Item item : itensCadastrados) {
            item.gerarDescricao();
        }

  
        Item itemSelecionado = itensCadastrados.get(0);

        Cliente cliente = new Cliente("Maria", 25, "São Paulo", "Centro", "Rua B");
        Vendedor vendedor = new Vendedor("João", 30, "Myy Plant", "São Paulo", "Centro", "Rua A", 2000.0);
        ArrayList<Item> itensPedido = new ArrayList<>();
        itensPedido.add(itemSelecionado);
        processador.processar(1, new Date(), cliente, vendedor, loja, itensPedido);
    }
}