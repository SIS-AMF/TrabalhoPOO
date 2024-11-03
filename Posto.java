
import java.time.Duration;

public class Posto {

    private final int id, km;

    private int totalVagas, vagasUtilizadas;
    private Duration tempoMedioPorVeiculo;

    // Simultaneo?

    public Posto(int id, int totalVagas, int vagasUtilizadas, int km, Duration tempoMedioPorVeiculo) {
        this.id = id;
        this.totalVagas = totalVagas;
        this.vagasUtilizadas = vagasUtilizadas;
        this.km = km;
        this.tempoMedioPorVeiculo = tempoMedioPorVeiculo;
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

    public Duration getTempoMedioPorVeiculo() {
        return tempoMedioPorVeiculo;
    }

    public void setTempoMedioPorVeiculo(Duration tempoMedioPorVeiculo) {
        this.tempoMedioPorVeiculo = tempoMedioPorVeiculo;
    }

}
