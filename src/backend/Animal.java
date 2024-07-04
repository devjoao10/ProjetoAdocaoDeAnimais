package backend;

public class Animal {
    private Integer id;
    private char tipo;
    private String raca;
    private Integer idade;
    private String nome;

    public Animal(char tipo, String raca, Integer idade, String nome) {
        this.id = id;
        this.raca = raca;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String especie) {
        this.raca = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}