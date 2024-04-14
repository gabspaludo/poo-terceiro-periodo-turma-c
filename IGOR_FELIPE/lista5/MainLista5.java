package lista5;

public class MainLista5 {

    public static int adicionarVendedor(Vendedor[] vendedores,int armazenamentoVendedores){
        for(int i=0;i<armazenamentoVendedores;i++){
            if(vendedores[i] == null){
                return i; 
            }
        }
        return -1;
    }

    public static int adicionarCliente(Cliente[] vendedores,int armazenamentoClientes){
        for(int i=0;i<armazenamentoClientes;i++){
            if(vendedores[i] == null){
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        Loja loja1 = new Loja("Qualycenter",null,"Cascavel","Centro","Rua Dom Pedro II","Solange","123456789101");

        Vendedor vendedor1 = new Vendedor("Igor",20,"Cascavel","Quebec","Avenida das Torres",loja1,1500,1500,2000,2100);
        vendedor1.loja.vendedores[adicionarVendedor(vendedor1.loja.vendedores,vendedor1.loja.armazenamentoVendedores)] = vendedor1;

        Vendedor vendedor2 = new Vendedor("Maria",19,"Cascavel","Centro","Avenida Brasil",loja1,1700,2000,1750,2300);
        vendedor2.loja.vendedores[adicionarVendedor(vendedor1.loja.vendedores,vendedor2.loja.armazenamentoVendedores)] = vendedor2;

        vendedor1.apresentarse();
        vendedor1.calcularBonus();
        vendedor1.calcularMedia();

        vendedor2.apresentarse();
        vendedor2.calcularBonus();
        vendedor2.calcularMedia();
        
        Cliente cliente1 = new Cliente("Sarah",17,"Cascavel","Centro","Avenida Brasil",loja1);
        cliente1.loja.clientes[adicionarCliente(cliente1.loja.clientes,cliente1.loja.armazenamentoClientes)] = cliente1;
        cliente1.apresentarse();

        loja1.contarVendedores();
        loja1.contarClientes();

    }
}

