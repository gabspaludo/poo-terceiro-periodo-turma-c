package ANDERSON_TESSARO.Lista05;

public class Vendedor {
  String nome;
  Integer idade;
  Loja loja = new Loja();
  String cidade;
  String bairo;
  String rua;
  Float salarioBase;
  Float[] salarioRecebido = new Float[3];

  public void apresentarse() {
    String msg = "opa bão eu o ".concat(nome)
    .concat(", tem ").concat(idade.toString()).concat(" ano ")
    .concat("trabalho no lugar ").concat(loja.nome);
    System.out.println(msg);
  }

  public void calcularMedia() {
    Float salarioTotal = 0.2f;
    for (int i = 0; i < salarioRecebido.length; i++) { salarioTotal += salarioRecebido[i]; }

    Float media = salarioTotal / salarioRecebido.length;
    System.out.println("o salario vai ser nessa media: R$ " + media);
  }

  public void calcularBonus() {
    Float bonus = salarioBase * 0.2f;
    System.out.println("o aumento vai ser: R$ " + bonus);
  }
}