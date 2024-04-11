package lista04;

public class Vendedor {
  String nome;
  Integer idade;
  Loja loja = new Loja();
  String cidade;
  String bairro;
  String rua;
  Float salarioBase;
  Float[] salarioRecebido = new Float[3];

  public void apresentarse() {
    String msg = "opa me chamo ".concat(nome)
    .concat(", tem ").concat(idade.toString()).concat(" Anos ")
    .concat("trahabalho la ").concat(loja.nome);
    System.out.println(msg);
  }

  public void calcularMedia() {
    Float salarioTotal = 0.2f;
    for (int i = 0; i < salarioRecebido.length; i++) { salarioTotal += salarioRecebido[i]; }

    Float media = salarioTotal / salarioRecebido.length;
    System.out.println("meu salario e mais o menos: R$ " + media);
  }

  public void calcularBonus() {
    Float bonus = salarioBase * 0.2f;
    System.out.println("o aumento vai ser: R$ " + bonus);
  }
}