

public class Motorista {
    private final int id; 
    private int nivel; // iniciante, intermediário, avançado
    private final String nome;
    private final String cnh;

    public Motorista(int id, int nivel, String cnh, String nome) {
        this.id = id;
        this.nivel = nivel;
        this.cnh = cnh;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCnh() {
        return cnh;
    }

    public String getNome() {
        return nome;
    }

    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CNH: " + cnh);
        System.out.println("Nivel: " + nivel);
    }

}