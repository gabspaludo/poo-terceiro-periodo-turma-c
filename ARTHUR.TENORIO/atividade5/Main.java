package atividade5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> salarioRecebido = new ArrayList<>();
        salarioRecebido.add(1500.0);
        salarioRecebido.add(1600.0);
        salarioRecebido.add(1700.0);
        
        vendedor vendedor = new vendedor("João", 30, "Myy Plant", "São Paulo", "Centro", "Rua A", 2000.0, salarioRecebido);
        vendedor.apresentarSe();
        System.out.println("Média salarial: " + vendedor.calcularMedia());
        System.out.println("Bônus: " + vendedor.calcularBonus());

        cliente cliente = new cliente("Maria", 25, "São Paulo", "Centro", "Rua B");
        cliente.apresentarSe();

        ArrayList<vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor);

        ArrayList<cliente> clientes = new ArrayList<>();
        clientes.add(cliente);

        loja loja = new loja("Myy Plant", "Myy Plant Ltda", "123456789", "São Paulo", "Centro", "Rua C", vendedores, clientes);
        loja.contarClientes();
        loja.contarVendedores();
        loja.apresentarSe();
    }
}
