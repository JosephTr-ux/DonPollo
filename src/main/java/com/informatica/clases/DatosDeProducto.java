/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatosDeProducto {

    public static List<Producto> obtenerProductos() {
        List<Producto> lista = new ArrayList<>();

        Connection conn = Conexion.conectar();
        if (conn == null) {
            System.err.println("No se pudo conectar a la base de datos.");
            return lista;
        }

        String sql = "SELECT id_producto, precio, cantidad, descripcion FROM productos";
try (PreparedStatement stmt = conn.prepareStatement(sql);
     ResultSet rs = stmt.executeQuery()) {

    while (rs.next()) {
        // Si precio es DECIMAL, es más seguro leerlo como BigDecimal y convertir:
        double precio = 0.0;
        try {
            java.math.BigDecimal bd = rs.getBigDecimal("precio");
            if (bd != null) precio = bd.doubleValue();
        } catch (SQLException ex) {
            // fallback por si no existe la columna o tipo distinto
            precio = rs.getFloat("precio");
        }

        int id = rs.getInt("id_producto");
        int cantidad = rs.getInt("cantidad");
        String descripcion = rs.getString("descripcion");

        Producto p = new Producto(id,  precio,cantidad, descripcion);
        lista.add(p);
    }

} catch (SQLException e) {
    e.printStackTrace();

    }
return lista;
}}

