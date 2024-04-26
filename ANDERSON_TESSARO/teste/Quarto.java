package teste;

class Quarto {
    private int numero;
    private String tipo;
    private double valorDiaria;
    private boolean reservado;
    private Cliente cliente;

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.reservado = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
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