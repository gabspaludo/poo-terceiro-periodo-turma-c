package KAUE_ORLANDINI.Lista2;

public class Loja {
    double[] vendedores = new double[2];
    
    double[] clientes = new double[4];

    public String nomeFantasia;
   
    public String razaoSocial;
    
    public String cnpj;
    
    public String bairro;
   
    public String rua;
   
    public String cidade;

    public double vendedoress;

    public double clientess;
   
    void contarClientes() {
        double clientess = clientes[0] + clientes[1] + clientes[2] + clientes[3];
        System.out.println(clientess);
    }
    
    void contarVendedores() {
        vendedoress = vendedores[0] + vendedores[1];
        System.out.println(vendedoress);
    } 

    void apresentarse() {
        System.out.println("nome: ".concat(nomeFantasia).concat(", cnpj: ").concat(cnpj).concat(", endereco: ").concat(rua));
    }
    
    
}
