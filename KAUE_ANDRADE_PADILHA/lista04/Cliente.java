package lista04;

public class Cliente {
  String nome;
  Integer idade;
  String cidade;
  String bairro;
  String rua;

  public void apresentarse() {
    String msg = "Olá, meu nome é ".concat(nome)
    .concat(", Tenho ").concat(idade.toString()).concat(" Anos ");
    System.out.println(msg);
  }
}
