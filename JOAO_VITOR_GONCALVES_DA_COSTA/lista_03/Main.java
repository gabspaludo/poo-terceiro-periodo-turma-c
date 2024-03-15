package lista_03;

import lista_03.classes.menu.Menu;
import lista_03.classes.menu_meses.MenuMeses;

// test
public class Main {
  public static void main(String[] args) {
    MenuMeses menusin = new MenuMeses();

    menusin.dias_do_mes(2);

    Menu menu = new Menu();
    menu.iniciarMenu();
  }
}