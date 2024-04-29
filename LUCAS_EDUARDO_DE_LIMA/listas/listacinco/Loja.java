package 
listas.listacinco;

public class Loja {

    /*3. Crie uma classe Loja com:
    Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes.
    contarClientes, mosta a quantidade de clientes
    contarVendedores, mosta a quantidade de vendedores.
    Método apresentarse, printa nomeFantasia, cnpj e endereco.*/

    String nomeFantasia;

    String razaoSocial;

    String cnpj;

    String cidade;

    String bairro;

    String rua;

    Cliente[] clientes = new Cliente[100];

    Vendedor[] vendedores = new Vendedor[100];

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua, Cliente[] clientes, Vendedor[] vendedores) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.clientes = clientes;
        this.vendedores = vendedores;
    }

    public int contarClientes() {
        if (clientes[0] == null) {
            return 0;
        }
        int cont = 0;
        while (true) {
            cont++;
            if (clientes[cont] == null) {
                return cont;
            }

        }

    }

    public int contarVendedores() {
        if (vendedores[0] == null) {
            return 0;
        }
        int cont = 0;
        while (true) {
            cont++;
            if (vendedores[cont] == null) {
                return cont;
            }
        }

    }


    public void apresentarse() {
        System.out.println(nomeFantasia+ " do CNPJT " +cnpj+ " na Cidade " +cidade+ " no bairro " +bairro+ " na rua " +rua);
    }


}


