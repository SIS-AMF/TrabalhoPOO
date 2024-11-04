
import java.time.Duration;

public class Posto {

    private final int id, km;

    private int totalVagas, vagasUtilizadas, qtdCarrosPassaram;
    private Duration tempoMedioPorVeiculo;

    // Simultaneo?

    public Posto(int id, int totalVagas, int vagasUtilizadas, int km) {
        this.id = id;
        this.totalVagas = totalVagas;
        this.vagasUtilizadas = vagasUtilizadas;
        this.km = km;
        this.tempoMedioPorVeiculo = Duration.ZERO;
        qtdCarrosPassaram = 0;
    }

    public int getId() {
        return id;
    }

    public int getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }

    public int getVagasUtilizadas() {
        return vagasUtilizadas;
    }

    public void setVagasUtilizadas(int vagasUtilizadas) {
        this.vagasUtilizadas = vagasUtilizadas;
    }

    public int getKm() {
        return km;
    }

    public void addVeiculoTempoCarregando(Duration tempo) {
        qtdCarrosPassaram++;
        tempoMedioPorVeiculo = Duration.ofNanos(
                (tempoMedioPorVeiculo.toNanos() * (qtdCarrosPassaram - 1) + tempo.toNanos()) / qtdCarrosPassaram);
    }

    public Duration getTempoMedioPorVeiculo() {
        return tempoMedioPorVeiculo;
    }

    public void setTempoMedioPorVeiculo(Duration tempoMedioPorVeiculo) {
        this.tempoMedioPorVeiculo = tempoMedioPorVeiculo;
    }

}
