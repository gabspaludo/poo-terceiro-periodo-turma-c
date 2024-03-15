package lista_03.classes.main_menu;

import java.util.Scanner;

import lista_03.classes.calculadora.Calculadora;
import lista_03.classes.menu_meses.MenuMeses;
// import lista_03.classes.menu_meses.MenuMeses;
import lista_03.classes.produto.Produto;

public class MainMenu {

  public int user_action;

  public int mes_index;
  public int index_do_dia;
  public int index_do_produto;
  public Produto produtos_vendidos[][][] = new Produto[12][31][15];
  public boolean meses_com_vendas[] = new boolean[12];
  public boolean dias_com_venda[][] = new boolean[12][31];
  // public boolean produtos_prenchidos[][][] = new boolean[12][31][15];
  Scanner ler_dados = new Scanner(System.in);

  // tentar trabalhra com um array 3 dimensional
  public void iniciarMenu() {
    // Calculadora calc = new Calculadora();

    do {
      System.out.println("--- Escolha uma opção --- ");
      System.out.println("1 - Registrar vendas do mês");
      System.out.println("2 - Ver registros de venda");
      System.out.println("3 - Calcular troco do cliente");
      System.out.println("4 - Sair");

      this.user_action = ler_dados.nextInt();
      ler_dados.nextLine();

      switch (this.user_action) {
        case 1:
          System.out.println("--- Digite o número do mês --- ");
          System.out.println("Janeiro -> 1");
          System.out.println("Fevereiro -> 2");
          System.out.println("...Dezembro -> 12");
          this.menuAdiconarProdutosPorMesDia(ler_dados.nextInt());
          break;
        case 2:
          this.mostrarDadosSalvos();
          break;
        case 3:

          break;
        case 4:
          System.out.println("Fechando programa ...");
          break;
        default:
          System.out.println("Opção inválida!!!");
          break;

      }
    } while (this.user_action != 4);
    ler_dados.close();
  }

  public void menuAdiconarProdutosPorMesDia(int mes_atual) {
    if (mes_atual < 1 || mes_atual > 12) {
      System.out.println("Mês não reconhecido, tente novamente");
      return;
    }

    int escolhaParaMesAtual;
    this.mes_index = --mes_atual;
    this.index_do_dia = 0;
    this.index_do_produto = 0;

    do {
      System.out.println("-----------");
      System.out.println("Mês de " + MenuMeses.nomeDoMes(this.mes_index + 1));
      System.out.println("1 - Adicionar produtos para o dia " + (this.index_do_dia + 1) + ". É possível adicionar mais "
          + (15 - index_do_produto) + " produtos no dia de hoje!");
      System.out.println("2 - Avançar para o dia " + (this.index_do_dia + 2));
      System.out.println("3 - Avançar para o próximo mês ");
      System.out.println("4 - Finalizar Vendas ");
      System.out.println("-----------");
      escolhaParaMesAtual = ler_dados.nextInt();
      ler_dados.nextLine();

      switch (escolhaParaMesAtual) {
        case 1:
          this.pegarDadosDoProduto();
          break;
        case 2:
          this.index_do_dia += 1;
          this.index_do_produto = 0;
          break;
        case 3:
          this.mes_index += 1;
          this.index_do_dia = 0;
          this.index_do_produto = 0;
          break;
        default:
          break;
      }
    } while (escolhaParaMesAtual != 4);
  }

  public void pegarDadosDoProduto() {
    Calculadora calc = new Calculadora();
    Produto venda_atual = new Produto();

    System.out.println("Nome do produto");
    venda_atual.setNome(ler_dados.nextLine());

    System.out.println("Quantidade vendida");
    venda_atual.setQuantidadeVendida(ler_dados.nextInt());

    System.out.println("Qual o valor unitário dos produtos? !(escreva no formato n,n caso seja decimal)!");
    venda_atual.setPrecoDaVenda(calc.setPrecoDaVenda(venda_atual.quantidade_vendida, ler_dados.nextDouble()));

    venda_atual.setValorDoDesconto(calc.desconto_em_reais);

    System.out.println("Valor da compra: " + String.format(" %.2f", venda_atual.preco_da_venda));
    System.out.println("Digite o valor pago pelo cliente para calcular o troco e salvar os dados");
    calc.setTrocoDoCliente(ler_dados.nextDouble());

    if (calc.troco_do_cliente < 0) {
      System.out.println("Está faltando R$" + String.format(" %.2f", calc.troco_do_cliente * -1));
      venda_atual.setValorEmFalta(calc.troco_do_cliente * -1);
    } else if (calc.troco_do_cliente > 0) {
      System.out.println("Devolva R$" + String.format(" %.2f", calc.troco_do_cliente));
      venda_atual.setValorDoTroco(calc.troco_do_cliente);
    } else {
      System.out.println("Não precisa de troco");
      venda_atual.setValorDoTroco(0.0);
    }

    this.produtos_vendidos[this.mes_index][this.index_do_dia][this.index_do_produto] = venda_atual;
    this.meses_com_vendas[mes_index] = true;
    this.dias_com_venda[this.mes_index][this.index_do_dia] = true;
    this.index_do_produto++;
  }

  public void mostrarDadosSalvos() {
    System.out.println("");
    System.out.println("Histórico de produtos");
    System.out.println("");
    for (int mes = 0; mes < 12; mes++) { // for para passar pelos meses
      if (this.meses_com_vendas[mes] == false) {
        System.out.println("Nada salvo no mês de " + MenuMeses.nomeDoMes(mes + 1));
        System.out.println(" ------------- ");
        continue;
      }
      System.out.println("Produtos salvos no mês de " + MenuMeses.nomeDoMes(mes + 1));
      for (int dia = 0; dia < 31; dia++) { // for para passar pelos dias do mês
        if (this.dias_com_venda[mes][dia] == false) {
          continue;
        }
        System.out.println("Produtos dia " + (dia + 1));
        for (int produto = 0; produto < 15; produto++) { // for para passar pelos produtos do dia
          if (produtos_vendidos[mes][dia][produto] == null) {
            continue;
          }
          System.out.println("Produto " + (produto + 1) + ":");
          System.out.println(produtos_vendidos[mes][dia][produto].toString());
        }
      }
    }
  }
}
