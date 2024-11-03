
import java.time.Instant;

public class Recaraga {
    private final float kWh;
    private final Instant data;
    private final Posto posto;

    public Recaraga(float kWh, Instant data, Posto posto) {
        this.kWh = kWh;
        this.data = data;
        this.posto = posto;
    }

    public float getkWh() {
        return kWh;
    }

    public Instant getData() {
        return data;
    }

    public Posto getPosto() {
        return posto;
    }

}
