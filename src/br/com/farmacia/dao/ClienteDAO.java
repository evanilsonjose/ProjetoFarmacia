package br.com.farmacia.dao;

import br.com.farmacia.beans.Cliente;
import br.com.farmacia.util.ConnectionFactory;
import br.com.farmacia.util.Sql;
import br.com.farmacia.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    Util util = new Util();

    public void insereCliente(Cliente cliente) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        //criando uma query(Execução:alterar/incluir/deletar)
        PreparedStatement stmt = null;
        //executar as consultas (Consulta:buscar)
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.INSERE_CLIENTE);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getRG());
            stmt.setString(3, cliente.getCPF());
            stmt.setString(4, cliente.getDataNasc());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getTelefone());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }

    }

    public Cliente buscaClienteCodigo(int codCliente) throws SQLException {
        Cliente cliente = new Cliente();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.BUSCAR_CLIENTE_CODIGO);
            stmt.setInt(1, codCliente);
            rs = stmt.executeQuery();

            while (rs.next()) {
                cliente.setCodigo(rs.getInt("cod_cliente"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setRG(rs.getString("rg_cliente"));
                cliente.setCPF(rs.getString("cpf_cliente"));
                cliente.setDataNasc(rs.getString("datanasc_cliente"));
                cliente.setEndereco(rs.getString("endereco_cliente"));
                cliente.setTelefone(rs.getString("telefone_cliente"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return cliente;
    }

    public Cliente buscaClienteCpf(String cpfCliente) throws SQLException {
        Cliente cliente = new Cliente();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.BUSCAR_CLIENTE_CPF);
            stmt.setString(1, cpfCliente);
            rs = stmt.executeQuery();

            while (rs.next()) {
                cliente.setCodigo(rs.getInt("cod_cliente"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setRG(rs.getString("rg_cliente"));
                cliente.setCPF(rs.getString("cpf_cliente"));
                cliente.setDataNasc(rs.getString("datanasc_cliente"));
                cliente.setEndereco(rs.getString("endereco_cliente"));
                cliente.setTelefone(rs.getString("telefone_cliente"));

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return cliente;
    }

    public void removeCliente(int codCliente) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.REMOVE_CLIENTE);
            stmt.setInt(1, codCliente);
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
    }

    public void alteraCliente(Cliente cliente) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.ALTERAR_CLIENTE);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getRG());
            stmt.setString(3, cliente.getCPF());
            stmt.setString(4, cliente.getDataNasc());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getTelefone());
            stmt.setInt(7, cliente.getCodigo());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }

    }
    
    public List<Cliente> listaClientes() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.LISTAR_CLIENTE);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("cod_cliente"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setRG(rs.getString("rg_cliente"));
                cliente.setCPF(rs.getString("cpf_cliente"));
                cliente.setDataNasc(rs.getString("datanasc_cliente"));
                cliente.setEndereco(rs.getString("endereco_cliente"));
                cliente.setTelefone(rs.getString("telefone_cliente"));
                clientes.add(cliente);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return clientes;
    }

}
