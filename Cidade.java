
/**
 * Representa uma cidade com ID e nome.
 */
public class Cidade {

    /**
     * Identificação única da cidade.
     */
    private final int id;

    /**
     * Nome da cidade.
     */
    private final String nome;

    /**
     * Construtor para criar uma cidade com ID e nome especificados.
     *
     * @param id Identificação única da cidade.
     * @param nome Nome da cidade.
     */
    public Cidade(int id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    /**
     * Obtém o nome da cidade.
     *
     * @return Nome da cidade.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o ID da cidade.
     *
     * @return ID da cidade.
     */
    public int getId() {
        return id;
    }

    /**
     * Exibe informações sobre a cidade.
     */
    public void exibir() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
    }
}
