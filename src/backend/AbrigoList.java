package backend;

import java.util.ArrayList;
import java.util.List;

public class AbrigoList {
    private List<Abrigo> abrigos;

    public AbrigoList(){
        abrigos = new ArrayList<>();
    }

    public void adicionarAbrigo(Abrigo abrigo){
        abrigos.add(abrigo);
    }

    public List<Abrigo> getAbrigos() {
        return abrigos;
    }

}