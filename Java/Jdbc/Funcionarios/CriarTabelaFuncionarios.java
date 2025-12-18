/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Funcionarios;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class CriarTabelaFuncionarios {
    public static void main(String[] args) {
         final String url = "jdbc:mysql://localhost:3306/funcionarios";
        final String usuario = "root";
        final String senha = "root";
        try  (Connection conexao = DriverManager.getConnection(url, usuario, senha);
              Statement stmt = conexao.createStatement()){
           
            String sql = "CREATE TABLE IF NOT EXISTS funcionarios(" 
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "nome VARCHAR(80) NOT NULL," 
                    + "cargo VARCHAR(50) NOT NULL"
                    + ")" ;
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso em 'funcionarios'");
        } catch (SQLException e) {
            System.out.println("Erro ao criar o tabela !");
        }
    }
}
