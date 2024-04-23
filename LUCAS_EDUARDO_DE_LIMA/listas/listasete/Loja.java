package LUCAS_EDUARDO_DE_LIMA.listas.listasete;

import java.util.List;


public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private long cnpj;
    private Endereco endereco;
    private List<Cliente> clientes;
    private List<Vendedor> vendedors;

    public Loja(String nomeFantasia, String razaoSocial, long cnpj, Endereco endereco, List<Cliente> clientes, List<Vendedor> vendedors) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.clientes = clientes;
        this.vendedors = vendedors;
    }

    public int contarClientes() {
        return clientes.size();
    }

    public int contarVendedores() {
        return vendedors.size();
    }

    public void apresentarse() {
        System.out.println(nomeFantasia + " do CNPJT " + cnpj + " no endereço: " + endereco);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Vendedor> getVendedors() {
        return vendedors;
    }

    public void setVendedors(List<Vendedor> vendedors) {
        this.vendedors = vendedors;
    }
}

