/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo.sql.login;

import com.grupo.conexion.Conexion;
import com.grupo.modelos.Usuario;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhair
 */
public class SqlLogin {

    private final Conexion cc = Conexion.getInstance();
    private final Connection con;
    private static String SQL;
    private static PreparedStatement pst;
    private static Statement st;
    private static ResultSet rs;

    public SqlLogin() {
        this.con = cc.getConnection();
    }

    public boolean agregarUsuario(Usuario usuario) {

        SQL = "INSERT INTO usuarios (id, nombre, apellidos, email, password) values(?,?,?,?,?)";

        try {

            pst = (PreparedStatement) con.prepareStatement(SQL);

            pst.setInt(1, usuario.getId());
            pst.setString(2, usuario.getNombre());
            pst.setString(3, usuario.getApellidos());
            pst.setString(4, usuario.getEmail());
            pst.setString(5, usuario.getPassword());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
            return true;

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error de registro." + e.getMessage(), "Error", 0);
            return false;
        }

    }
}
