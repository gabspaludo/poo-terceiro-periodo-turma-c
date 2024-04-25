package teste;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> quartos;
    private List<Cliente> clientes;

    public Hotel() {
        this.quartos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String cpf) {
        Cliente cliente = new Cliente(nome, cpf);
        this.clientes.add(cliente);
    }

    public void cadastrarQuarto(int numero, String tipo, double valorDiaria) {
        Quarto quarto = new Quarto(numero, tipo, valorDiaria);
        this.quartos.add(quarto);
    }

    public List<Quarto> listarQuartos() {
        return this.quartos;
    }

    public void reservarQuarto(int numeroQuarto, String cpfCliente) {
        Quarto quarto = this.quartos.stream()
              .filter(q -> q.getNumero() == numeroQuarto)
              .findFirst()
              .orElse(null);

        if (quarto!= null) {
            Cliente cliente = this.clientes.stream()
                  .filter(c -> c.getCpf().equals(cpfCliente))
                  .findFirst()
                  .orElse(null);

            if (cliente!= null) {
                quarto.reservar(cliente);
            } else {
                System.out.println("Cliente não encontrado.");
            }
        } else {
            System.out.println("Quarto não encontrado.");
        }
    }

    public void checkin(int numeroQuarto, String cpfCliente) {
        Quarto quarto = this.quartos.stream()
              .filter(q -> q.getNumero() == numeroQuarto)
              .findFirst()
              .orElse(null);

        if (quarto!= null) {
            Cliente cliente = this.clientes.stream()
                  .filter(c -> c.getCpf().equals(cpfCliente))
                  .findFirst()
                  .orElse(null);

            if (cliente!= null) {
                quarto.checkin(cliente);
            } else {
                System.out.println("Cliente não encontrado.");
            }
        } else {
            System.out.println("Quarto não encontrado.");
        }
    }
}