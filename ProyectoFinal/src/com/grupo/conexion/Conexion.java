/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo.conexion;

import com.grupo.modelos.Usuario;
import com.grupo.sql.login.SqlLogin;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhair
 */
public class Conexion {

    public static void main(String[] args) {
        Conexion.getInstance().getConnection();
        Usuario usuario = new Usuario("U - Nombre", "U - Apellidos", "U - Email", "U - Password");
        SqlLogin sql = new SqlLogin();
        sql.agregarUsuario(usuario);
    }

    private static Connection connect;
    private static Conexion instancia;
    private static final String DB = "bd_proyecto_final";
    private static final String USER = "jhin";
    private static final String PASS = "abc123";
    private static final String URL = "jdbc:mysql://localhost/" + DB;

    private Conexion() {

    }

    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConnection() {

        try {

            Class.forName("org.gjt.mm.mysql.Driver");
            connect = (Connection) DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa");
            return connect;

        } catch (ClassNotFoundException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de conexión" + e.getMessage());

        }

        return connect;
    }

    public void closeConnection() throws SQLException {

        try {
            connect.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            connect.close();
        } finally {
            connect.close();
        }

    }
}
