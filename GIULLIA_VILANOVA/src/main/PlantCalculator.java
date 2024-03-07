    package main;

    import java.util.Scanner;

    public class PlantCalculator {
        private static Scanner scanner = new Scanner(System.in);
        private static boolean validEntry = false;

        public static void main(String[] args) {
            int option = 0;
            int confirm = 0;

            do {
                validEntry = false;

                while (!validEntry) {
                    exibitMenu();
                    option = getValidInputInt("Escolha uma opção:", 3);

                    switch (option) {
                        case 1:
                            calculateTotalPrice();
                            validEntry = true;
                            break;
                        case 2:
                            calculateChange();
                            break;
                        case 3:
                            confirm = getValidInputInt("Você realmente deseja fechar a aplicação?\n[1] - Sim\n[2] - Não", 2);
                            switch (confirm) {
                                case 1:
                                    System.out.println("Fechando aplicação.");
                                    break;
                                case 2:
                                    validEntry = true;
                                    break;
                                default:
                                    System.out.println("Opção inválida, tente novamente.");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                            break;
                    }
                }
            } while (!(option == 3 && confirm == 1));

            scanner.close();
        }

        private static void exibitMenu() {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");
        }

        private static int getValidInputInt(String prompt) {
            int input = 0;
            validEntry = false;

            while (!validEntry) {
                System.out.println(prompt);

                try {
                    input = scanner.nextInt();
                    validEntry = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Você precisa digitar um número inteiro.");
                    scanner.nextLine();
                }
            }

            return input;
        }

        private static double getValidInputDouble(String prompt) {
            double input = 0.0;
            validEntry = false;

            while (!validEntry) {
                System.out.println(prompt);

                try {
                    input = scanner.nextDouble();
                    validEntry = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Você precisa digitar um número decimal.");
                    scanner.nextLine();
                }
            }

            return input;
        }

        private static int getValidInputInt(String prompt, int maxOption) {
            int input = getValidInputInt(prompt);

            while (input < 1 || input > maxOption) {
                System.out.println("Opção inválida, tente novamente.");
                input = getValidInputInt(prompt);
            }

            return input;
        }

        private static void calculateTotalPrice() {
            int quantity = getValidInputInt("Digite a quantidade da planta:");
            double price = getValidInputDouble("Digite o preço unitário da planta:");

            double total = quantity * price;
            System.out.printf("O preço total da venda é: %.2f\n", total);

            validEntry = false;
        }

        private static void calculateChange() {
            System.out.print("Digite o valor recebido pelo cliente: R$ ");
            double amountReceived = getValidInputDouble("");
            double totalValue = getValidInputDouble("Digite o valor total da compra: R$ ");

            double change = amountReceived - totalValue;
            System.out.printf("O troco a ser dado ao cliente é: %.2f\n", change);

            validEntry = false;
        }
    }
