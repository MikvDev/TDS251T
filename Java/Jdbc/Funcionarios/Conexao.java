/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Funcionarios;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Conexao {
    public static void main(String[] args) {
        // URL minima de conexao com o mysql
        //localhost -> banco local
        // 33306 -> porta padrao
        //fucionarios -> nome do banco
        final String url = "jdbc:mysql://localhost:3306/funcionarios";
        final String usuario = "root";
        final String senha = "root";
        try {
            // Abre a conexao (tente abrir a conexao com o banco)
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao executada com sucesso.");
            
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados");
        }
        
    }
}
