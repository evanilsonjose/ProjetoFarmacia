package br.com.farmacia.dao;

import br.com.farmacia.beans.Fornecedor;
import br.com.farmacia.beans.Medicamento;
import br.com.farmacia.util.ConnectionFactory;
import br.com.farmacia.util.Sql;
import br.com.farmacia.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicamentoDAO {

    Util util = new Util();

    public void insereMedicamento(Medicamento medicamento) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.INSERE_MEDICAMENTO);
            stmt.setString(1, medicamento.getNome());
            stmt.setDouble(2, medicamento.getPrecoCusto());
            stmt.setDouble(3, medicamento.getPrecoVenda());
            stmt.setInt(4, medicamento.getQtdEstoque());
            stmt.setInt(5, medicamento.getFornecedor().getCodigo());
            stmt.setString(6, medicamento.getGenerico());
            stmt.setString(7, medicamento.getPrescricaoMedica());
            stmt.setString(8, medicamento.getCategoria());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
    }

    public Medicamento buscaMedicamentoCodigo(int codMedicamento) throws SQLException {
        Medicamento medicamento = null;
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.BUSCAR_MEDICAMENTO_CODIGO);
            stmt.setInt(1, codMedicamento);
            rs = stmt.executeQuery();

            while (rs.next()) {
                medicamento = new Medicamento();
                Fornecedor fornecedor = new Fornecedor();
                medicamento.setCodigo(rs.getInt("cod_medicamento"));
                medicamento.setNome(rs.getString("nome_medicamento"));
                medicamento.setPrecoVenda(rs.getDouble("preco_venda_medicamento"));
                medicamento.setPrecoCusto(rs.getDouble("preco_custo_medicamento"));
                medicamento.setQtdEstoque(rs.getInt("qtd_estoque_medicamento"));
                fornecedor.setCodigo(rs.getInt("cod_fornecedor"));
                fornecedor.setNome(rs.getString("nome_fornecedor"));
                medicamento.setFornecedor(fornecedor);
                medicamento.setPrescricaoMedica(rs.getString("prescricao_medicamento"));
                medicamento.setGenerico(rs.getString("generico_medicamento"));
                medicamento.setCategoria(rs.getString("categoria_medicamento"));

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return medicamento;
    }

    public void removeMedicamento(int codMedicamento) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.REMOVE_MEDICAMENTO);
            stmt.setInt(1, codMedicamento);
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
    }

    public void alteraMedicamento(Medicamento medicamento) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.ALTERAR_MEDICAMENTO);
            stmt.setString(1, medicamento.getNome());
            stmt.setDouble(2, medicamento.getPrecoCusto());
            stmt.setDouble(3, medicamento.getPrecoVenda());
            stmt.setInt(4, medicamento.getQtdEstoque());
            stmt.setInt(5, medicamento.getFornecedor().getCodigo());
            stmt.setString(6, medicamento.getGenerico());
            stmt.setString(7, medicamento.getPrescricaoMedica());
            stmt.setString(8, medicamento.getCategoria());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
    }

    public List<Medicamento> listaMedicamento() throws SQLException {
        List<Medicamento> medicamentos = new ArrayList<>();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.LISTAR_MEDICAMENTO);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Medicamento medicamento = new Medicamento();
                Fornecedor fornecedor = new Fornecedor();
                medicamento.setCodigo(rs.getInt("cod_medicamento"));
                medicamento.setNome(rs.getString("nome_medicamento"));
                medicamento.setPrecoVenda(rs.getDouble("preco_venda_medicamento"));
                medicamento.setPrecoCusto(rs.getDouble("preco_custo_medicamento"));
                medicamento.setQtdEstoque(rs.getInt("qtd_estoque_medicamento"));
                fornecedor.setCodigo(rs.getInt("cod_fornecedor"));
                fornecedor.setNome(rs.getString("nome_fornecedor"));
                medicamento.setFornecedor(fornecedor);
                medicamento.setPrescricaoMedica(rs.getString("prescricao_medicamento"));
                medicamento.setGenerico(rs.getString("generico_medicamento"));
                medicamento.setCategoria(rs.getString("categoria_medicamento"));
                medicamentos.add(medicamento);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return medicamentos;
    }

}
