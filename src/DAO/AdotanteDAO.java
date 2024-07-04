package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import backend.Adotante;
import conexao.Conexao;

public class AdotanteDAO {

    public void cadastrarAdotante(Adotante adotante) {
        String sql = "INSERT INTO ADOTANTE (NOME, CPF, EMAIL, ENDERECO, TELEFONE) VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement ps = Conexao.getConexao().prepareStatement(sql)) {
            ps.setString(1, adotante.getNome());
            ps.setString(2, adotante.getCpf());
            ps.setString(3, adotante.getEmail());
            ps.setString(4, adotante.getEndereco());
            ps.setString(5, adotante.getTelefone());
            
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}