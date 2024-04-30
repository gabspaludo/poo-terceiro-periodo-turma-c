package LUCAS_EDUARDO_DE_LIMA.prova;

import java.util.Scanner;
import java.util.ArrayList;

public class AnaCastelaTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CadastroCliente cadastroCliente = new CadastroCliente();
            CadastroEventoShow cadastroEventoShow = new CadastroEventoShow();
            ArrayList<String> eventos = new ArrayList<>();
            ListagemEvento listagemEvento = new ListagemEvento(eventos);
    
            int opcao;
            do {
                System.out.println("Menu:");
                System.out.println("1. Cadastrar cliente");
                System.out.println("2. Cadastrar evento de show");
                System.out.println("3. Listar eventos de show cadastrados");
                System.out.println("4. Comprar ingresso");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do scanner
    
                switch (opcao) {
                    case 1:
                        System.out.println("Cadastro de Cliente:");
                        System.out.print("Nome: ");
                        String nomeCliente = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idadeCliente = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer do scanner
                        Cliente cliente = new Cliente(nomeCliente, idadeCliente);
                        cadastroCliente.adicionarCliente(cliente);
                        System.out.println("Cliente cadastrado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Cadastro de Evento de Show:");
                        System.out.print("Nome do show: ");
                        String nomeShow = scanner.nextLine();
                        eventos.add(nomeShow); // Adiciona o nome do evento à lista de eventos
                        System.out.print("Local do show: ");
                        String localShow = scanner.nextLine();
                        // Aqui você pode adicionar mais atributos ao evento de show, se necessário
                        EventoShow eventoShow = new EventoShow(nomeShow, localShow);
                        cadastroEventoShow.cadastrarEvento(eventoShow);
                        System.out.println("Evento de show cadastrado com sucesso!");
                        break;
                    case 3:
                        System.out.println("Eventos de Show Cadastrados:");
                        listagemEvento.listarEventos(); // Lista os eventos cadastrados
                        break;
                    case 4:
                        // Adicione aqui a lógica para comprar ingresso
                        break;
                    case 0:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (opcao != 0);
            scanner.close();
        }
    }
    