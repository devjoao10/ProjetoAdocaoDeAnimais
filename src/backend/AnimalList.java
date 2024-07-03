package backend;

import java.util.ArrayList;
import java.util.List;
public class AnimalList {
    private List<Animal> animais;

    public AnimalList(){
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public List<Animal> filtrarAnimaisPorTipo(char tipo) {
        List<Animal> filtrados = new ArrayList<>();
        for (Animal animal : animais) {
            if (animal.getTipo() == tipo) {
                filtrados.add(animal);
            }
        }
        return filtrados;
    }

}

