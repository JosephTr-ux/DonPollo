/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.DatosModel;

import java.sql.*;

/**
 *
 * @author Temporal
 */
public class DatosDeDireccion {
    public boolean insertarDireccion(String calle, String ciudad, String departamento) {
        
        // Obtener el ID del usuario actual
        int idUsuario = SesionUsuario.getIdUsuarioActual();
        System.out.println("ID Usuario actual: " + idUsuario);
        
        if (idUsuario <= 0) {
            System.out.println("Error: No hay usuario en sesión");
            return false;
        }
        
        String sql = "INSERT INTO direccion_envio (id_usuario, calle, ciudad, departamento) VALUES(?,?,?,?)";
        
        try {
            Connection conexion = Conexion.conectar();
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, idUsuario);
            ps.setString(2, calle);
            ps.setString(3, ciudad);
            ps.setString(4, departamento);
            
            System.out.println("Ejecutando");
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idDireccion = rs.getInt(1);
                        System.out.println(" Dirección guardada con ID: " + idDireccion);
                    }
                }
            }
            
            ps.close();
            conexion.close();
            
            return true;
            
        } catch (Exception e) {
            System.out.println("ERROR SQL: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
}
