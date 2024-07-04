import DAO.AdotanteDAO;
import backend.Adotante;

public class App {
    public static void main(String[] args) throws Exception {
        
        Adotante adotante = new Adotante("João Pedro Baldo", "86164872049", "Avenida Cavalhda, 4530", "joaopedro.fig.baldo@gmail.com", "51990119605");
   
        AdotanteDAO adotanteDao = new AdotanteDAO();

        adotanteDao.cadastrarAdotante(adotante);
    }
}

