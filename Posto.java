
import java.time.Duration;

/**
 * Classe que representa um posto de carregamento com informações sobre vagas,
 * localização em quilômetros e tempo médio de carga dos veículos.
 */
public class Posto {

    private final int id;
    private final int km;
    private int totalVagas;
    private int vagasUtilizadas;
    private int qtdCarrosPassaram;
    private Duration tempoMedioPorVeiculo;

    /**
     * Construtor para criar um objeto Posto.
     *
     * @param id Identificador único do posto.
     * @param totalVagas Número total de vagas no posto.
     * @param vagasUtilizadas Número de vagas atualmente em uso.
     * @param km Distância do posto em quilômetros.
     */
    public Posto(int id, int totalVagas, int vagasUtilizadas, int km) {
        this.id = id;
        this.totalVagas = totalVagas;
        this.vagasUtilizadas = vagasUtilizadas;
        this.km = km;
        this.tempoMedioPorVeiculo = Duration.ZERO;
        this.qtdCarrosPassaram = 0;
    }

    /**
     * Obtém o ID do posto.
     *
     * @return ID do posto.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o número total de vagas no posto.
     *
     * @return Total de vagas no posto.
     */
    public int getTotalVagas() {
        return totalVagas;
    }

    /**
     * Define o número total de vagas no posto.
     *
     * @param totalVagas Total de vagas no posto.
     */
    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }

    /**
     * Obtém o número de vagas utilizadas no posto.
     *
     * @return Número de vagas atualmente em uso.
     */
    public int getVagasUtilizadas() {
        return vagasUtilizadas;
    }

    /**
     * Define o número de vagas atualmente em uso no posto.
     *
     * @param vagasUtilizadas Número de vagas em uso.
     */
    public void setVagasUtilizadas(int vagasUtilizadas) {
        this.vagasUtilizadas = vagasUtilizadas;
    }

    /**
     * Obtém a localização do posto em quilômetros.
     *
     * @return Distância do posto em quilômetros.
     */
    public int getKm() {
        return km;
    }

    /**
     * Adiciona um tempo de carga de um veículo e recalcula o tempo médio de
     * carga por veículo no posto.
     *
     * @param tempo Tempo de carga do veículo.
     */
    public void addVeiculoTempoCarregando(Duration tempo) {
        qtdCarrosPassaram++;
        tempoMedioPorVeiculo = Duration.ofNanos(
                (tempoMedioPorVeiculo.toNanos() * (qtdCarrosPassaram - 1) + tempo.toNanos()) / qtdCarrosPassaram);
    }

    /**
     * Obtém o tempo médio de carga por veículo no posto.
     *
     * @return Tempo médio de carga por veículo.
     */
    public Duration getTempoMedioPorVeiculo() {
        return tempoMedioPorVeiculo;
    }

    /**
     * Define o tempo médio de carga por veículo no posto.
     *
     * @param tempoMedioPorVeiculo Tempo médio de carga.
     */
    public void setTempoMedioPorVeiculo(Duration tempoMedioPorVeiculo) {
        this.tempoMedioPorVeiculo = tempoMedioPorVeiculo;
    }

    /**
     * Exibe informações detalhadas do posto.
     */
    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Distância (km): " + km);
        System.out.println("Total de Vagas: " + totalVagas);
        System.out.println("Vagas Utilizadas: " + vagasUtilizadas);
        System.out.println("Quantidade de Carros que Passaram: " + qtdCarrosPassaram);
        System.out.println("Tempo Médio por Veículo: " + tempoMedioPorVeiculo);
    }
}
