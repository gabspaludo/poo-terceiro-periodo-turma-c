package KAUE_ORLANDINI.Lista2;

public class Cliente {

    public String nome;
    
    public String idade;
   
    public String cidade;
   
    public String bairro;
   
    public String rua;
    
    void apresentarse() {
        System.out.println("nome: ".concat(nome).concat(", idade: ").concat(idade));
    }
}
