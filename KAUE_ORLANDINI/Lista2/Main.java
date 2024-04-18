package KAUE_ORLANDINI.Lista2;

public class Main {
    
    public static void main(String[] args) {

        Vendedor marcelo = new Vendedor();
        
        marcelo.nome = "Marcelo";
        marcelo.idade = "18";
        marcelo.bairro = "regiao do lago";
        marcelo.cidade = "Cascavel";
        marcelo.rua = "Bom Jesus";
        marcelo.loja = "Prisma";
        marcelo.salarioB = 1000.00;
        marcelo.salarioR = new double [] {1000, 1000, 1200};

        marcelo.apresentarse();

        marcelo.calcularBonus();

        marcelo.calcularMedia();
        
        Cliente goncalves = new Cliente();

        goncalves.nome = "goncalves";
        goncalves.idade = "18";
        goncalves.cidade = "Cascavel";
        goncalves.bairro = "country";
        goncalves.rua = "Vincente Machado";

        goncalves.apresentarse();

        Loja pvcartes = new Loja();

        pvcartes.nomeFantasia = "PVCartes";
        pvcartes.razaoSocial = "pvcartes";
        pvcartes.cnpj = "77.637.684/0001-01";
        pvcartes.cidade = "Cascavel";
        pvcartes.bairro = "consolata";
        pvcartes.rua = "Francisco Alves";
        pvcartes.clientes = new double[] {1,1,1,1,1};
        pvcartes.vendedores = new double[] {1,1,1};

        pvcartes.apresentarse();

        pvcartes.contarClientes();

        pvcartes.contarVendedores();

    }
}