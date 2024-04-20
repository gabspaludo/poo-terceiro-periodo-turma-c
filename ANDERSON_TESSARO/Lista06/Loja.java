package ANDERSON_TESSARO.Lista06;

import java.util.Vector;

public class Loja {
  String nome;
  String Social;
  Integer cnpj;
  String cidade;
  String bairo;
  String rua;
  @SuppressWarnings("rawtypes")
  Vector[] vendedor = new Vector[10];
  Cliente[] comprador = new Cliente[10];
  public Cliente[] cliete;
  public Cliente[] clientes;

  public void contarVendedores() {
    int cont = 0;

    for (int i = 0; i < vendedor.length; i++) {
      if (vendedor[i] != null) {
        cont++;
      }
    }

    System.out.println("quantidade de vendedor " + nome + ": " + cont);
  }

  public void contarClientes() {
    int cont = 0;

    for (int i = 0; i < comprador.length; i++) {
      if (comprador[i] != null) {
        cont++;
      }
    }

    System.out.println("quantidade de clientes: " + nome + ": " + cont);
  }

  public void apresentarse() {
    String msg = "opa bão nossa é loja ".concat(nome)
    .concat(",Social: ").concat(Social)
    .concat(", CNPJ: ").concat(cnpj.toString())
    .concat(", estasmo na cidade: ").concat(cidade)
    .concat(", bairo: ").concat(bairo)
    .concat(", rua: ").concat(rua);
    System.out.println(msg);
  }
}