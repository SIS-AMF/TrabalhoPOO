
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Carro {

    protected int id;
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected double capacidadeTotalBateria; // kWh
    protected double autonomiaMaxima; // km
    protected int nivelBateria; // porcentagem 
    protected double odometro;
    protected ArrayList<Recaraga> recargas;
    protected Duration tempoRecarga; // tempo para carregar de 0 a 100

    public Carro(int id, String marca, String modelo, int anoFabricacao, double capacidadeTotalBateria,
            double autonomiaMaxima) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeTotalBateria = capacidadeTotalBateria;
        this.autonomiaMaxima = autonomiaMaxima;
        recargas = new ArrayList<>();
        odometro = 0;
        nivelBateria = 100;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getCapacidadeTotalBateria() {
        return capacidadeTotalBateria;
    }

    public double getAutonomiaMaxima() {
        return autonomiaMaxima;
    }

    public List<Recaraga> getRecargas() {
        return recargas;
    }

    public double getQuantiaParaCompletar() {
        return capacidadeTotalBateria * ( 100 - (double) nivelBateria / 100);
    }

    public void addRecarga(double distancia, Instant data, Posto posto) {
        andar(distancia);
        recargas.add(new Recaraga(getQuantiaParaCompletar(), data, posto));
        nivelBateria = 100;
    }

    public double getAutonomia() {
        return autonomiaMaxima * nivelBateria / 100;
    }

    public boolean andar(double kilometragem) {
        if (this.getAutonomia() - kilometragem <= 0) {
            return false;
        }

        nivelBateria -= kilometragem * 100 / autonomiaMaxima;
        odometro += kilometragem;

        return true;

    }

    public Duration getTempoParaCompletar() {
        return Duration.ofNanos(tempoRecarga.getNano() * nivelBateria / 100);
    }

}
