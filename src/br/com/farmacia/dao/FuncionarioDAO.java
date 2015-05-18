package br.com.farmacia.dao;

import br.com.farmacia.beans.Funcionario;
import br.com.farmacia.util.ConnectionFactory;
import br.com.farmacia.util.Sql;
import br.com.farmacia.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    Util util = new Util();

    public void insereFuncionario(Funcionario funcionario) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        //criando uma query(Execução:alterar/incluir/deletar)
        PreparedStatement stmt = null;
        //executar as consultas (Consulta:buscar)
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.INSERE_FUNCIONARIO);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRG());
            stmt.setString(3, funcionario.getCPF());
            stmt.setString(4, funcionario.getDataNasc());
            stmt.setString(5, funcionario.getEndereco());
            stmt.setString(6, funcionario.getTelefone());
            stmt.setString(7, funcionario.getFuncao());
            stmt.setDouble(8, funcionario.getSalario());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }

    }

    public Funcionario buscaFuncionarioCodigo(int codFuncionario) throws SQLException {
        Funcionario funcionario = new Funcionario();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.BUSCAR_FUNCIONARIO_CODIGO);
            stmt.setInt(1, codFuncionario);
            rs = stmt.executeQuery();

            while (rs.next()) {
                funcionario.setCodigo(rs.getInt("cod_funcionario"));
                funcionario.setNome(rs.getString("nome_funcionario"));
                funcionario.setRG(rs.getString("rg_funcionario"));
                funcionario.setCPF(rs.getString("cpf_funcionario"));
                funcionario.setDataNasc(rs.getString("datanasc_funcionario"));
                funcionario.setEndereco(rs.getString("endereco_funcionario"));
                funcionario.setTelefone(rs.getString("telefone_funcionario"));
                funcionario.setFuncao(rs.getString("funcao_funcionario"));
                funcionario.setSalario(rs.getDouble("salario_funcionario"));

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return funcionario;
    }

    public Funcionario buscaFuncionarioCpf(String cpfFuncionario) throws SQLException {
        Funcionario funcionario = new Funcionario();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.BUSCAR_FUNCIONARIO_CPF);
            stmt.setString(1, cpfFuncionario);
            rs = stmt.executeQuery();

            while (rs.next()) {
                funcionario.setCodigo(rs.getInt("cod_funcionario"));
                funcionario.setNome(rs.getString("nome_funcionario"));
                funcionario.setRG(rs.getString("rg_funcionario"));
                funcionario.setCPF(rs.getString("cpf_funcionario"));
                funcionario.setDataNasc(rs.getString("datanasc_funcionario"));
                funcionario.setEndereco(rs.getString("endereco_funcionario"));
                funcionario.setTelefone(rs.getString("telefone_funcionario"));
                funcionario.setFuncao(rs.getString("funcao_funcionario"));
                funcionario.setSalario(rs.getDouble("salario_funcionario"));

            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return funcionario;
    }

    public void removeFuncionario(int codFuncionario) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.REMOVE_FUNCIONARIO);
            stmt.setInt(1, codFuncionario);
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
    }

    public void alteraFuncionario(Funcionario funcionario) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.ALTERAR_FUNCIONARIO);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRG());
            stmt.setString(3, funcionario.getCPF());
            stmt.setString(4, funcionario.getDataNasc());
            stmt.setString(5, funcionario.getEndereco());
            stmt.setString(6, funcionario.getTelefone());
            stmt.setString(7, funcionario.getFuncao());
            stmt.setDouble(8, funcionario.getSalario());
            stmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }

    }

    public List<Funcionario> listaFuncionarios() throws SQLException {
        List<Funcionario> funcionarios = new ArrayList<>();
        Connection con = new ConnectionFactory().getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(Sql.LISTAR_FUNCIONARIO);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setCodigo(rs.getInt("cod_funcionario"));
                funcionario.setNome(rs.getString("nome_funcionario"));
                funcionario.setRG(rs.getString("rg_funcionario"));
                funcionario.setCPF(rs.getString("cpf_funcionario"));
                funcionario.setDataNasc(rs.getString("datanasc_funcionario"));
                funcionario.setEndereco(rs.getString("endereco_funcionario"));
                funcionario.setTelefone(rs.getString("telefone_funcionario"));
                funcionario.setFuncao(rs.getString("funcao_funcionario"));
                funcionario.setSalario(rs.getDouble("salario_funcionario"));
                funcionarios.add(funcionario);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            util.fechaConexao(con, stmt, rs);
        }
        return funcionarios;
    }

}
