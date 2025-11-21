/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.DatosModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Temporal
 */
public class DatosCarrito {
    public int obtenerIdCarritoPorUsuario(int idUsuario) {

        String buscar = "SELECT id_carrito FROM carrito_compras WHERE id_usuario = ? AND estado = ?";
        String crear  = "INSERT INTO carrito_compras (id_usuario) VALUES (?)";

        try (Connection cn = Conexion.conectar();
             PreparedStatement buscarStmt = cn.prepareStatement(buscar)) {

            buscarStmt.setInt(1, idUsuario);
            buscarStmt.setBoolean(2, false);
            ResultSet rs = buscarStmt.executeQuery();
            
            if(rs.next()){
                return rs.getInt("id_carrito");
            }

            try (PreparedStatement crearStmt = cn.prepareStatement(crear, Statement.RETURN_GENERATED_KEYS)) {
                crearStmt.setInt(1, idUsuario);
                crearStmt.executeUpdate();

                ResultSet generated = crearStmt.getGeneratedKeys();
                if (generated.next()) {
                    return generated.getInt(1);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1; // error
    }
    
    public boolean agregarCarritoDetalle(int id_compra,int id_item,String tipo_item,float precio){
        String sql = "INSERT INTO carrito_detalle (id_carrito, id_item, tipo_item, cantidad, precio) "
                + "VALUES (?, ?, ?, ?, ?)";
        
        try(Connection cn = Conexion.conectar();
              PreparedStatement stmt = cn.prepareStatement(sql)){
              stmt.setInt(1, id_compra);
              stmt.setInt(2, id_item);
              stmt.setString(3, tipo_item);
              stmt.setInt(4, 1);
              stmt.setFloat(5, precio);
              stmt.executeQuery();
               return true;
        
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    public void finalizarCompra(int id_usuario){
        String sql = "UPDATE carrito_compras SET estado = ? WHERE id_usuario = ? AND  estado = ?";
        try(Connection cn = Conexion.conectar();
              PreparedStatement ps = cn.prepareStatement(sql)){
                ps.setInt(1,1);
                ps.setInt(2, id_usuario);
                ps.setInt(3, 0);
                ps.executeQuery();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    
    }
    
    public void finalizarCompra(int id_usuario,float precio, String cuponCode){
        String sql = "UPDATE carrito_compras SET codigo_cupon = ?, precio_final = ? WHERE id_usuario = ? AND  estado = ?";
        try(Connection cn = Conexion.conectar();
              PreparedStatement ps = cn.prepareStatement(sql)){
                ps.setString(1,cuponCode);
                ps.setFloat(2, precio);
                ps.setInt(3, id_usuario);
                ps.setInt(4, 0);
                ps.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }

}

