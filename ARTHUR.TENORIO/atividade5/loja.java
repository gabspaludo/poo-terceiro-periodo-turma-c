package atividade5;
import java.util.ArrayList;

public class loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    ArrayList<vendedor> vendedores;
    ArrayList<cliente> clientes;

    public loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua, ArrayList<vendedor> vendedores, ArrayList<cliente> clientes) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.vendedores = vendedores;
        this.clientes = clientes;
    }

    public void contarClientes() {
        System.out.println("Quantidade de clientes: " + clientes.size());
    }

    public void contarVendedores() {
        System.out.println("Quantidade de vendedores: " + vendedores.size());
    }

    public void apresentarSe() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    }
}