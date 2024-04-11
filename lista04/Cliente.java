package lista04;

public class Cliente {
  String nome;
  Integer idade;
  String cidade;
  String bairo;
  String rua;

  public void apresentarse() {
    String msg = "opa, me chamo ".concat(nome)
    .concat(", vou ter ").concat(idade.toString()).concat(" ano ");
    System.out.println(msg);
  }
}