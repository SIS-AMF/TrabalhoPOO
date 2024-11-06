
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Rota {

    private final int id;
    private final Cidade inicio;
    private final Cidade fim;
    private final ArrayList<Posto> postos;
    private int idPostos;
    private double distancia;

    public Rota(int id, Cidade inicio, Cidade fim, double distancia) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.postos = new ArrayList<>();
        this.distancia = distancia;
        idPostos = 0;
    }

    private void ordenarPostosPorDistancia() {
        postos.sort(Comparator.comparingDouble(Posto::getKm));
    }

    private Posto getPrimeiroPostoDisponivel() {
        return getPostosDisponiveis().get(0);
    }

    public List<Posto> getPostosDisponiveis() {
        ArrayList<Posto> lista = new ArrayList<>();
        for (Posto posto : postos) {
            if (posto.getTotalVagas() > posto.getVagasUtilizadas()) {
                lista.add(posto);
            }
        }
        return lista;
    }

    public List<Posto> getPostos() {
        return postos;
    }

    public boolean addPosto(int totalVagas, int km) {
        if (km < 0 && km > distancia) {
            return false;
        }
        postos.add(new Posto(idPostos + 1, totalVagas, 0, km));
        idPostos++;
        ordenarPostosPorDistancia();
        return true;
    }

    public void consultarPostosDisponiveis() {
        for (Posto posto : postos) {
            if (posto.getTotalVagas() > posto.getVagasUtilizadas()) {
                System.out.println("Km: " + posto.getKm());
                System.out.println("Total Vagas: " + posto.getTotalVagas());
                System.out.println("Vagas Disponiveis" + (posto.getVagasUtilizadas() - posto.getTotalVagas()));
                System.out.println("Distancia: " + distancia + "km");
            }
        }
    }

    public Posto getPrimeiroPosto() {
        return postos.get(0);
    }

    public double maiorDistanciaSemPosto() {
        Posto before = getPrimeiroPostoDisponivel();
        double maiorDistancia = (double) before.getKm() - 0;

        for (Posto posto : postos) {
            double diferenca = (double) posto.getKm() - before.getKm();
            if (diferenca > maiorDistancia) {
                maiorDistancia = distancia;
            }
            before = posto;
        }

        double diferenca = distancia - before.getKm();
        if (diferenca > maiorDistancia) {
            maiorDistancia = distancia;
        }

        return maiorDistancia;
    }

    public double maiorDistanciaSemPostoDisponiveis() {
        Posto before = getPrimeiroPostoDisponivel();
        double maiorDistancia = (double) before.getKm() - 0;

        for (Posto posto : getPostosDisponiveis()) {
            double diferenca = (double) posto.getKm() - before.getKm();
            if (diferenca > maiorDistancia) {
                maiorDistancia = distancia;
            }
            before = posto;
        }

        double diferenca = distancia - before.getKm();
        if (diferenca > maiorDistancia) {
            maiorDistancia = distancia;
        }

        return maiorDistancia;
    }

    public Cidade getInicio() {
        return inicio;
    }

    public Cidade getFim() {
        return fim;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getId() {
        return id;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Origem: " + inicio.getNome());
        System.out.println("Destino: " + fim.getNome());
        System.out.println("Quantia de Postos: " + postos.size());
        System.out.println("Distancia: " + distancia);
    }
}
