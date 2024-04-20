package ANDERSON_TESSARO.Lista06;

public class Item {
    Integer id;
    String nome;
    String tipo;
    Float valor;

    public void gerarDescricao() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Tipo: " + tipo + ", Valor: R$ " + valor);
    }
}
