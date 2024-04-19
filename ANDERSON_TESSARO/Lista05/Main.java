package ANDERSON_TESSARO.Lista05;

public class Main {
  public static void main(String[] args) {
    Loja lojaA = new Loja();
    Loja lojaB = new Loja();

    Vendedor vendedorA = new Vendedor();
    Vendedor vendedorB = new Vendedor();

    Cliente clienteA = new Cliente();
    Cliente clienteB = new Cliente();

    // Vendedores
    vendedorA.nome = "Vendedor A";
    vendedorA.idade = 96;
    vendedorA.loja = lojaA;
    vendedorA.cidade = "Cidade A";
    vendedorA.bairo = "Bairro A";
    vendedorA.rua = "Rua A";
    vendedorA.salarioBase = 1150.0f;
    vendedorA.salarioRecebido[0] = 1200.0f;
    vendedorA.salarioRecebido[1] = 1350.0f;
    vendedorA.salarioRecebido[2] = 1450.0f;

    vendedorB.nome = "Vendedor B";
    vendedorB.idade = 76;
    vendedorB.loja = lojaB;
    vendedorB.cidade = "Cidade B";
    vendedorB.bairo = "Bairro B";
    vendedorB.rua = "Rua B";
    vendedorB.salarioBase = 1450.0f;
    vendedorB.salarioRecebido[0] = 1500.0f;
    vendedorB.salarioRecebido[1] = 1700.0f;
    vendedorB.salarioRecebido[2] = 1850.0f;

    // Clientes
    clienteA.nome = "clinte A";
    clienteA.idade = 58;
    clienteA.cidade = "cidade A";
    clienteA.bairro = "bairo A";
    clienteA.rua = "rua A";

    clienteB.nome = "clinte B";
    clienteB.idade = 35;
    clienteB.cidade = "cidade B";
    clienteB.bairro = "bairo B";
    clienteB.rua = "rua B";

    // Lojas
    lojaA.nome = "loja A";
    lojaA.Social = "loja A LTDS";
    lojaA.cnpj = 10203040;
    lojaA.cidade = "cidade A";
    lojaA.bairo = "bairo A";
    lojaA.rua = "rua A";
    lojaA.vendedor[0] = vendedorA;    
    lojaA.clientes[0] = clienteA;

    lojaB.nome = "loja B";
    lojaB.Social = "loja B LTDS";
    lojaB.cnpj = 235689784;
    lojaB.cidade = "cidade B";
    lojaB.bairo = "bairo B";
    lojaB.rua = "rua B";
    lojaB.vendedor[0] = vendedorB;
    lojaB.clientes[0] = clienteB;

    // Métodos
    lojaA.apresentarse();
    lojaB.apresentarse();

    vendedorA.apresentarse();
    vendedorB.apresentarse();

    clienteA.apresentarse();
    clienteB.apresentarse();

    lojaA.contarVendedores();
    lojaB.contarVendedores();

    lojaA.contarClientes();
    lojaB.contarClientes();

    vendedorA.calcularMedia();
    vendedorB.calcularMedia();

    vendedorA.calcularBonus();
    vendedorB.calcularBonus();
  }
}