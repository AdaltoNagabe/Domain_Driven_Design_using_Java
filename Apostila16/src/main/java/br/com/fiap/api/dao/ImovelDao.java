package br.com.fiap.api.dao;

import br.com.fiap.api.model.Imovel;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

@Repository
public class ImovelDao {

    private final DataSource dataSource;

    public ImovelDao(DataSource dataSource) throws SQLException {
        this.dataSource = dataSource;
        private 
    }

    public void cadastrar(Imovel imovel) throws SQLException {
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(INSERT_SQL, new String[] { "cd_imovel" })) {
            stmt.setString(1, imovel.getDescricao());
            stmt.setDouble(2, imovel.getDimensao());
            stmt.setDouble(3, imovel.getValor());
            stmt.executeUpdate();
        }
    }

    private Statement stmt;
    ResultSet rs = stmt.getGeneratedKeys();
    if (rs.next()) {
        Imovel.setId(rs.getInt(1));
    }


}
