/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Conexion {
    private static String login = "root";
    private static String pass = "1234";
    private final String url = "jdbc:mysql://localhost/cursoonline?relaxAutoCommit=true";

    public Connection getConeccion(Connection conn) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, pass);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Conexion no realizada");
        }

        return conn;
    }
    
}