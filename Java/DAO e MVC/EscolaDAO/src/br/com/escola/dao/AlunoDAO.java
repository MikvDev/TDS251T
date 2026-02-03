/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.dao;

import br.com.escola.config.ConnectionFactory;
import br.com.escola.model.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class AlunoDAO {

    public void cadastrar(Aluno aluno) {
        // sql com ? (paremetros) para evitar sql injection
        String sql = "insert into alunos (nome) values (?)";
        // Tratamento de possíveis erros | no caso fecha automaticamente a conexão e o statement
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            
            //executa o insert (podemos utilizar o executeUpdate para insert/update/delete)
            stmt.executeUpdate();
        } catch (Exception e) {
            throw  new  RuntimeException("Erro ao cadastrar aluno", e);
        }
    
    }
    
    // read: listar todos
     public List<Aluno> list(){
        // sql para buscar todos 
        String sql = "SELECT id, nome from alunos";
        List <Aluno> alunos = new  ArrayList<>();
         try(Connection conn = ConnectionFactory.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) 
             
              {
                  while(rs.next()){
                      int id  = rs.getInt("id");
                      String nome = rs.getNString("nome");
                      
                      Aluno aluno = new Aluno(id, nome);
                      alunos.add(aluno);
                      
                      
                  }
         } catch (Exception e) {
             throw new RuntimeException("Erro ao listar alunos!", e);
         }
         return alunos;
    }
   
}
