package br.com.fiap.apostila13.dao;

import br.com.fiap.apostila13.exception.EntidadeNaoEncontradaException;
import br.com.fiap.apostila13.factory.ConnectionFactory;
import br.com.fiap.apostila13.model.Categoria;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaDao {

    private Connection conexao;

    public CategoriaDao() throws SQLException, ClassNotFoundException {
        conexao = ConnectionFactory.getConnection();
    }
    public void cadastrar(Categoria categoria) throws SQLException {

        //Criar o comando SQL
        PreparedStatement stmt = conexao
                        .prepareStatement("insert into t_jdbc_categoria (cd_categoria, nm_categoria) " +
                        "values (sq_t_jdbc_categoria.nextval, ?)", new String[]{"cd_categoria"});
        //Setar os paramentros no comando SQL
        stmt.setString(1, categoria.getNome());
        //Executar o comando SQL no banco
        stmt.executeUpdate();
        //Recuperar o id gerado
        ResultSet resultSet = stmt.getGeneratedKeys();
        if (resultSet.next()){
            categoria.setCodigo(resultSet.getInt(1));
        }
    }

}
