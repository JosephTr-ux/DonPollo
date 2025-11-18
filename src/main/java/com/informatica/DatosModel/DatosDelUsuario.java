/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.DatosModel;

import com.informatica.clases.Usuarios_1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marco
 */
public class DatosDelUsuario {
    public DatosDelUsuario(){
    }
    
    public Usuarios_1 agregarUsuario(Usuarios_1 usuario){
        int filasAfectadas = -1;
        String sql = "INSERT INTO users (nombre, email, no_telefono, contrasenia) VALUES(?,?,?,?)";
        try{
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setInt(3, usuario.getNumeroTelefono());
            ps.setString(4, usuario.getPass());
            
            filasAfectadas = ps.executeUpdate();
            
            if(filasAfectadas > 0){
                try(ResultSet rs = ps.getGeneratedKeys()){
                    if(rs.next()){
                        usuario.setId(rs.getInt(1));
                        return usuario;
                    }
                }
            }
            
            
            return  null;
        }catch(SQLException e){
            System.out.println("Error al insertar datos: "+e.getMessage());
            return null;
        }
    }
        
        public Usuarios_1 iniciarSesion(Usuarios_1 usuario){
        String sql = "SELECT users.id, users.nombre, users.no_telefono FROM users WHERE users.email = ? AND users.contrasenia = ?";
        try(   Connection connection = Conexion.conectar();
                   PreparedStatement ps = connection.prepareStatement(sql);
                ) {
                ps.setString(1, usuario.getEmail());
                ps.setString(2, usuario.getPass());
                try(ResultSet resultSet = ps.executeQuery()){
                    if(resultSet.next()){
                        Usuarios_1 users = new Usuarios_1();
                        users.setId(resultSet.getInt("id"));
                        users.setNombre(resultSet.getString("nombre"));
                        users.setNumeroTelefono(resultSet.getInt("no_telefono"));
                        users.login(usuario);
                        return users;
                    }
                }
                
        } catch (SQLException e) {
            return null;
        }
        return null;
    }
}
