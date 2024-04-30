package LUCAS_EDUARDO_DE_LIMA.prova;

public class CompraIngresso {
    private final EventoShow evento;
    private final Cliente cliente;

    public CompraIngresso(EventoShow evento, Cliente cliente) {
        this.evento = evento;
        this.cliente = cliente;
    }

    public void comprarIngresso() {
     
        System.out.println("Ingresso comprado com sucesso para o evento: " + evento.getNome());
        System.out.println("Cliente: " + cliente.getNome());
    }
}
