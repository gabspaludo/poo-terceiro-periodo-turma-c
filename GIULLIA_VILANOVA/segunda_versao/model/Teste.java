package segunda_versao.model;

public class Teste {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        cliente.setNome("Giullia");
        cliente.setIdade(19);
        cliente.setEndereco(new Endereco());

        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Fulano");
        vendedor.setIdade(27);
        vendedor.setEndereco(new Endereco());

        Loja loja = new Loja();
        
        loja.setCnpj(000000000);
        loja.setNomeFantasia("Nome Fantasia");
        loja.setRazaoSocial("Razão Social");

        loja.setClientes(new Cliente[] { cliente });
        loja.setVendedores(new Vendedor[] { vendedor });

        Item item1 = new Item();

        item1.setId(1);
        item1.setNome("Item 01");
        item1.setValor(30);

        Item item2 = new Item();

        item2.setId(1);
        item2.setNome("Item 02");
        item2.setValor(20);

        Item[] itens = new Item[] { item1, item2 };

        ProcessaPedido processaPedido = new ProcessaPedido();

        Pedido pedido = processaPedido.processar(cliente, itens);
    
        processaPedido.confirmarPagamento(pedido);

        System.out.println(pedido.calcularValorTotal());
        System.out.println(pedido.getDataVencimentoReserva());
        System.out.println(pedido.getDataPagamento());
    }
    
}