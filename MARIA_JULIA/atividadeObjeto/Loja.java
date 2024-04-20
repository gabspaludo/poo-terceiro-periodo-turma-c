package atividadeObjeto;

import java.util.ArrayList;

// 3. Crie uma classe Loja com:
// Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes.
// contarClientes, mosta a quantidade de clientes
// contarVendedores, mosta a quantidade de vendedores.
// Método apresentarse, printa nomeFantasia, cnpj e endereco.

public class Loja extends Endereco {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    ArrayList<String> vendedores = new ArrayList<>();
    ArrayList<String> clientes = new ArrayList<>();

    public Loja(String estado, String cidade, String bairro, String numero, String complemento, String nomeFantasia,
            String razaoSocial, String cnpj) {
        super(estado, cidade, bairro, numero, complemento);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public void contarClientes() {
        int contador = 0;
        for (String i : clientes) {
            contador = contador + 1;
            String apresentar = "Cliente - " + i;
            System.out.println(apresentar);
        }
        String contadorString = String.valueOf(contador);
        System.out.println(contadorString);

    }

    public void contarVendedores() {
        int contador = 0;
        for (String i : vendedores) {
            contador = contador + 1;
            String apresentar = "Vendedor - " + i;
            System.out.println(apresentar);
        }
        String contadorString = String.valueOf(contador);
        System.out.println(contadorString);

    }

    public void apresentarse() {
        String apresentar = "Nome fantasia: " + nomeFantasia + "\nCNPJ: " + cnpj;
        System.out.println(apresentar);
        super.apresentarLogradouro();

    }

    public void adicionarCliente(String cliente) {
        clientes.add(cliente);
    }

    public void adicionarVendedor(String vendedor) {
        vendedores.add(vendedor);
    }
}
