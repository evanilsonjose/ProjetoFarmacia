package br.com.farmacia.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {

    public void fechaConexao(Connection con, PreparedStatement stmt, ResultSet rs) throws SQLException {
        if (con != null) {
            con.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (rs != null) {
            rs.close();
        }
    }

    public String inverteData(String dataTemp) {
        String diaNasc = dataTemp.substring(0, 2);
        String mesNasc = dataTemp.substring(3, 5);
        String anoNasc = dataTemp.substring(6, 10);
        String dataNasc = anoNasc + "-" + mesNasc + "-" + diaNasc;
        return dataNasc;
    }

}
