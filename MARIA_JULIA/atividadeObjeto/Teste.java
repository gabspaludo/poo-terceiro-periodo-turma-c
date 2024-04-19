package atividadeObjeto;

import java.text.ParseException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws ParseException {
        // Criar objetos de teste
        Loja loja = new Loja("PR", "Cascavel", "Centro", "789", "Avenida Principal", "Loja A", "Loja A Ltda",
                "123456789");
        Cliente cliente = new Cliente("PR", "Cascavel", "Maria Luiza", "123", "Rua ABC", "João", 30);
        Vendedor vendedor = new Vendedor("PR", "Cascavel", "Centro", "456", "Rua XYZ", "Maria", 25,loja.nomeFantasia);

        Gerente gerente = new Gerente("PR", "Cascavel", "Brasília", "909", "Rua Vermelha", "André", 45,loja.nomeFantasia);

        loja.adicionarCliente(cliente.nome);
        loja.adicionarVendedor(vendedor.nome);

        Item item1 = new Item("I001", "Produto A", "Produto", 50);
        Item item2 = new Item("I002", "Produto B", "Produto", 30);

        Pedido pedido1 = new Pedido("PED123", "01/12/2020", "10/01/2021", "10/06/2021", cliente.nome,
        vendedor.nome, loja.nomeFantasia);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        ProcessaPedido processador = new ProcessaPedido();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Ver pedido");
            System.out.println("2. Ver clientes");
            System.out.println("3. Ver vendedorres");
            System.out.println("4. Ver gerentes");
            System.out.println("5. Ver loja");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("----- Pedido -----");
                    processador.processar("PED123", "01/12/2020", "10/01/2021", "10/06/2021", cliente.nome,
                            vendedor.nome, loja.nomeFantasia, pedido1.returnItems());
                    break;
                case 2:
                    System.out.println("----- cliente -----");
                    cliente.apresentarse();
                    cliente.apresentarLogradouro();
                    break;
                case 3:
                    System.out.println("----- vendedor -----");
                    vendedor.apresentarse();
                    vendedor.apresentarLogradouro();
                    vendedor.calcularMedia();
                    vendedor.calcularBonus();
                    break;
                case 4:
                    System.out.println("----- gerente -----");
                    gerente.apresentarse();
                    gerente.calcularMedia();
                    gerente.calcularBonus();
                    break;
                case 5:
                    System.out.println("----- loja -----");
                    loja.apresentarse();
                    loja.apresentarLogradouro();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

}
