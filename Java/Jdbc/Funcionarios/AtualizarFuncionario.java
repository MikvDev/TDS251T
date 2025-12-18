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
public class AtualizarFuncionario {
    // atualizar o nome e o corpo de um funcionario com base no id;
    
    public static void main(String[] args) {
        
        final  String URL = "jdbc:mysql://localhost:3306/funcionarios";
        final  String USER = "root";
        final  String PASSWORD = "root";
        
       Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o id do usuario: ");
        int id = entrada.nextInt();
        
        entrada.nextLine(); // limpa  o buffer;
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Informe o novo cargo: ");
        String cargo = entrada.nextLine();
        
        String sql = "UPDATE funcionarios SET nome = ?, cargo = ? WHERE id = ?";
        
        
        // 
        
        
        try (Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement stmt = conexao.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.setString(2, cargo);
            stmt.setInt(3, id);
            
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0 ) {
                System.out.println("Formulario atualizado com sucesso!");
            }else{
                System.out.println("Funcionario não encontrado.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao iniciar.");
        }finally{
            System.out.println("Codigo finalizado.");
            entrada.close();
        }
       
        
        
    }
}
