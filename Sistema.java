
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Sistema {

    private ArrayList<Rota> rotas;
    private int idRotas;
    private ArrayList<Viagem> viagens;
    private ArrayList<Cidade> cidades;
    private int idCidades;
    private ArrayList<Motorista> motoristas;
    private int idMotoristas;
    private ArrayList<Carro> carros;
    private int idCarros;
    private Scanner scanner = new Scanner(System.in);

    public Sistema() {
        rotas = new ArrayList<>();
        viagens = new ArrayList<>();
        motoristas = new ArrayList<>();
        carros = new ArrayList<>();
        cidades = new ArrayList<>();
        idCarros = 0;
        idMotoristas = 0;
        idRotas = 0;
        idCidades = 0;
    }

    public void addCidade() {
        System.out.print("Nome: ");
        String nome = scanner.next();

        cidades.add(new Cidade(idCidades + 1, nome));
        idCidades++;
    }

    public void listCidades() {
        for (Cidade cidade : cidades) {
            System.out.println();
            cidade.exibir();
        }
    }

    public void addRota() {
        System.out.print("Cidade Inicio ID: ");
        int ini = scanner.nextInt();
        System.out.print("Cidade Fim ID: ");
        int fim = scanner.nextInt();
        System.out.print("Distancia (km): ");
        double distancia = scanner.nextDouble();

        Optional<Cidade> cidadeIni = cidades.stream().filter(cidade -> cidade.getId() == ini).findFirst();
        Optional<Cidade> cidadeFim = cidades.stream().filter(cidade -> cidade.getId() == fim).findFirst();

        if (cidadeIni.isPresent() && cidadeFim.isPresent()) {
            rotas.add(new Rota(idRotas + 1, cidadeIni.get(), cidadeFim.get(), distancia));
            idRotas++;
            System.out.println("Rota adicionada com sucesso!");
        } else {
            System.out.println("Erro: Cidade de início ou fim não encontrada.");
        }
    }

    public void listRotas() {
        for (Rota rota : rotas) {
            System.out.println();
            rota.exibir();
        }
    }

    public void addMotorista() {
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("CNH: ");
        String cnh = scanner.next();
        System.out.print("Nivel: ");
        int nivel = scanner.nextInt();
        motoristas.add(new Motorista(idMotoristas + 1, nivel, cnh, nome));
        idMotoristas++;
    }

    public void listarMotoristas() {
        for (Motorista motorista : motoristas) {
            System.out.println();
            motorista.exibir();
        }
    }

    public void realizarViagem(Rota rota, Carro carro, Motorista motorista) {
        viagens.add(new Viagem(rota, carro, motorista));
    }

    public void addVeiculo() {
        System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Modelo: ");
        String modelo = scanner.next();
        System.out.print("Ano Fabricação: ");
        int ano = scanner.nextInt();
        System.out.print("Capacidade Total Bateria (kWh): ");
        double capacidadeBateria = scanner.nextDouble();
        System.out.print("Autonomia Maxima (km): ");
        double autonomiaMaxima = scanner.nextDouble();
        carros.add(new Carro(idCarros + 1, marca, modelo, ano, capacidadeBateria, autonomiaMaxima));
        idCarros++;
    }

    public void listVeiculo() {
        for (Carro carro : carros) {
            System.out.println();
            carro.exibir();
        }
    }

    public void removeVeiculo(int id) {
        carros.removeIf(carro -> carro.getId() == id);
    }

    public Rota geRota(int id) {
        return rotas.get(id);
    }

    public void addPosto(Rota rota) {
        System.out.print("Total de Vagas: ");
        int totalVagas = scanner.nextInt();
        System.out.print("Em qual kilometro se localiza: ");
        int kmDaRota = scanner.nextInt();
        rota.addPosto(totalVagas, kmDaRota);
    }

    public void listEletropostosDisponivel(Rota rota) {
        rota.consultarPostosDisponiveis();
    }
}
