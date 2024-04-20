package atividadeObjeto;
// 5. Criar uma classe Pedido com:
// - Atributos, id, dataCriacao, dataPagamento, dataVencimentoReserva(a reserva vence depois de 3 dias da criação do pedido), cliente, vendedor, Loja e array de itens.
// - Método calcularValorTotal, retorna o valor total do pedido.
// - Método gerarDescricaoVenda, retorna o print informando a data de criação do pedido e seu valor total.
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    String idPedido;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    String cliente;
    String vendedor;
    String loja;
    ArrayList<Item> itens = new ArrayList<>();

    public Pedido(String idPedido, String dataCriacao, String dataPagamento, String dataVencimentoReserva, String cliente, String vendedor, String loja) throws ParseException {
        this.idPedido = idPedido;
        this.dataCriacao = parseDate(dataCriacao);
        this.dataPagamento = parseDate(dataPagamento);
        this.dataVencimentoReserva = parseDate(dataVencimentoReserva);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
    }

    private Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(dateString);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public ArrayList<Item> returnItems() {
        return itens;
    }
    public int calcularValorTotal() {
        int total = 0;
        for (Item item : itens) {
            total += item.valor;
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de criação do pedido: " + dataCriacao);
        System.out.println("Valor total do pedido: " + calcularValorTotal());
    }
}
