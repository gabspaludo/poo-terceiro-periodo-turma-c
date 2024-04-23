package lista07;

import java.util.Date;
import java.util.Scanner;

public class Main {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    // Lista 05
    Float[] salarioRecebido = { 1000.0f, 1500.0f, 2000.0f };
    Endereco enderecoVendedor = new Endereco("Paraná", "Cascavel", "Centro", "AV. Brasil", 102, null);
    Vendedor vendedorA = new Vendedor("Carlos", 25, enderecoVendedor, salarioRecebido);
    Endereco enderecoCliente = new Endereco("Paraná", "Cascavel", "Centro", "AV. Brasil", 1000, null);
    Cliente clienteA = new Cliente("Alberto", 30, enderecoCliente);
    Loja lojaA = new Loja("Preço Bom", "Preço Bom LTDA", enderecoVendedor, new Vendedor[] { vendedorA }, new Cliente[] { clienteA });

    System.out.println("\n--- Vendendor ---");
    vendedorA.setLoja(lojaA);
    vendedorA.setSalarioBase(1150.0f);
    vendedorA.apresentarse();
    vendedorA.calcularMedia();
    vendedorA.calcularBonus();

    System.out.println("\n--- Cliente ---");
    clienteA.apresentarse();

    System.out.println("\n--- Loja ---");
    lojaA.setCnpj("29.507.266/0001-07");
    lojaA.apresentarse();
    lojaA.contarVendedores();
    lojaA.contarClientes();

    // Lista 06
    Endereco enderecoGerente = new Endereco("Paraná", "Cascavel", "Centro", "AV. Brasil", 1200, "Sobrado");

    Item itemA = new Item(0, "Logitech G PRO", "Mouse", 600.0f);
    Pedido pedidoA = new Pedido();
    Scanner scEmpresaParceira = new Scanner(System.in);

    System.out.println("\n--- Gerente ---");
    Gerente gerenteA = new Gerente("Marcos", 40, lojaA, enderecoGerente, new Float[] { 2200.0f, 2400.0f, 2600.0f });
    gerenteA.setSalarioBase(2200.0f);
    gerenteA.apresentarse();
    gerenteA.calcularMedia();
    gerenteA.calcularBonus();

    System.out.println("\n--- Endereço ---");
    enderecoGerente.apresentarLogradouro();

    System.out.println("\n--- Item ---");
    itemA.gerarDescricao();

    System.out.println("\n--- Pedido ---");
    Date dataAtual = new Date();
    Date dataDaquiTresDias = new Date(dataAtual.getTime() + (1000 * 60 * 60 * 24 * 3));
    pedidoA.setId(0);
    pedidoA.setDataCriacao(dataAtual);
    pedidoA.setDataPagamento(dataAtual);
    pedidoA.setDataVencimento(dataDaquiTresDias);
    pedidoA.setCliente(clienteA);
    pedidoA.setVendedor(vendedorA);
    pedidoA.setLoja(lojaA);
    pedidoA.calcularValorTotal();

    System.out.print("Digite o nome da empresa parceira: ");
    String res = scEmpresaParceira.nextLine();
    pedidoA.setEmpresaParceira(res);
    pedidoA.gerarDescricaoVenda();

    System.out.println("\n--- Processa Pedido ---");
    ProcessaPedido processaPedido = new ProcessaPedido();
    processaPedido.processar(pedidoA);
    processaPedido.testarMetodo(pedidoA);

    System.out.println("\n--- Exibir Menu ---");
    int opcao;
    
    while (true) {
      showMenu();
  
      System.out.print("Digite uma opção: ");
      opcao = new Scanner(System.in).nextInt();
  
      if (opcao == 4) {
        System.out.println("Saindo do Menu...");
        break;
      }
  
      switch (opcao) {
        case 1:
          processaPedido.venda(pedidoA);
          break;
        case 2:
          pedidoA.gerarDescricaoItens();
          break;
        case 3:
          processaPedido.finalizarPedido(pedidoA);
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    }
  }

  public static void showMenu() {
    System.out.println("|-----------------------------|");
    System.out.println("|   1 - Cadastrar novo Item   |");
    System.out.println("|   2 - Exibir Itens          |");
    System.out.println("|   3 - Finalizar Pedido      |");
    System.out.println("|   4 - Sair                  |");
    System.out.println("|-----------------------------|");
  }
}
