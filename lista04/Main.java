package lista04;

public class Main {
  public static void main(String[] args) {
    Loja lojaA = new Loja();
    Loja lojaB = new Loja();

    Vendedor vendedorA = new Vendedor();
    Vendedor vendedorB = new Vendedor();

    Cliente clienteA = new Cliente();
    Cliente clienteB = new Cliente();

    // Vendedores
    vendedorA.nome = "vendedor A";
    vendedorA.idade = 25;
    vendedorA.loja = lojaA;
    vendedorA.cidade = "cidade A";
    vendedorA.bairro = "bairro A";
    vendedorA.rua = "rua A";
    vendedorA.salarioBase = 1150.0f;
    vendedorA.salarioRecebido[0] = 1200.0f;
    vendedorA.salarioRecebido[1] = 1350.0f;
    vendedorA.salarioRecebido[2] = 1450.0f;

    vendedorB.nome = "vendedor B";
    vendedorB.idade = 30;
    vendedorB.loja = lojaB;
    vendedorB.cidade = "cidade B";
    vendedorB.bairro = "bairo B";
    vendedorB.rua = "rua B";
    vendedorB.salarioBase = 1450.0f;
    vendedorB.salarioRecebido[0] = 1500.0f;
    vendedorB.salarioRecebido[1] = 1700.0f;
    vendedorB.salarioRecebido[2] = 1850.0f;

    // Clientes
    clienteA.nome = "cliente A";
    clienteA.idade = 30;
    clienteA.cidade = "cidade A";
    clienteA.bairo = "bairo A";
    clienteA.rua = "rua A";

    clienteB.nome = "cliente B";
    clienteB.idade = 35;
    clienteB.cidade = "cidade B";
    clienteB.bairo = "bairo B";
    clienteB.rua = "rua B";

    // Lojas
    lojaA.nome = "loja A";
    lojaA.Social = "loja A LTDS";
    lojaA.cnpj = 10203040;
    lojaA.cidade = "cidade A";
    lojaA.bairo = "bairo A";
    lojaA.rua = "rua A";
    lojaA.vendedores[0] = vendedorA;    
    lojaA.clientes[0] = clienteA;

    lojaB.nome = "loja B";
    lojaB.Social = "loja B LTDS";
    lojaB.cnpj = 40302010;
    lojaB.cidade = "cidade B";
    lojaB.bairo = "bairo B";
    lojaB.rua = "rua B";
    lojaB.vendedores[0] = vendedorB;
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