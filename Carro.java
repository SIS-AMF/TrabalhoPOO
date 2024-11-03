
import java.time.Instant;
import java.util.ArrayList;

public class Carro {

    protected int id;
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected float capacidadeTotalBateria; // kWh
    protected float autonomiaMaxima; // km
    protected float odometro;
    protected ArrayList<Recaraga> recargas;
    // Tempo medio de recarga?

    public Carro(int id, String marca, String modelo, int anoFabricacao, float capacidadeTotalBateria,
            float autonomiaMaxima) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeTotalBateria = capacidadeTotalBateria;
        this.autonomiaMaxima = autonomiaMaxima;
        recargas = new ArrayList<>();
        odometro = 0;
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

    public float getCapacidadeTotalBateria() {
        return capacidadeTotalBateria;
    }

    public float getAutonomiaMaxima() {
        return autonomiaMaxima;
    }

    public ArrayList<Recaraga> getRecargas() {
        return recargas;
    }

    public void addRecarga(float kWh, Instant data, Posto posto) {
        recargas.add(new Recaraga(kWh, data, posto));
    }

}
