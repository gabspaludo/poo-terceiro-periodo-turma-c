package teste.eu;

public class Quartos {
    private int numero;
    private double valorDiaria;
    private boolean reservado;
    private Cliente cliente;

    public void Quarto(int numero, double valorDiaria) {
        this.numero = numero;
        this.valorDiaria = valorDiaria;
        this.reservado = false;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isReservado() {
        return reservado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void reservar(Cliente cliente) {
        this.cliente = cliente;
        this.reservado = true;
    }

    public void checkin(Cliente cliente) {
        if (reservado && this.cliente.equals(cliente)) {
            System.out.println("Check-in realizado com sucesso.");
        } else {
            System.out.println("Check-in não realizado. Quarto não reservado ou cliente incorreto.");
        }
    }
}

