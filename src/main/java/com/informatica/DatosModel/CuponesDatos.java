/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.DatosModel;

import com.informatica.clases.Cupones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;

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
    
    public boolean asignarCupon(int id_user){
        int cantidad = 0;
        String sql1 = "SELECT COUNT(*) AS TOTAL"
                + " FROM carrito_compras"
                + " WHERE id_user = ? AND estado = true";
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
    
    public Cupones usarCupon(int id_usuario,String codeCupon){
        boolean usado = false;
        float descuento = 2f;
        String sql = "SELECT usado FROM cupon_owner WHERE codigo_cupon = ? AND id_user = ?  ";
        String sql1 = "SELECT descuento FROM cupones WHERE codigo = ? ";
        String sql2 = "UPDATE cupon_owner SET usado = ? WHERE id_user = ? AND codigo_cupon = ?";
        try(Connection cn = Conexion.conectar();
              PreparedStatement stmt = cn.prepareStatement(sql)){
                stmt.setString(1, codeCupon);
                stmt.setInt(2,id_usuario);
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                     usado = rs.getBoolean("usado");
                }
                if(usado == false){
                    try(PreparedStatement stmt1 = cn.prepareStatement(sql1)){
                        stmt1.setString(1,codeCupon);
                        ResultSet rs1 = stmt1.executeQuery();
                        if(rs1.next()){
                             descuento = rs1.getFloat("descuento");
                        }
                    }
                    try(PreparedStatement stmt2 = cn.prepareStatement(sql2)){
                        stmt2.setBoolean(1, true);
                        stmt2.setInt(2, id_usuario);
                        stmt2.setString(3, codeCupon);
                        ResultSet rs2 = stmt2.executeQuery();
                        return new Cupones(
                                codeCupon,
                                descuento,
                                true
                        ); //true que si lo encontro y lo uso
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Cupon ya usado","No te pases de listo eh", 0);
                    return null; // Ya esta usado el cupon u ocurrio un error
                
                }
                
                
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
        return null;
    }
    
}
