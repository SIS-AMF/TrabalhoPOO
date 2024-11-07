
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Sistema sistema = new Sistema();
    static Scanner scanner = new Scanner(System.in);

    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao tentar limpar o terminal: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        limparTerminal();
        while (true) {
            System.out.println();
            System.out.println("Sistema de Gestão de Frota de Carros Elétricos");
            System.out.println("1. Veiculos");
            System.out.println("2. Motoristas");
            System.out.println("3. Cidades");
            System.out.println("4. Rotas");
            System.out.println("5. Eletropostos");
            System.out.println("6. Viagens");
            System.out.println("7. Relatórios e Consultas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            limparTerminal();

            switch (opcao) {
                case 1 -> menuVeiculos();
                case 2 -> menuMotoristas();
                case 3 -> menuCidades();
                case 4 -> menuRotas();
                case 5 -> menuEletropostos();
                case 6 -> menuViagens();
                case 7 -> menuRelatorios();
                case 0 -> {
                    System.out.println("Encerrando o sistema.");
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
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
        scanner.nextLine();

        limparTerminal();
        switch (opcao) {
            case 1 -> sistema.addVeiculo();
            case 2 -> {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                sistema.removeVeiculo(id);
            }
            case 3 -> sistema.listVeiculo();

            case 0 -> {
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuMotoristas() {
        System.out.println("1. Cadastrar Motorista");
        System.out.println("2. Listar Motoristas");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        limparTerminal();
        switch (opcao) {
            case 1 -> sistema.addMotorista();
            case 2 -> sistema.listarMotoristas();
            case 0 -> {
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuRotas() {
        System.out.println("1. Registrar Rota");
        System.out.println("2. Consultar Rotas");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        limparTerminal();
        switch (opcao) {
            case 1 -> sistema.addRota();
            case 2 -> sistema.listRotas();
            case 0 -> {
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuEletropostos() {
        sistema.listRotas();

        System.out.print("Digite o ID de uma Rota: ");
        int idRota = scanner.nextInt();
        scanner.nextLine();

        Rota rota = sistema.geRota(idRota);

        System.out.println("1. Registrar Eletroposto");
        System.out.println("2. Consultar Eletropostos Disponíveis");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        limparTerminal();
        switch (opcao) {
            case 1 -> sistema.addPosto(rota);
            case 2 -> sistema.listEletropostosDisponivel(rota);
            case 0 -> {
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuViagens() {
        System.out.println("1. Registrar Viagem");
        System.out.println("2. Listar Viagens: ");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        limparTerminal();
        switch (opcao) {
            case 1 -> sistema.realizarViagem();
            case 2 -> sistema.realizarViagem();
            case 0 -> {
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuRelatorios() {
        System.out.println("1. Relatório de veículos com baixa autonomia 20%");
        System.out.println("2. Listar viagens de um motorista");
        System.out.println("3. Consultar histórico de recargas de um Carro");
        System.out.println("4. Listar veículos que precisam de manutenção");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        limparTerminal();
        switch (opcao) {
            case 1 -> sistema.relatorioAutonomiaInferior();
            case 2 -> {
            }
            case 3 -> sistema.relatoriaDeRecargasDeUmCarro();
            case 4 -> {
            }
            case 0 -> {
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void menuCidades() {
        System.out.println("1. Adicionar Cidade");
        System.out.println("2. Listar Cidades");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        limparTerminal();
        switch (opcao) {
            case 1 -> sistema.addCidade();
            case 2 -> sistema.listCidades();
            case 0 -> {
            }
            default -> System.out.println("Opção inválida, tente novamente.");
        }
    }
}
