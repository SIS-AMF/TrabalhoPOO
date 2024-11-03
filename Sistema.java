
import java.util.ArrayList;

public class Sistema {
    ArrayList<Rota> rotas;
    ArrayList<Viagem> viagens;
    ArrayList<Motorista> motoristas;
    ArrayList<Carro> carros;

    public Sistema() {
        rotas = new ArrayList<>();
        viagens = new ArrayList<>();
        motoristas = new ArrayList<>();
        carros = new ArrayList<>();
    }

    public void cadastrarMotorista(int id, int nivel, String cnh, String nome) {
        motoristas.add(new Motorista(id, nivel, cnh, nome));
    }

    public void listarMotoristas() {
        for (Motorista motorista : motoristas) {
            System.out.println();
            motorista.exibir();
        }
    }

}
