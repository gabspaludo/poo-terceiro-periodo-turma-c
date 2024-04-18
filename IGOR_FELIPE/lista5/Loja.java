package lista5;

public class Loja extends Infos{
    public String razao;
    public String cnpj;
    public int armazenamentoVendedores = 5;
    public int armazenamentoClientes = 5;
    public Vendedor[] vendedores = new Vendedor[armazenamentoVendedores];    //ArrayList<Vendedor> vendedores = new ArrayList<>();
    public Cliente[] clientes = new Cliente[armazenamentoVendedores];
    int qtdVendedores;
    int qtdClientes;

    public Loja(String nome, Integer idade, String cidade, String bairro, String rua,String razao,String cnpj){
        this.nome = nome;
        this.idade = null;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.razao = razao;
        this.cnpj = cnpj;
    }

    public void contarClientes(){
        int qtdClientes = 0;
        for(int i=0;i<clientes.length;i++){
            if(clientes[i] != null){
                qtdClientes += 1;
            }
        }
        System.out.println("Quantidade de clientes: "+qtdClientes); 
    }
    public void contarVendedores(){
        int qtdVendedores = 0;
        for(int i=0;i<vendedores.length;i++){
            if(vendedores[i] != null){
                qtdVendedores += 1;
            }
        }
        System.out.println("Quantidade de vendedores: "+qtdVendedores);
    }
    public void apresentarse(){
        System.out.println("Empresa: "+nome+" CNPJ: "+cnpj+" Endereço: "+rua);
    }
}
//VERIFICAR QUESTÃO DO ENDEREÇO E RUA DEPOIS.
