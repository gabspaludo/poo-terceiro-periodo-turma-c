package MARIA_EDUARDA_KOLITSKI.Dona_Gabi.MYY_PLANT;

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    Vendedor[] vendedores;
    Cliente[] clientes;

    void contarClientes() {
        System.out.println("Quantidade de clientes: " + clientes.length);
    }

    void contarVendedores() {
        System.out.println("Quantidade de vendedores: " + vendedores.length);
    }

    void apresentarSe() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    }
}