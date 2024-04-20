package KAUE_ORLANDINI.Lista2;

import java.util.Scanner;

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

        
        
        Cliente goncalves = new Cliente();

        goncalves.nome = "goncalves";
        goncalves.idade = "18";
        goncalves.cidade = "Cascavel";
        goncalves.bairro = "country";
        goncalves.rua = "Vincente Machado";

        ;

        Loja pvcartes = new Loja();

        pvcartes.nomeFantasia = "PVCartes";
        pvcartes.razaoSocial = "pvcartes";
        pvcartes.cnpj = "77.637.684/0001-01";
        pvcartes.cidade = "Cascavel";
        pvcartes.bairro = "consolata";
        pvcartes.rua = "Francisco Alves";
        pvcartes.clientes = new double[] {1,1,1,1,1};
        pvcartes.vendedores = new double[] {1,1,1};
        pvcartes.estado = "Parana";
        pvcartes.complemento = "nao há";
        pvcartes.numero = "2861";

        

        Gerente mega = new Gerente(null, null, null, null, null, null, null, null, 0);

        mega.nome = "mega";
        mega.idade = "19";
        mega.loja = "prisma";
        mega.bairro = "asa norte";
        mega.cidade = "Brasilia";
        mega.rua = "avenida das torres";
        mega.salarioB = 1200.00;
        mega.salarioR = new double[] {1200, 1620, 1200};

        

        Pedido primeiroPedido = new Pedido();

        primeiroPedido.id = "a1";
        primeiroPedido.cliente = "gufens";
        primeiroPedido.vendedor = "marecelo";
        primeiroPedido.loja = "prisma";
        primeiroPedido.itens = new double[] {1};
        primeiroPedido.valor = 12.50;

        Pedido novoPpedido = new Pedido();

        

        Item garrafa = new Item();

        garrafa.id = "aa";
        garrafa.nome = "garrafa";
        garrafa.tipo = "garrafas";
        garrafa.valor = "12.50";

        
        
        ProcessaPedido pedidoA = new ProcessaPedido();

        pedidoA.valor = 12.50;
        pedidoA.nome = "garrafa";
        pedidoA.cliente = "mega";

        

       

            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                exibirMenu();
    
            int opcao = scanner.nextInt();
    
            switch (opcao) {
                case 1:
                marcelo.apresentarse();
                    break;
                case 2:
                marcelo.calcularBonus();
                    break;
                case 3:
                marcelo.calcularMedia();
                    break;
                case 4:
                goncalves.apresentarse();
                    break;
                case 5:
                pvcartes.apresentarse();
                    break;
                case 6:
                pvcartes.contarClientes();
                    break;
                case 7:
                pvcartes.contarVendedores();
                    break;
                case 8:
                pvcartes.apresentarLogradouro();
                    break;
                case 9:
                mega.apresentarse();
                    break;
                case 10:
                mega.calcularBonus();
                    break;
                case 11:
                mega.calcularMedia();
                    break;
                case 12:
                primeiroPedido.calcularValorTotal();
                    break;
                case 13:
                primeiroPedido.gerarDescricaoVenda();
                    break;
                case 14:
                garrafa.gerarDescricao();
                    break;
                case 15:
                pedidoA.processar();
                    break;
                case 16:
                novoPpedido.criarPedido();
                    break;
                case 17:
                    System.out.println("software encerrado");
                    return;         
                default:
                    System.out.println("opcao invalida");
                        
            }
        }
          
        }
    
    public static void exibirMenu(){
        System.out.println("[1]: apresentarse vendedor");
        System.out.println("[2]: calcular bonus vendedor");
        System.out.println("[3]: calcular media vendedor");
        System.out.println("[4]: apresentarse cliente");
        System.out.println("[5]: apresentarse loja");
        System.out.println("[6]: contar cliente loja");
        System.out.println("[7]: contar vendedore loja");
        System.out.println("[8]: apresentar logradouro loja");
        System.out.println("[9]: apresentarse gerente");
        System.out.println("[10]: calcular bonus gerente");
        System.out.println("[11]: calcular media gerente");
        System.out.println("[12]: calcular valor total pedido");
        System.out.println("[13]: gerar descricao de venda pedido");
        System.out.println("[14]: gerar descricao item");
        System.out.println("[15]: processar pedido");
        System.out.println("[16]: criar pedido");
        System.out.println("[17]:sair");
    }  
 }