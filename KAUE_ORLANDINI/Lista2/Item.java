package KAUE_ORLANDINI.Lista2;

public class Item {

    public String id;

    public String nome;
    
    public String tipo;
    
    public String valor;
    
    void gerarDescricao() {
        System.out.println("id: ".concat(id).concat(", nome: ").concat(nome).concat(", tipo: ").concat(tipo).concat(", valor: ").concat(valor));
    }
    
}
