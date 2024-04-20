package atividadeObjeto;

// 4. Criar uma classe Item com:
// - Atribuitos id, nome, tipo, valor.
// - Método gerarDescricao, printa o id do item, nome, tipo e valor.
public class Item {
    String id;
    String nome;
    String tipo;
    int valor;

    public Item(String id, String nome, String tipo, int valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

}
