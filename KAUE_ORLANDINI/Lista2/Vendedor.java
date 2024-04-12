package KAUE_ORLANDINI.Lista2;


public class Vendedor {
    double[] salarioR = new double[2];

    public String nome;
    
    public String idade;

    public String loja;
    
    public String bairro;
    
    public String cidade;

    public String rua;

    public Double salarioB;

    public Double mediasalarios;

    void apresentarse() {
        System.out.println("nome: ".concat(nome).concat(", idade: ").concat(idade).concat(", loja: ").concat(loja));
    }

    void calcularMedia() {
        mediasalarios = (salarioR[0] + salarioR[1] + salarioR[2])/3;  
        System.out.println(mediasalarios);
    }

   
    void calcularBonus() {
        double salarioR = salarioB * 0.2;
        System.out.println(salarioR);
    }
}