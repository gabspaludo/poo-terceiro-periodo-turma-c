package KAUE_ORLANDINI.Lista2;

public class Endereco {

    public String bairro;
    
    public String cidade;

    public String rua;
    
    public String estado;
    
    public String numero;
    
    public String complemento;

    void apresentarLogradouro() {
        System.out.println("estado: ".concat(estado).concat(", cidade: ").concat(cidade).concat(", bairro: ").concat(bairro).concat(", rua: ").concat(rua).concat(", numero: ").concat(numero).concat(", complemento:").concat(complemento));
    }


    
}
