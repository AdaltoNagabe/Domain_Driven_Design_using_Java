package br.com.fiap.api.dao;

import br.com.fiap.api.model.Imovel;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ImovelDao {

    private final DataSource dataSource;
    private static final String INSERT_SQL = "insert into t_api_imovel (cd_imovel, ds_imovel, nr_dimensao, vl_imovel) values (sq_t_api_imovel.nextval,?,?,?)";

    public ImovelDao(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void cadastrar(Imovel imovel) throws SQLException {
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(INSERT_SQL, new String[]{"cd_imovel"})){
            stmt.setString(1, imovel.getDescricao());
            stmt.setDouble(2, imovel.getDimensao());
            stmt.setDouble(3, imovel.getValor());
            stmt.executeUpdate();
            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next())
                imovel.setCodigo(resultSet.getInt(1));
        }
    }

    private static Imovel getImovel(ResultSet resultSet) throws SQLException {
        int codigo = resultSet.getInt("cd_imovel");
        String descricao = resultSet.getString("ds_imovel");
        double dimensao = resultSet.getDouble("nr_dimensao");
        double valor = resultSet.getDouble("vl_imovel");

        return new Imovel(codigo, descricao, dimensao, valor);
    }

    public List<Imovel> listar() throws SQLException {
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement()){

        ResultSet resultSet = stmt.executeQuery();

        List<Imovel> lista = new ArrayList<>();

        while (resultSet.next()) {

            lista.add (getImovel(resultSet)); //Toda a parte de recuperar o produto do buscar foi resumido neste metodo

        }
        return lista;
    }




}
