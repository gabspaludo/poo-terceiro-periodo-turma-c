import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Myy Plant", "Myy Plant Ltda", "123456789", "São Paulo", "Centro", "Rua C");
        List<Item> itensCadastrados = new ArrayList<>();
        ProcessaPedido processador = new ProcessaPedido();

        // Cadastro de itens
        itensCadastrados.add(new Item(1, "Planta A", "Planta", 50.0));
        itensCadastrados.add(new Item(2, "Planta B", "Planta", 70.0));

        // Listagem de itens
        System.out.println("Itens cadastrados:");
        for (Item item : itensCadastrados) {
            item.gerarDescricao();
        }

        // Cliente seleciona item desejado
        Item itemSelecionado = itensCadastrados.get(0); // Supondo que o cliente selecionou o primeiro item

        // Cliente cria pedido
        Cliente cliente = new Cliente("Maria", 25, "São Paulo", "Centro", "Rua B");
        Vendedor vendedor = new Vendedor("João", 30, "Myy Plant", "São Paulo", "Centro", "Rua A", 2000.0);
        ArrayList<Item> itensPedido = new ArrayList<>();
        itensPedido.add(itemSelecionado);
        processador.processar(1, new Date(), cliente, vendedor, loja, itensPedido);
    }
}
