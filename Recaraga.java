
import java.time.Instant;

public class Recaraga {

    private final double kWh;
    private final Instant data;
    private final Posto posto;

    public Recaraga(double kWh, Instant data, Posto posto) {
        this.kWh = kWh;
        this.data = data;
        this.posto = posto;
    }

    public double getkWh() {
        return kWh;
    }

    public Instant getData() {
        return data;
    }

    public Posto getPosto() {
        return posto;
    }

    public void exibir() {
        System.out.println("kWh: " + kWh);
        System.out.println("Data: " + data);
        System.out.println("Posto:----");
        posto.exibir();
    }

}
