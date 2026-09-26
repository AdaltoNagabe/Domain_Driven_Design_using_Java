package br.com.fiap.api.dao;
import br.com.fiap.api.exception.EntidadeNaoEncontradaException;
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
    private static final String SELECT_SQL = "select * from t_api_imovel";
    private static final String SELECT_BY_ID_SQL = "select * from t_api_imovel where cd_imovel = ?";
    private static final String UPDATE_SQL = "update t_api_imovel set ds_imovel = ?, nr_dimensao = ?, vl_imovel = ? where cd_imovel = ? ";

    public ImovelDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void cadastrar(Imovel imovel) throws SQLException {
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(INSERT_SQL, new String[]{"cd_imovel"})) {
            stmt.setString(1, imovel.getDescricao());
            stmt.setDouble(2, imovel.getDimensao());
            stmt.setDouble(3, imovel.getValor());
            stmt.executeUpdate();
            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next())
                imovel.setCodigo(resultSet.getInt(1));
        }
    }

    private Imovel getImovel(ResultSet resultSet) throws SQLException {
        int codigo = resultSet.getInt("cd_imovel");
        String descricao = resultSet.getString("ds_imovel");
        double dimensao = resultSet.getDouble("nr_dimensao");
        double valor = resultSet.getDouble("vl_imovel");

        return new Imovel(codigo, descricao, dimensao, valor);
    }

    public List<Imovel> listar() throws SQLException {
        List<Imovel> lista;
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(SELECT_SQL)) {

            ResultSet resultSet = stmt.executeQuery();
            lista = new ArrayList<>();
            while (resultSet.next())

                lista.add(getImovel(resultSet));

        }
        return lista;
    }

    public Imovel pesquisarPorId(int id) throws SQLException, EntidadeNaoEncontradaException {
        ResultSet resultSet;
        try (Connection conexao = dataSource.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(SELECT_BY_ID_SQL)) {
            stmt.setInt(1, id);
            resultSet = stmt.executeQuery();
            if (!resultSet.next()) {
                throw new EntidadeNaoEncontradaException("Imovel nao encontrado");
            }
            return getImovel(resultSet);
        }
    }

    public void atualizar(Imovel imovel) throws SQLException, EntidadeNaoEncontradaException {
        try (Connection conexao = dataSource.getConnection();

             PreparedStatement stmt = conexao.prepareStatement(UPDATE_SQL)) {
            stmt.setString(1, imovel.getDescricao());
            stmt.setDouble(2, imovel.getDimensao());
            stmt.setDouble(3, imovel.getValor());
            stmt.setInt(4, imovel.getCodigo());

            int linhas = stmt.executeUpdate(); //Retorna o numero de linhas afetadas no banco de dados
            if (linhas == 0) {
                throw new EntidadeNaoEncontradaException("Produto nao encontrado");
            }
        }

    }
}
