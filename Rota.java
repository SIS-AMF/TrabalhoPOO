
import java.time.Duration;
import java.util.ArrayList;

public class Rota {
    private final Cidade inicio, fim;
    private final ArrayList<Posto> postos;


    public Rota(Cidade inicio, Cidade fim) {
        this.inicio = inicio;
        this.fim = fim;
        this.postos = new ArrayList<>();
    }

    public void addPosto(int id, int totalVagas, int vagasUtilizadas, int km, Duration tempoMedioPorVeiculo){
        postos.add(new Posto(id, totalVagas, vagasUtilizadas, km, tempoMedioPorVeiculo));
    }

    public Cidade getInicio() {
        return inicio;
    }

    public Cidade getFim() {
        return fim;
    }
}