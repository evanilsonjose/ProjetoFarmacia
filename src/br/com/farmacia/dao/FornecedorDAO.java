package br.com.farmacia.dao;
import br.com.farmacia.beans.Fornecedor;
import br.com.farmacia.util.ConnectionFactory;
import br.com.farmacia.util.Sql;
import br.com.farmacia.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {
    Util util = new Util();
    List<Fornecedor> clientes = new ArrayList<>();

    public void insereFornecedor(Fornecedor fornecedor) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.INSERE_FORNECEDOR);
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCNPJ());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setString(4, fornecedor.getTelefone());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }

    }

    public Fornecedor buscaFornecedorCodigo(int codFornecedor) throws SQLException {
        Fornecedor fornecedor = new Fornecedor();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.BUSCAR_FORNECEDOR_CODIGO);
            stmt.setInt(1, codFornecedor);
            rs = stmt.executeQuery();

            while (rs.next()) {
                fornecedor.setCodigo(rs.getInt("cod_fornecedor"));
                fornecedor.setNome(rs.getString("nome_fornecedor"));
                fornecedor.setCNPJ(rs.getString("cnpj_fornecedor"));
                fornecedor.setEndereco(rs.getString("endereco_fornecedor"));
                fornecedor.setTelefone(rs.getString("telefone_fornecedor"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return fornecedor;
    }

    public Fornecedor buscaFornecedorCNPJ(String CNPJFornecedor) throws SQLException {
        Fornecedor fornecedor = new Fornecedor();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.BUSCAR_FORNECEDOR_CNPJ);
            stmt.setString(1, CNPJFornecedor);
            rs = stmt.executeQuery();

            while (rs.next()) {
                fornecedor.setCodigo(rs.getInt("cod_fornecedor"));
                fornecedor.setNome(rs.getString("nome_fornecedor"));
                fornecedor.setCNPJ(rs.getString("cnpj_fornecedor"));
                fornecedor.setEndereco(rs.getString("endereco_fornecedor"));
                fornecedor.setTelefone(rs.getString("telefone_fornecedor"));

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return fornecedor;
    }

    public void removeFornecedor(int codFornecedor) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.REMOVE_FORNECEDOR);
            stmt.setInt(1, codFornecedor);
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
    }

    public List<Fornecedor> listaFornecedores() throws SQLException {
        List<Fornecedor> fornecedores = new ArrayList<>();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.LISTAR_FORNECEDOR);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setCodigo(rs.getInt("cod_fornecedor"));
                fornecedor.setNome(rs.getString("nome_fornecedor"));
                fornecedor.setCNPJ(rs.getString("cnpj_fornecedor"));
                fornecedor.setEndereco(rs.getString("endereco_fornecedor"));
                fornecedor.setTelefone(rs.getString("telefone_fornecedor"));
                fornecedores.add(fornecedor);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return fornecedores;
    }

}
