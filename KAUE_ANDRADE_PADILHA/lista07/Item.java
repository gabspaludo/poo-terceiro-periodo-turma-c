package lista07;

public class Item {
  public Integer id;
  public String nome;
  public String tipo;
  public Float valor;

  public Item(Integer id, String nome, String tipo, Float valor) {
    this.id = id;
    this.nome = nome;
    this.tipo = tipo;
    this.valor = valor;
  }

  public void gerarDescricao() {
    String msg = "ID: ".concat(id.toString())
    .concat(", Nome: ").concat(nome)
    .concat(", Tipo: ").concat(tipo)
    .concat(", Valor: ").concat(valor.toString());
    System.out.println(msg);
  }
}
