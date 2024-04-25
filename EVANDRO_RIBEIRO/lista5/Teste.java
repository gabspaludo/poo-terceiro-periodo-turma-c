package lista5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
    
        ArrayList<Double> salarioRecebidoVendedor = new ArrayList<>();
        salarioRecebidoVendedor.add(1500.0);
        salarioRecebidoVendedor.add(1700.0);
        salarioRecebidoVendedor.add(1600.0);
        Vendedor vendedor = new Vendedor("João", 30, "Loja A", "Cidade A", "Bairro A", "Rua A", 2000.0, salarioRecebidoVendedor);

        System.out.println("Vendedor:");
        vendedor.apresentarSe();
        System.out.println("Média dos salários recebidos: " + vendedor.calcularMedia());
        System.out.println("Bônus: " + vendedor.calcularBonus());

        Cliente cliente = new Cliente("Maria", 25, "Cidade B", "Bairro B", "Rua B");

        System.out.println("\nCliente:");
        cliente.apresentarSe();

        ArrayList<Vendedor> vendedoresLoja = new ArrayList<>();
        vendedoresLoja.add(vendedor);
        ArrayList<Cliente> clientesLoja = new ArrayList<>();
        clientesLoja.add(cliente);
        Loja loja = new Loja("Loja ABC", "ABC LTDA", "123456789", "Cidade C", "Bairro C", "Rua C");
        loja.setVendedores(vendedoresLoja);
        loja.setClientes(clientesLoja);

        System.out.println("\nLoja:");
        loja.apresentarSe();
        System.out.println("Quantidade de clientes: " + loja.contarClientes());
        System.out.println("Quantidade de vendedores: " + loja.contarVendedores());

        ProcessaPedido processador = new ProcessaPedido();
        criarPedidoFake(processador);
    }

    private static void criarPedidoFake(ProcessaPedido processador) {
    
        Cliente cliente = new Cliente("Maria", 25, "Cidade A", "Bairro A", "Rua A");
        Vendedor vendedor = new Vendedor("João", 30, "Loja A", "Cidade A", "Bairro A", "Rua A", 2000.0, new ArrayList<>());
        Loja loja = new Loja("Loja ABC", "ABC LTDA", "123456789", "Cidade B", "Bairro B", "Rua B");
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Produto A", "Tipo A", 100.0));
        itens.add(new Item(2, "Produto B", "Tipo B", 150.0));

        processador.processar(1, LocalDate.of(2024, 4, 15), cliente, vendedor, loja, itens);
    }
}
