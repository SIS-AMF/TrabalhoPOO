

public class Motorista {
    private final int id; 
    private int nivel; // iniciante, intermediário, avançado
    private final String cnh, nome;

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
        System.out.println(id);
        System.out.println(nivel);
        System.out.println(cnh);
        System.out.println(nome);
    }

}