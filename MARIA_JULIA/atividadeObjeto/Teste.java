package atividadeObjeto;
import java.text.ParseException;

public class Teste{
    public static void main(String[] args) throws ParseException {
        // Criar objetos de teste
        Cliente cliente = new Cliente("PR", "Cascavel", "Maria Luiza", "123", "Rua ABC", "João", 30);
        Vendedor vendedor = new Vendedor("PR", "Cascavel", "Centro", "456", "Rua XYZ", "Maria", 25);
        Loja loja = new Loja("PR", "Cascavel", "Centro", "789", "Avenida Principal", "Loja A", "Loja A Ltda", "123456789");
        Gerente gerente = new Gerente("PR","Cascavel","Brasília","909","Rua Vermelha","André",45);

        loja.adicionarCliente(cliente.nome);
        loja.adicionarVendedor(vendedor.nome);

        Item item1 = new Item("I001", "Produto A", "Produto", 50);
        Item item2 = new Item("I002", "Produto B", "Produto", 30);

  

        ProcessaPedido processador = new ProcessaPedido();

        System.out.println("----- Pedido -----");
        processador.processar("PED123","01/12/2020","10/01/2021","10/06/2021", cliente.nome, vendedor.nome, loja.nomeFantasia, item1, item2);

        // testando métodos
        System.out.println("----- cliente -----");
        cliente.apresentarse();
        cliente.apresentarLogradouro();

        System.out.println("----- vendedor -----");
        vendedor.apresentarse();
        vendedor.apresentarLogradouro(); 
        vendedor.calcularMedia();
        vendedor.calcularBonus();

        System.out.println("----- gerente -----");
        gerente.apresentarse();
        gerente.calcularMedia();
        gerente.calcularBonus();

        System.out.println("----- loja -----");
        loja.apresentarse();
        loja.apresentarLogradouro();

        





    
    }

    
}
