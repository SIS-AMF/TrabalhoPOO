public class Viagem {
    private final Rota rota;
    private final Carro carro;
    private final Motorista motorista;

    public Viagem(Rota rota, Carro carro, Motorista motorista) {
        this.rota = rota;
        this.carro = carro;
        this.motorista = motorista;
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
