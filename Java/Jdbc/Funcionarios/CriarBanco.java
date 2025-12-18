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
public class CriarBanco {
    public static void main(String[] args) {
         final String url = "jdbc:mysql://localhost:3306";
        final String usuario = "root";
        final String senha = "root";
        try  (Connection conexao = DriverManager.getConnection(url, usuario, senha);
              Statement stmt = conexao.createStatement()){
           
            String sql = "CREATE DATABASE IF NOT EXISTS funcionarios";
            stmt.execute(sql);
            System.out.println("Banco  de dados 'funcionarios' criados com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar o banco de dados!");
        }
    }
       
}
