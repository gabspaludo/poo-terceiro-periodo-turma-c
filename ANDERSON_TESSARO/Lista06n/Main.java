package Lista06n;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("João");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Maria");

        Item item1 = new Item();
        item1.setId(1);
        item1.setNome("Camiseta");
        item1.setTipo("Vestuário");
        item1.setValor(25.50);

        Item item2 = new Item();
        item2.setId(2);
        item2.setNome("Calça Jeans");
        item2.setTipo("Vestuário");
        item2.setValor(50.75);

        Item[] itens = {item1, item2};

        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(cliente, vendedor, "Loja A", itens);
    }
}

