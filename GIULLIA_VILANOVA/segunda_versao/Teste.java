package segunda_versao;

public class Teste {

    public static void main(String[] args) {
        testarCliente();
        testarLoja();
        testarVendedor();
    }

    public static void testarCliente() {
        Cliente cliente = new Cliente("João", 30, "São Paulo", "Centro", "Rua A");
        cliente.apresentarSe();
    }

    public static void testarLoja() {
        Loja loja = new Loja();
        loja.setNomeFantasia("Loja A");
        loja.setCnpj(123456789L);
        loja.setRua("Rua B");
        loja.setBairro("Bairro X");
        loja.setCidade("Rio de Janeiro");
        loja.apresentarSe();
    }

    public static void testarVendedor() {
        Loja loja = new Loja();
        loja.setNomeFantasia("Loja A");

        Vendedor vendedor = new Vendedor("Maria", 25, loja, "São Paulo", "Centro", "Rua C", 2000.0, new double[]{1000.0, 1200.0, 1500.0});
        vendedor.apresentarSe();
        System.out.println("Média salarial: " + vendedor.calcularMedia());
        System.out.println("Bônus: " + vendedor.calcularBonus());
    }
}
