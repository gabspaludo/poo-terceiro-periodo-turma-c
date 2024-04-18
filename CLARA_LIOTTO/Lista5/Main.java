package CLARA_LIOTTO.Lista5;

public class Main {
    public static void main(String[] args) {
        
        Loja loja = new Loja("Myy Plant", "Myy Plant LTDA", "12123123/0001-13", "Ubiratã PR", "Centro", "Avenida Joao Medeiros");
        
        Vendedor vendedor = new Vendedor();
        vendedor.loja = loja; 
        
        loja.arrayVendedores.add(vendedor);
        
        Cliente cliente = new Cliente();
        
        loja.arrayClientes.add(cliente);

        System.out.println("Vendedores :");

        vendedor.apresentarSe();

        System.out.println("Média salarial :"+ vendedor.calcularMedia());
        System.out.println("Bônus salarial :"+ vendedor.calcularBonus());

        System.out.println("Clientes :");

        cliente.apresentarSe();
        
        loja.contarVendedores();
        loja.contarClientes();

        System.out.println("Loja :");

        loja.apresentarSe();
    }
}

