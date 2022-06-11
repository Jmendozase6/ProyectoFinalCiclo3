/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo.modelos;

/**
 *
 * @author jhair
 */
public class Usuario {

    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private String password;

    public Usuario(String nombre, String apellidos, String email, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

}
