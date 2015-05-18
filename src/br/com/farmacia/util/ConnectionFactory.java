package br.com.farmacia.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/farmacia", "root", "");
        } catch (SQLException e) {
            System.err.println("SQL erro: " + e.getMessage());
        } catch (Exception ex) {
            System.err.println("Erro na aplicação: " + ex.getMessage());
        }

        return con;
    }

}
