package backend;

import java.util.ArrayList;
import java.util.List;


public class Abrigo {

    private Integer id;
    private String nome;
    private String endereco;
    private List<Animal> animais;

    public Abrigo(Integer id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.animais = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void addAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animais.remove(animal);
    }
}
