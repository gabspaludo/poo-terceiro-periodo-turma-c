package lista5;

public class Vendedor extends Infos{
    public Loja loja;
    public float salarioBase;
    public float[] salarioRecebido = new float[3];

    public Vendedor(String nome, Integer idade, String cidade, String bairro, String rua,Loja loja,float salarioBase, float sal1, float sal2, float sal3){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido[0] = sal1;
        this.salarioRecebido[1] = sal2;
        this.salarioRecebido[2] = sal3;
    }

    public void apresentarse(){
        System.out.println("Meu nome é "+nome+" tenho "+idade+" anos e trabalho na loja "+loja.nome);
    }
    public void calcularMedia(){
        System.out.println("A média do salário é de R$"+(salarioRecebido[0]+salarioRecebido[1]+salarioRecebido[2])/3);
    }
    public void calcularBonus(){
        System.out.println("O bonus do salário será de R$"+salarioBase*0.2);
    }
}
