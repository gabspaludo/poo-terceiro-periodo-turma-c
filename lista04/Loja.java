package lista04;

public class Loja {
  String nome;
  String Social;
  Integer cnpj;
  String cidade;
  String bairo;
  String rua;
  Vendedor[] vendedores = new Vendedor[10];
  Cliente[] clientes = new Cliente[10];

  public void contarVendedores() {
    int cont = 0;

    for (int i = 0; i < vendedores.length; i++) {
      if (vendedores[i] != null) {
        cont++;
      }
    }

    System.out.println("quantidade de vendedores " + nome + ": " + cont);
  }

  public void contarClientes() {
    int cont = 0;

    for (int i = 0; i < clientes.length; i++) {
      if (clientes[i] != null) {
        cont++;
      }
    }

    System.out.println("quantidade de clientes: " + nome + ": " + cont);
  }

  public void apresentarse() {
    String msg = "opa temos a loja ".concat(nome)
    .concat(",social: ").concat(Social)
    .concat(", CNPJ: ").concat(cnpj.toString())
    .concat(", fica na cidade: ").concat(cidade)
    .concat(", bairo: ").concat(bairo)
    .concat(", rua: ").concat(rua);
    System.out.println(msg);
  }
}