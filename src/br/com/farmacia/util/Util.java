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

}
