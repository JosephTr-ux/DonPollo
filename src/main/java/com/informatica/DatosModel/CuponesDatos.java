/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.DatosModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Temporal
 */
public class CuponesDatos {
    
    public boolean asignarCupon(boolean registrado,int newId){
        if(registrado == true){
       String sql = "INSERT INTO cupon_owner (codigo_cupon,id_user,usado) VALUES (?,?,?)";
       try(Connection cn = Conexion.conectar();
             PreparedStatement stmt = cn.prepareStatement(sql)){
             stmt.setString(1, "DONPOLLOBIENVENIDA");
             stmt.setInt(2, newId);
             stmt.setBoolean(3, false);
             stmt.executeQuery();
             return true;
       } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        }else return false;
}
    
    public boolean asignarCupon(LocalDate fechaActual,int id_user){
        LocalDate fecha2 = LocalDate.of(2025, Month.DECEMBER, 25);
        String sql = "INSERT INTO cupon_owner (codigo_cupon,id_user,usado) VALUES (?,?,?)";
        if(fechaActual.isEqual(fecha2)){
            try(Connection cn = Conexion.conectar();
                  PreparedStatement stmt = cn.prepareStatement(sql)){
                  stmt.setString(1, "NAVIPOLLO");
                  stmt.setInt(2, id_user);
                  stmt.setBoolean(3,false);
                  stmt.executeQuery();
                  return true;
            }catch(SQLException ex){
                ex.printStackTrace();
                return false;
            }
        }else return false;
    }
    
    public boolean asignarCupon(int id_user,float cantidadGastada){
        if(cantidadGastada > 300){
            String sql = "INSERT INTO cupon_owner (codigo_cupon,id_user,usado) VALUES (?,?,?)";
            try(Connection cn = Conexion.conectar();
                  PreparedStatement stmt = cn.prepareStatement(sql)){
                        stmt.setString(1, "POLLOVIP");
                        stmt.setInt(2, id_user);
                        stmt.setBoolean(3, false);
                        stmt.executeQuery();
                        return true;
            }catch(SQLException ex){
                ex.printStackTrace();
                return false;
            }
        }else return false;
    }
    
    public boolean asignarCupon(int id_user,int cantidadCompras){
        int cantidad = 0;
        String sql1 = "SELECT COUNT(*) AS TOTAL"
                + " FROM carrito_compras"
                + " WHERE id_user = ?";
        String sql2 = "INSERT INTO cupon_owner (codigo_cupon,id_user,usado) VALUES (?,?,?)";
        try{
                       Connection cn = Conexion.conectar();
                        PreparedStatement stmt = cn.prepareStatement(sql1);
                        stmt.setInt(1, id_user);
                        ResultSet rs = stmt.executeQuery();
                        if(rs.next()){
                            cantidad = rs.getInt("TOTAL");
                        }
                        if(cantidad > 3 ){
                            PreparedStatement stmt2 = cn.prepareStatement(sql2);
                            stmt2.setString(1, "REYDELCRUJIDO");
                            stmt2.setInt(2, id_user);
                            stmt2.setBoolean(3,false);
                            return true;
                        }
                        
            }catch(SQLException ex){
                ex.printStackTrace();
                return false;
            }
        return false;
    }
    
}
