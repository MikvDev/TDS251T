/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mercado.dao;
import br.com.mercado.config.ConnectionFactory;
import java.sql.PreparedStatement;
import br.com.mercado.model.Produto;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class ProdutoDAO {
    public void cadastrar(Produto produto){
        
            String sql = "Insert into produtos(nome, preco, setor) values(?,?,?)";
            try(Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.PrepareStament(sql)) { 
            stmt.setString(1, produto.getNome());
            stmt.setInt(1, produto.getPreco());
            stmt.setString(1,produto.getSetor());
            
            stmt.executeQuery();
        } catch (Exception e) {
                throw new RuntimeException("Erro ao cadastrar produto!");
            e.printStackTrace();
        }
        
    }
  public List<Produto> list(){
      
      String sql = "Select nome, preco, setor from produtos";
      
      
      List <Produto> produtos(){
      
      
  }
      
  }
    
    
}
