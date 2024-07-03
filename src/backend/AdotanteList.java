package backend;

import java.util.ArrayList;
import java.util.List;

public class AdotanteList {
    private List<Adotante> adotantes;

    public AdotanteList(){
        adotantes = new ArrayList<>();
    }

    public void adicionarAdotante(Adotante adotante){
        adotantes.add(adotante);
    }

    public List<Adotante> getAdotantes() {
        return adotantes;
    }

}