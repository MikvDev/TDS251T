package br.com.lojinha.dao;

import br.com.lojinha.model.Jogo;
import br.com.lojinha.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
// result set é para listar 

public class JogoDAO {

    // o famoso CRUD
    private static final String CREATESQL = "insert into jogo(titulo, plataforma, preco, imagem_path) values(?,?,?,?)";
    private static final String READSQL = "select * from lojinha where id = ? ";
    private static final String READSQL2 = "select * from lojinha order by titulo";
    private static final String UPDATESQL = "update jogo set titulo = ?, plataforma = ?, preco = ?, imagem_path = ? WHERE id = ?";
    private static final String DELETESQL = "delete from jogos where id = ?";

    public void cadastrar(Jogo jogo) {
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(CREATESQL)) {
            stmt.setString(1, jogo.getTitulo());
            stmt.setString(2, jogo.getPlataforma());
            stmt.setDouble(3, jogo.getPreco());
            stmt.setString(4, jogo.getImagemPath());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("ERRO ao Cadastrar: '" + jogo.getTitulo() + "' no banco!");

        }
    }

    public void atualizar(Jogo jogo) {
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareCall(UPDATESQL)) {
            // vai pegar os dados do Jogo e atualizar usando o código SQL
            stmt.setInt(1, jogo.getId());
            stmt.setString(2, jogo.getTitulo());
            stmt.setString(3, jogo.getPlataforma());
            stmt.setDouble(4, jogo.getPreco());
            stmt.setString(5, jogo.getImagemPath());
            stmt.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("ERRO ao atualizar: " + e.getMessage());
        }
    }

    public List<Jogo> listar() {
        List<Jogo> lista = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(READSQL2); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Jogo jogo = new Jogo();
                jogo.setId(rs.getInt("id"));
                jogo.setTitulo(rs.getString("titulo"));
                jogo.setPlataforma(rs.getString("plataforma"));
                jogo.setPreco(rs.getDouble("preco"));
                jogo.setImagemPath(rs.getString("imagem_path"));

                lista.add(jogo);

            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar dados");

        }
        return lista;
    }

    public void Deletar(int id) {
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(DELETESQL)) {
            // vai pegar o id
            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("ERRO ao deletar dado: " + e.getMessage());
        }
    }

    public Jogo buscarPorId(int id) {
        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(READSQL)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                // se encontrou...
                if (rs.next()) {
                    Jogo jogo = new Jogo();
                    jogo.setId(rs.getInt("id"));
                    jogo.setTitulo(rs.getString("titulo"));
                    jogo.setPlataforma(rs.getString("plataforma"));
                    jogo.setPreco(rs.getDouble("preco"));
                    jogo.setImagemPath(rs.getString("imagem_path"));
                    return jogo;
                }
            } catch (Exception e) {
                throw new RuntimeException("Erro ao buscar dado: " + e.getMessage());
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar o dado" + e.getMessage());
        }
        return null;
    }

}
