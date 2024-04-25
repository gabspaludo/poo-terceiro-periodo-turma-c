package KAUE_ORLANDINI.Lista2;

import java.util.Scanner;

public class Item {
    Scanner scanner = new Scanner(System.in);

    private String[] itens = new String[2];

    private String id;

    private int i;

    private String nome;
    
    private String tipo;
    
    private Double valor;
    
    

    public Item(String id, String nome, String tipo, Double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    void gerarDescricao() {
        System.out.println("id: ".concat(id).concat(", nome: ").concat(nome).concat(", tipo: ").concat(tipo).concat(", valor: ") + String.valueOf(valor));
    }

    void cadastrarItem(){
        System.out.println("qual o nome do item");
          itens [i] = scanner.toString();
        System.out.println("iten adicionado");
    }

    void listarItens(){
        System.out.println(itens[i]);
    }
   
   
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }
    
    
}
