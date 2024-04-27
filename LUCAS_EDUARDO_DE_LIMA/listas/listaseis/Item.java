package listas.listaseis;

/*Criar uma classe Item com:
- Atribuitos id, nome, tipo, valor.
- Método gerarDescricao, printa o id do item, nome, tipo e valor. */

public class Item {
    long id;
    String name;
    double preco;

    public Item(long id, String name, double preco) {
        this.id = id;
        this.name = name;
        this.preco = preco;
    }
    
    public void gerarDescricao(){
        System.err.println(+id+ );
    }
}

