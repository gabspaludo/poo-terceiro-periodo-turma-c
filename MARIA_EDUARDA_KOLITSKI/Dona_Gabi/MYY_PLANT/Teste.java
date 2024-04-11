package MARIA_EDUARDA_KOLITSKI.Dona_Gabi.MYY_PLANT;

public class Teste {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.nome = "João";
        vendedor.idade = 30;
        vendedor.loja = "Loja ABC";
        vendedor.cidade = "Cidade X";
        vendedor.bairro = "Bairro Y";
        vendedor.rua = "Rua Z";
        vendedor.salarioBase = 2000f;
        vendedor.lerSalarioRecebido1(2200f);
        vendedor.lerSalarioRecebido2(2300f);
        vendedor.lerSalarioRecebido3(2400f);

        System.out.println(">>> Informações do Vendedor <<<");
        vendedor.apresentarSe();
        System.out.println("Média Salarial: " + vendedor.calcularMedia());
        System.out.println("Bônus: " + vendedor.calcularBonus());


        Cliente cliente = new Cliente();
        cliente.nome = "Maria";
        cliente.idade = 25;
        cliente.cidade = "Cidade X";
        cliente.bairro = "Bairro A";
        cliente.rua = "Rua B";

        System.out.println("\n>>> Informações do Cliente <<<");
        cliente.apresentarSe();


        Loja loja = new Loja();
        loja.nomeFantasia = "Loja ABC";
        loja.razaoSocial = "ABC LTDA";
        loja.cnpj = "12345678901234";
        loja.cidade = "Cidade X";
        loja.bairro = "Bairro Y";
        loja.rua = "Rua Z";
        loja.vendedores = new Vendedor[]{vendedor}; 
        loja.clientes = new Cliente[]{cliente}; 

        System.out.println("\n>>> Informações da Loja <<<");
        loja.apresentarSe();
        
        System.out.println(">>> Contagem <<<");
        loja.contarClientes();
        loja.contarVendedores();
    }
}