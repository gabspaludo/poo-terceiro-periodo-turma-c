package KAUE_ORLANDINI.Lista2;

public class Gerente extends Vendedor {
    double[] salarioR = new double[2];
    
    public Gerente(String nome, String idade, String loja, String bairro, String cidade, String rua, Double salarioB, Double mediaSalarios, double salarioR) {}
    
    void apresentarse() {
        System.out.println("nome: ".concat(nome).concat(", idade: ").concat(idade).concat(", loja: ").concat(loja));
    }

    void calcularMedia() {
        mediaSalarios = (salarioR[0] + salarioR[1] + salarioR[2])/3;  
        System.out.println(mediaSalarios);
    }

    void calcularBonus() {
        double salarioR = salarioB * 0.35;
        System.out.println(salarioR);
    }
}

