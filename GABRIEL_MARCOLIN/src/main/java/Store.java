package mercadinhov2;

/*array vendedores, array de clientes.
contarClientes, mosta a quantidade de clientes
contarVendedores, mosta a quantidade de vendedores.
.*/


public class Store extends Information {
    private String fantasyName = "Marcolin LTDA";
    private String companyName = "Marcolin e Marcinho";
    private String cnpj = "13.204.347/0001-97";
    private String city = "Curitiba";
    private String district = "Aliança";
    private String street = "José Almeida";

    @Override
    public void apresentarse() {
        System.out.println("Nome fantasia da Loja: " + fantasyName);
        System.out.println("CNPJ da loja: " + cnpj);
        System.out.println("Endereço da loja: Rua " + street + ", Bairro " + district + ", Cidade " + city);
    }
}
