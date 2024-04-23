package lista07;

public class Loja {
  public String nome;
  public Endereco endereco;
  public String razaoSocial;
  private String cnpj;
  public Vendedor[] vendedores = new Vendedor[3];
  public Cliente[] clientes = new Cliente[3];

  public Loja(String nome, String razaoSocial, Endereco endereco, Vendedor[] vendedores, Cliente[] clientes) {
    this.nome = nome;
    this.razaoSocial = razaoSocial;
    this.endereco = endereco;
    this.vendedores = vendedores;
    this.clientes = clientes;
  }

  public void contarVendedores() {
    int cont = 0;

    for (int i = 0; i < vendedores.length; i++) {
      if (vendedores[i] != null) {
        cont++;
      }
    }

    System.out.println("Número de vendedores " + nome + ": " + cont);
  }

  public void contarClientes() {
    int cont = 0;

    for (int i = 0; i < clientes.length; i++) {
      if (clientes[i] != null) {
        cont++;
      }
    }

    System.out.println("Número de clientes: " + nome + ": " + cont);
  }

  public void apresentarse() {
    String msg = "Olá, somos a loja " + nome + ", Razão Social: " + razaoSocial + ", CNPJ: " + cnpj
        + ", Localizada na cidade: " + endereco.getCidade() + ", Bairro: " + endereco.getBairro() + ", Rua: " + endereco.getRua();
    System.out.println(msg);
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
}