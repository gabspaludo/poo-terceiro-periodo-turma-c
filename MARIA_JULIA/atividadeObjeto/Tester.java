package atividadeObjeto;

public class Tester{
    public static void main(String[] args){
        Vendedor vendedorUm = new Vendedor();
        Vendedor vendedorDois = new Vendedor();
        Vendedor vendedorTres = new Vendedor();

        vendedorUm.nome = "Alejandro";
        vendedorUm.idade = 23;
        vendedorUm.loja = "My Plant";
        vendedorUm.cidade = "Cascavel";
        vendedorUm.bairro = "Maria Luiza";
        vendedorUm.rua = "Rua Sandino erasmo de amorim";
        vendedorUm.salarioBase = 1200.00;
        vendedorUm.apresentarse();
        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();

        vendedorDois.nome = "Alejandro";
        vendedorDois.idade = 23;
        vendedorDois.loja = "My Plant";
        vendedorDois.cidade = "Cascavel";
        vendedorDois.bairro = "Maria Luiza";
        vendedorDois.rua = "Rua Sandino erasmo de amorim";
        vendedorDois.salarioBase = 1200.00;
        vendedorDois.apresentarse();
        vendedorDois.calcularMedia();
        vendedorDois.calcularBonus();

        vendedorTres.nome = "Alejandro";
        vendedorTres.idade = 23;
        vendedorTres.loja = "My Plant";
        vendedorTres.cidade = "Cascavel";
        vendedorTres.bairro = "Maria Luiza";
        vendedorTres.rua = "Rua Sandino erasmo de amorim";
        vendedorTres.salarioBase = 1200.00;
        vendedorTres.apresentarse();
        vendedorTres.calcularMedia();
        vendedorTres.calcularBonus();

        System.out.println("--------");

        Vendedor clienteUm = new Vendedor();
        Vendedor clienteDois = new Vendedor();
        Vendedor clienteTres = new Vendedor();

        clienteUm.nome = "Amanda";
        clienteUm.idade = 33;
        clienteUm.cidade = "Cascavel";
        clienteUm.bairro = "Maria Luiza";
        clienteUm.rua = "Rua Da lapa";
        clienteUm.apresentarse();

        clienteDois.nome = "Elaine";
        clienteDois.idade = 23;
        clienteDois.cidade = "Toledo";
        clienteDois.bairro = "Centro";
        clienteDois.rua = "Avenida Brasil";
        clienteDois.apresentarse();

        clienteTres.nome = "Junior";
        clienteTres.idade = 34;
        clienteTres.cidade = "Palotina";
        clienteTres.bairro = "Centro";
        clienteTres.rua = "Rua do centro";
        clienteTres.apresentarse();

        System.out.println("--------");

        Loja myplant = new Loja();

        myplant.nomeFantasia = "MY PLANT";
        myplant.razaoSocial = "Floricultura";
        myplant.cnpj = "19203-2932/00012";
        myplant.cidade = "Cascavel";
        myplant.bairro = "Centro";
        myplant.rua = "Rua Rio Grande do Sul";

        myplant.adicionarCliente(clienteUm.nome);
        myplant.adicionarCliente(clienteDois.nome);
        myplant.adicionarCliente(clienteTres.nome);

        myplant.adicionarVendedor(vendedorUm.nome);
        myplant.adicionarVendedor(vendedorDois.nome);
        myplant.adicionarVendedor(vendedorTres.nome);

        myplant.apresentarse();
        myplant.contarClientes();
        myplant.contarVendedores();
    
    }

}
