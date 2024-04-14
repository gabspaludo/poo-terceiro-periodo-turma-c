package segunda_versao;

import java.util.ArrayList;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private Long cnpj;
    private String cidade;
    private String bairro;
    private String rua;
    private ArrayList<Vendedor> vendedor = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Long getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public ArrayList<Vendedor> getVendedor() {
        return this.vendedor;
    }

    public void setVendedor(ArrayList<Vendedor> vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Cliente> getCliente() {
        return this.cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public int contarClientes(ArrayList<Cliente> clientes) {
        return clientes.size();
    }

    public int contarVendedores(ArrayList<Vendedor> vendedores) {
        return vendedores.size();
    }

    public void apresentarSe() {
        System.out.println("Nome fantasia da loja: "
            .concat(nomeFantasia));
        System.out.println("CNPJ: "
            .concat(String.valueOf(cnpj)));
        System.out.println("Endereço: "
            .concat(rua)
            .concat(", ")
            .concat(bairro)
            .concat(", ")
            .concat(cidade));
    }
}
