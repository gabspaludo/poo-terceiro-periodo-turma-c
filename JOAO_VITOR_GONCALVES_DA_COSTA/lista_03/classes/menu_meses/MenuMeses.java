package lista_03.classes.menu_meses;

public class MenuMeses {
  public static String nomeDoMes(int numeroDoMes) {
    switch (numeroDoMes) {
      case 1:
        return "Janeiro"; // 31
      case 2:
        return "Fevereito"; // 28
      case 3:
        return "Março"; // 31
      case 4:
        return "Abril"; // 30
      case 5:
        return "Maio"; // 31
      case 6:
        return "Junho"; // 30
      case 7:
        return "Julho"; // 31
      case 8:
        return "Agosto"; // 31
      case 9:
        return "Setembro"; // 30
      case 10:
        return "Outubro"; // 31
      case 11:
        return "Novembro"; // 30
      case 12:
        return "Dezembro"; // 31
      default:
        System.out.println("Mes não encontrado");
        return "Nenhum mês encontrado"; //
    }
  }

  public int selecionarMes(int number) {
    return --number;
  }
}

// Produto produto_vendido = new Produto();
// System.out.println("Qual o nome do produto?");
// this.nome_do_produto = ler_dados.nextLine();

// System.out.println("Quantos produtos foram vendidos?");
// this.quantidade_vendida = ler_dados.nextInt();
// ler_dados.nextLine();

// System.out.println("Qual o valor dos produtos? !(escreva no formato n,n caso
// seja decimal)!");

// this.preco_do_produto = ler_dados.nextDouble();
// ler_dados.nextLine();
// calc.setPrecoDaVenda(this.quantidade_vendida, this.preco_do_produto);

// produto_vendido.setValues(this.nome_do_produto, this.quantidade_vendida,
// calc.preco_da_venda, calc.desconto_em_reais);

// this.vetor_index++;
// System.out.println("Apenas mais " + (20 - this.vetor_index) + " produtos
// podem ser adicionados ao histórico");