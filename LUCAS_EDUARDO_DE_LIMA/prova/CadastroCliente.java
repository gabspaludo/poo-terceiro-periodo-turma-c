package LUCAS_EDUARDO_DE_LIMA.prova;

import java.util.ArrayList;

public class CadastroCliente {
    private ArrayList<Cliente> listaClientes;

    public CadastroCliente() {
        listaClientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void exibirClientesCadastrados() {
        if (listaClientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {
            System.out.println("Clientes cadastrados:");
            for (Cliente cliente : listaClientes) {
                System.out.println("Nome: " + cliente.getNome() + ", Idade: " + cliente.getIdade());
            }
        }
    }
}
