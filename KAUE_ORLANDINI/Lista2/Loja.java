package KAUE_ORLANDINI.Lista2;

public class Loja extends Endereco {
    double[] vendedores = new double[2];
    
    double[] clientes = new double[4];

    public String nomeFantasia;
   
    public String razaoSocial;
    
    public String cnpj;
    
    public String bairro;
   
    public String rua;
   
    public String cidade;
    
    public String estado;
    
    public String complemento;
    
    public String numero;

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
    
    void apresentarLogradouro() {
        System.out.println("estado: ".concat(estado).concat(", cidade: ").concat(cidade).concat(", bairro: ").concat(bairro).concat(", rua: ").concat(rua).concat(", numero: ").concat(numero).concat(", complemento:").concat(complemento));
    }
}
