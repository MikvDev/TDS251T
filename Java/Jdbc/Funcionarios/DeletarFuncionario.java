/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Funcionarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;
/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class DeletarFuncionario {
    public static void main(String[] args) {
        final  String URL = "jdbc:mysql://localhost:3306/funcionarios";
        final  String USER = "root";
        final  String PASSWORD = "root";
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o ID do funcionario para excluir: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        
        String sql = "DELETE FROM funcionarios WHERE id = ?";
        
        try (Connection conexao = DriverManager.getConnection(URL,USER,PASSWORD); PreparedStatement stmt = conexao.prepareStatement(sql)){
            stmt.setInt(1, id);
            
            
               int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0 ) {
                System.out.println("Formulario atualizado com sucesso!");
            }else{
                System.out.println("Funcionario não encontrado.");
            }
            
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao iniciar.");
        }finally {
            System.out.println("fim do codigo");
            entrada.close();
        }
        
        
    }
}
