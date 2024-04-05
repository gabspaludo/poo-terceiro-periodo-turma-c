package lista_04.classes.pessoa;

public class Pessoa {
  private String nome;
  private String bairro;
  private String cidade;
  private String rua;
  private int idade;

  public Pessoa(String nome, String bairro, String cidade, String rua, int idade) {
    this.nome = nome;
    this.bairro = bairro;
    this.cidade = cidade;
    this.rua = rua;
    this.idade = idade;
  }

  public void getPessoa() {
    System.out.println("Nome da pessoa: ".concat(nome));
    System.out.println("Bairro da pessoa: ".concat(bairro));
    System.out.println("Nome da pessoa: ".concat(cidade));
    System.out.println("Nome da pessoa: ".concat(rua));
    System.out.println("Nome da pessoa: " + idade);
  }

  public void amar() {
    System.out.println("true");
  }

  public String getBairro() {
    return bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public String getRua() {
    return rua;
  }
}
