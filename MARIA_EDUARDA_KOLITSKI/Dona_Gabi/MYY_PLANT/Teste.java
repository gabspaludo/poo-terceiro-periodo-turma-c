package Dona_Gabi.MYY_PLANT;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("PR", "Cascavel", "Neva", "Rua Marechal Floriano", 1748, "casa");

        Cliente cliente = new Cliente("Maria", 18, endereco);

        Vendedor vendedor = new Vendedor("Célia", 28, endereco);

        Loja loja = new Loja();
        loja.setCnpj("2343243243");
        loja.setNomeFantasia("Nubank");
        loja.setRazaoSocial("NU Pagamentos S.A");
        loja.setClientes(new Cliente[]{cliente});
        loja.setVendedores(new Vendedor[]{vendedor});

        Item item1 = new Item(1, "Samambaia", "Planta", 25d);
        Item item2 = new Item(2, "Espada de São Jorge", "Planta", 25d);
        Item[] items = new Item[]{item1, item2};

        ProcessaPedido processaPedido = new ProcessaPedido();
        Pedido pedido = processaPedido.processaPedido(cliente, items);
        processaPedido.confirmarPagamento(pedido);

        System.out.println("==== informações do pedido ====");
        System.out.println("Valor Total do Pedido: " + pedido.calcularValorTotal());
        System.out.println("Data de Vencimento da Reserva: " + pedido.getDataVencimentoReserva());
        System.out.println("Data de Pagamento: " + pedido.getDataPagamento());
        System.out.println();

        System.out.println("==== informações do Cliente ====");
        cliente.apresentarSe();
        System.out.print("Endereço: ");
        endereco.apresentarLogradouro();
        System.out.println();

        System.out.println("==== informações do Vendedor ====");
        vendedor.apresentarSe();
        System.out.print("Endereço: ");
        endereco.apresentarLogradouro();
        System.out.println();

        System.out.println("==== informações da Loja ====");
        System.out.println("Nome Fantasia: " + loja.getNomeFantasia());
        System.out.println("Razão Social: " + loja.getRazaoSocial());
        System.out.println("CNPJ: " + loja.getCnpj());
    }
}