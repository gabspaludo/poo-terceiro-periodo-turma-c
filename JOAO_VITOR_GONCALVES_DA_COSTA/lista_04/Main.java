package lista_04;

import lista_04.classes.cliente.Cliente;
import lista_04.classes.vendedor.Vendedor;

public class Main {
  public static void main(String[] args) {
    Cliente cliente_01 = new Cliente("Marcos", "Country", "Cascavel", "Guido Viaro 210", 6);
    Vendedor vendedor_01 = new Vendedor("Marcos", "Country", "Cascavel", "Guido Viaro 210", 6);
    cliente_01.amar();
    vendedor_01.amar();
  }

}
