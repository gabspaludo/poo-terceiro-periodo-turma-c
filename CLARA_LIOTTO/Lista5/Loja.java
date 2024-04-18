package CLARA_LIOTTO.Lista5;

import java.util.ArrayList;

public class Loja {
    public String nomeFantasia;
    public String razaoSocial;
    public String cnpj;
    public String cidade;
    public String bairro;
    public String rua;
    public ArrayList<Vendedor> arrayVendedores;
    public ArrayList<Cliente> arrayClientes;

    Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.arrayVendedores = new ArrayList<>();
        this.arrayClientes = new ArrayList<>();
        System.out.println("Loja criada: " + this.nomeFantasia);
    }

    public void contarClientes() {
        System.out.println("Quantidade de clientes: " + arrayClientes.size());
    }

    public void contarVendedores() {
        System.out.println("Quantidade de vendedores: " + arrayVendedores.size());
    }

    public void apresentarSe() {
        System.out.println("Nome Fantasia: " + nomeFantasia + ", CNPJ: " + cnpj + ", Endereço: " + rua + ", " + bairro + ", " + cidade);
    }
}

