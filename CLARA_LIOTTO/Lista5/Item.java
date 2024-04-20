package CLARA_LIOTTO.Lista5;

public class Item {
    public int id = 01;
    public String nome = "cacto";
    public String tipo = "planta";
    public double valor = 5.00 ;

    public Item(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }





    public void setId(int id) {
        this.id = id;
    }





    public String getNome() {
        return nome;
    }





    public void setNome(String nome) {
        this.nome = nome;
    }





    public String getTipo() {
        return tipo;
    }





    public void setTipo(String tipo) {
        this.tipo = tipo;
    }





    public double getValor() {
        return valor;
    }





    public void setValor(double valor) {
        this.valor = valor;
    }





    public void gerarDescricao (){
        System.out.println("Nome: " + nome + "\n" + 
        "id: " + id + "\n" +
        "Tipo: " + tipo + "\n" +
        "Valor: " + valor);
    }
}
