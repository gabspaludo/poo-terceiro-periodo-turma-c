package lista_03.classes.menu_meses;

import lista_03.classes.produto.Produto;

public class MenuMeses {

  public String nome_do_mes;
  public int dias_do_mes;
  public Produto produtos_vendidos[];

  public void dias_do_mes(int numeroDoMes) {
    switch (numeroDoMes) {
      case 1:
        this.nome_do_mes = "Janeiro";
        this.dias_do_mes = 31;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 2:
        this.nome_do_mes = "Fevereito";
        this.dias_do_mes = 28;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 3:
        this.nome_do_mes = "Março";
        this.dias_do_mes = 31;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 4:
        this.nome_do_mes = "Abril";
        this.dias_do_mes = 30;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 5:
        this.nome_do_mes = "Maio";
        this.dias_do_mes = 31;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 6:
        this.nome_do_mes = "Junho";
        this.dias_do_mes = 30;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 7:
        this.nome_do_mes = "Julho";
        this.dias_do_mes = 31;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 8:
        this.nome_do_mes = "Agosto";
        this.dias_do_mes = 31;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 9:
        this.nome_do_mes = "Setembro";
        this.dias_do_mes = 30;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 10:
        this.nome_do_mes = "Outubro";
        this.dias_do_mes = 31;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 11:
        this.nome_do_mes = "Novembro";
        this.dias_do_mes = 30;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      case 12:
        this.nome_do_mes = "Dezembro";
        this.dias_do_mes = 31;
        produtos_vendidos = new Produto[dias_do_mes];
        break;
      default:
        System.out.println("Mes não encontrado");
        break;
    }

    for (int i = 0; i < dias_do_mes; i++) {
      System.out.println(produtos_vendidos[i]);

    }

  }

}