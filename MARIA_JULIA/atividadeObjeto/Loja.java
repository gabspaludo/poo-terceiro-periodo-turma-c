package atividadeObjeto;
import java.util.ArrayList;

// 3. Crie uma classe Loja com:
// Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes.
// contarClientes, mosta a quantidade de clientes
// contarVendedores, mosta a quantidade de vendedores.
// Método apresentarse, printa nomeFantasia, cnpj e endereco.

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    ArrayList<String> vendedores = new ArrayList<>();
    ArrayList<String> clientes = new ArrayList<>();
    
    public void contarClientes() {
        int contador = 0;
        for (String i : clientes){
            contador = contador + 1;
            String apresentar = "Cliente - " + i;
            System.out.println(apresentar);
        }
        String contadorString = String.valueOf(contador);
        System.out.println(contadorString); 

    }
    public void contarVendedores() {
        int contador = 0;
        for (String i : vendedores){
            contador = contador + 1;
            String apresentar = "Vendedor - " + i;
            System.out.println(apresentar);
        }
        String contadorString = String.valueOf(contador);
        System.out.println(contadorString); 


    }
    public void apresentarse() {
        String apresentar = "Nome fantasia: "+ nomeFantasia +"\nCNPJ: "+cnpj+"\nEndereço: " + rua + ", " + bairro+" - "+cidade;
        System.out.println(apresentar);

    }

    public void adicionarCliente(String cliente) {
        clientes.add(cliente);
    }

    public void adicionarVendedor(String vendedor) {
        vendedores.add(vendedor);
    }
}
