
import java.util.Scanner;

public class Main {

    Sistema sistema = new Sistema();

    static Scanner scanner = new Scanner(System.in);

    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Erro ao tentar limpar o terminal: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        limparTerminal();
        while (true) {
            System.out.println("Sistema de Gestão de Frota de Carros Elétricos");
            System.out.println("1. Cadastro de Veículos Elétricos");
            System.out.println("2. Gestão de Motoristas");
            System.out.println("3. Cadastro de Eletropostos");
            System.out.println("4. Registro de Viagens");
            System.out.println("5. Gestão de Carregamento de Baterias");
            System.out.println("6. Relatórios e Consultas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            limparTerminal();

            switch (opcao) {
                case 1:
                    menuVeiculos();
                    break;
                case 2:
                    menuMotoristas();
                    break;
                case 3:
                    menuEletropostos();
                    break;
                case 4:
                    menuViagens();
                    break;
                case 5:
                    menuCarregamento();
                    break;
                case 6:
                    menuRelatorios();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    // Métodos de cada funcionalidade
    private static void menuVeiculos() {
        System.out.println("1. Adicionar Veículo");
        System.out.println("2. Remover Veículo");
        System.out.println("3. Listar Veículos");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        limparTerminal();
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;

            case 0:
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuMotoristas() {
        System.out.println("1. Cadastrar Motorista");
        System.out.println("2. Listar Motoristas");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        limparTerminal();
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuEletropostos() {
        System.out.println("1. Registrar Eletroposto");
        System.out.println("2. Consultar Eletropostos Disponíveis");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        limparTerminal();
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuViagens() {
        System.out.println("1. Registrar Viagem");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        limparTerminal();
        switch (opcao) {
            case 1:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuCarregamento() {
        System.out.println("1. Registrar Carregamento de Bateria");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        limparTerminal();
        switch (opcao) {
            case 1:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuRelatorios() {
        System.out.println("1. Relatório de veículos com baixa autonomia");
        System.out.println("2. Listar viagens de um motorista");
        System.out.println("3. Consultar histórico de recargas");
        System.out.println("4. Listar veículos que precisam de manutenção");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        limparTerminal();
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
    }
}
