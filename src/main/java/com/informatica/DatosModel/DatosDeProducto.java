/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.DatosModel;

import com.informatica.clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatosDeProducto {
    
    public Producto encontrarProducto(int id_Producto){
        String sql = "SELECT producto.id_producto,producto.precio,producto.cantidad,producto.descripcion FROM producto WHERE id_producto = ?";
        try (Connection cn = Conexion.conectar();
            PreparedStatement stmt = cn.prepareStatement(sql)){
            stmt.setInt(1, id_Producto);
            ResultSet resultado = stmt.executeQuery();
            if(resultado.next()){
                return new Producto(
                        resultado.getInt("id_producto"),
                        resultado.getFloat("precio"),
                        resultado.getInt("cantidad"),
                        resultado.getString("descripcion")
                );
            }
            }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
        public Producto encontrarComboPromo(int id_combo_promo){
        String sql = "SELECT combo_promos.id_combo, combo_promos.nombre,combo_promos.descripcion,combo_promos.precio,combo_promos.tipo FROM combo_promos WHERE id_combo = ?";
        try (Connection cn = Conexion.conectar();
            PreparedStatement stmt = cn.prepareStatement(sql)){
            stmt.setInt(1, id_combo_promo);
            ResultSet resultado = stmt.executeQuery();
            if(resultado.next()){
                return new Producto(
                        resultado.getInt("id_combo"),
                        resultado.getFloat("precio"),
                        resultado.getString("descripcion"),
                        resultado.getString("tipo"),
                        resultado.getString("nombre")
                );
            }
            }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    
}

