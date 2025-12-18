/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Funcionarios;

import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;
/**
 * ??  o uso de ?? evita o sql injwect
 * @author MIGUELVARGASFERREIRA
 */
public class NovoFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String url = "jdbc:mysql://localhost:3306/funcionarios";
        final String usuario = "root";
        final String senha = "root";
        // Scanner para entrada de dados
        // Solicitar o nome do funcinario 
        System.out.println("Qual o nome do funcionario que deseja adicinar: ");
        String nome = sc.nextLine();
        
        //Solicita o cargo do funcionario;
        System.out.println("informe o cargo do funcionario: ");
        String cargo = sc.nextLine();
        
        String sql = "INSERT INTO funcionarios(nome, cargo) VALUES (?,?)";
        try  (Connection conexao = DriverManager.getConnection(url, usuario, senha);PreparedStatement stmt = conexao.prepareStatement(sql)){
           
           
            stmt.setString(1,nome);
            stmt.setString(2,cargo);
            
            stmt.executeUpdate();
            
            System.out.println("informação adicionada com sucesso do funcionario");
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar informações !");
        }finally{
            // fecha o scanner
            sc.close();
            
        }
        
    }
}
