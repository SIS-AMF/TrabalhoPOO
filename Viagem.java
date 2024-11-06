import java.time.Instant;

public class Viagem {

    private final Rota rota;
    private final Carro carro;
    private final Motorista motorista;
    private double kilometragem;
    private String destino;

    public Viagem(Rota rota, Carro carro, Motorista motorista) {
        this.rota = rota;
        this.carro = carro;
        this.motorista = motorista;
        kilometragem = rota.getDistancia();
        destino = rota.getFim().getNome();
    }

    private void registrarRecarga(Posto posto, double distancia) {
        carro.addRecarga(distancia, Instant.now(), posto);
        posto.addVeiculoTempoCarregando(carro.getTempoParaCompletar());
    }

    public boolean registrarViagem() {
        // se autonomia dura toda viagem
        if (carro.getAutonomia() < rota.getDistancia()) {
            carro.andar(rota.getDistancia());
        } // se autonomia dura ate o posto mais proximo e se a distancia entre postos e maior do que a autonomia
        else if (carro.getAutonomia() < rota.getPrimeiroPosto().getKm() && carro.getAutonomiaMaxima() < rota.maiorDistanciaSemPostoDisponiveis()) {
            Posto last = null;
            double distancia = 0;
            for (Posto posto : rota.getPostosDisponiveis()) {
                distancia = posto.getKm() - distancia;
                registrarRecarga(posto, distancia);
                last = posto;
            }
            if (last != null) {
                carro.andar(rota.getDistancia() - last.getKm());
            }

        }
        return true;

    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Rota getRota() {
        return rota;
    }

    public Carro getCarro() {
        return carro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

}
