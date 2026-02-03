
package br.com.lojinha.dao;
import br.com.lojinha.model.Jogo;
import br.com.lojinha.util.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class JogoDAO {
    // o famoso CRUD
    private static final String CREATESQL = "insert into jogo(titulo, plataforma, preco, imagem_path) values(?,?,?,?)";
    private static final String READSQL = "select * from lojinha";
    private static final String UPDATESQL = "update jogo set titulo = ?, plataforma = ?, preco = ?, imagem_path = ? WHERE id = ?";
    private static final String DELETESQL = "delete jogo where id = ?";
         
    public void cadastrar(Jogo jogo){
        try(Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(CREATESQL)) {
            stmt.setString(1, jogo.getTitulo());
            stmt.setString(2, jogo.getPlataforma());
            stmt.setDouble(3, jogo.getPreco());
            stmt.setString(4, jogo.getImagemPath());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("ERRO ao conectar ao banco!");
            
        }
    }
    public void atualizar(){
        try (Connection conn  = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareCall(UPDATESQL)){
            
        } catch (Exception e) {
            throw new RuntimeException("ERRO ao atualizar");
        }
    }
    public void ler(){
        try(Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(READSQL)) {
            
        } catch (Exception e) {
            throw new RuntimeException("Erro tentar ler os dados");
        }
    }
    
}
