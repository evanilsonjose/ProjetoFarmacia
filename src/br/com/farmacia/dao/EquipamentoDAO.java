package br.com.farmacia.dao;

import br.com.farmacia.beans.Equipamento;
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

public class EquipamentoDAO {
    
    Util util = new Util();

    public void insereEquipamento(Equipamento equipamento) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.INSERE_EQUIPAMENTO);
            stmt.setString(1, equipamento.getNome());
            stmt.setDouble(2, equipamento.getPrecoVenda());
            stmt.setDouble(3, equipamento.getPrecoCusto());
            stmt.setInt(4, equipamento.getQtdEstoque());
            stmt.setInt(5, equipamento.getFornecedor().getCodigo());
            stmt.setString(6, equipamento.getModoOperacao());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }

    }
    
    public Equipamento buscaEquipamentoCodigo(int codEquipamento) throws SQLException {
        Equipamento equipamento = null;
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.BUSCAR_EQUIPAMENTO_CODIGO);
            stmt.setInt(1, codEquipamento);
            rs = stmt.executeQuery();

            while (rs.next()) {
                equipamento = new Equipamento();
                Fornecedor fornecedor = new Fornecedor();
                equipamento.setCodigo(rs.getInt("cod_equipamento"));
                equipamento.setNome(rs.getString("nome_equipamento"));
                equipamento.setPrecoVenda(rs.getDouble("preco_venda_equipamento"));
                equipamento.setPrecoCusto(rs.getDouble("preco_custo_equipamento"));
                equipamento.setQtdEstoque(rs.getInt("qtd_estoque_equipamento"));
                fornecedor.setCodigo(rs.getInt("cod_fornecedor"));
                fornecedor.setNome(rs.getString("nome_fornecedor"));
                equipamento.setFornecedor(fornecedor);
                equipamento.setModoOperacao(rs.getString("modo_operacao_equipamento"));
                
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return equipamento;
    }
    
    public void removeEquipamento(int codEquipamento) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.REMOVE_EQUIPAMENTO);
            stmt.setInt(1, codEquipamento);
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
    }
    
    public void alteraEquipamento(Equipamento equipamento) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.ALTERAR_EQUIPAMENTO);
            stmt.setString(1, equipamento.getNome());
            stmt.setDouble(2, equipamento.getPrecoVenda());
            stmt.setDouble(3, equipamento.getPrecoCusto());
            stmt.setInt(4, equipamento.getQtdEstoque());
            stmt.setInt(5, equipamento.getFornecedor().getCodigo());
            stmt.setString(6, equipamento.getModoOperacao());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }

    }
    
    public List<Equipamento> listaEquipamento() throws SQLException {
        List<Equipamento> equipamentos = new ArrayList<>();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.LISTAR_EQUIPAMENTO);
            rs = stmt.executeQuery();
            while (rs.next()) {            
                Equipamento equipamento = new Equipamento();
                Fornecedor fornecedor = new Fornecedor();
                equipamento.setCodigo(rs.getInt("cod_equipamento"));
                equipamento.setNome(rs.getString("nome_equipamento"));
                equipamento.setPrecoVenda(rs.getDouble("preco_venda_equipamento"));
                equipamento.setPrecoCusto(rs.getDouble("preco_custo_equipamento"));
                equipamento.setQtdEstoque(rs.getInt("qtd_estoque_equipamento"));
                fornecedor.setCodigo(rs.getInt("cod_fornecedor"));
                fornecedor.setNome(rs.getString("nome_fornecedor"));
                equipamento.setFornecedor(fornecedor);
                equipamento.setModoOperacao(rs.getString("modo_operacao_equipamento"));
                equipamentos.add(equipamento);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return equipamentos;
    }
    
}
