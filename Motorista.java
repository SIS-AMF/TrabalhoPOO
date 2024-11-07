
/**
 * Classe que representa um motorista com informações de identificação,
 * nível de experiência e número da CNH.
 */
public class Motorista {

    private final int id;
    private NivelExperiencia nivel;
    private final String nome;
    private final String cnh;

    /**
     * Construtor para criar um objeto Motorista.
     *
     * @param id Identificador único do motorista.
     * @param nivel Nível de experiência do motorista.
     * @param cnh Número da carteira nacional de habilitação (CNH) do motorista.
     * @param nome Nome do motorista.
     */
    public Motorista(int id, NivelExperiencia nivel, String cnh, String nome) {
        this.id = id;
        this.nivel = nivel;
        this.cnh = cnh;
        this.nome = nome;
    }

    /**
     * Obtém o ID do motorista.
     *
     * @return ID do motorista.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o nível de experiência do motorista.
     *
     * @return Nível de experiência do motorista.
     */
    public NivelExperiencia getNivel() {
        return nivel;
    }

    /**
     * Define o nível de experiência do motorista.
     *
     * @param nivel Nível de experiência (INICIANTE, INTERMEDIARIO, AVANCADO).
     */
    public void setNivel(NivelExperiencia nivel) {
        this.nivel = nivel;
    }

    /**
     * Obtém o número da CNH do motorista.
     *
     * @return Número da CNH do motorista.
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * Obtém o nome do motorista.
     *
     * @return Nome do motorista.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Exibe as informações detalhadas do motorista.
     */
    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CNH: " + cnh);
        System.out.println("Nível: " + nivel);
    }

    /**
     * Enumeração que define os níveis de experiência de um motorista.
     */
    public enum NivelExperiencia {
        INICIANTE,
        INTERMEDIARIO,
        AVANCADO
    }
}
