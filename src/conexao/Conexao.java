package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/adocaoanimal";
    private static final String USER = "root";
    private static final String PASSWORD = "12345678";

    private static Connection conexao;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConexao() {
        try {
            if (conexao == null) {
                conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}