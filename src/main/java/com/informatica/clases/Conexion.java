/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection conn = null;
    private static final String bd = "donpollo";
    private static final String host = "localhost";
    private static final String puerto = "3307";
    private static final String user = "root";
    private static final String pass = "admin";
    private static final String sURL = "jdbc:mariadb://"+host + ":" +puerto+"/"+bd;

    public Conexion() {
    }
    
    
    public static Connection conectar(){
        try{
            conn = DriverManager.getConnection(sURL, user, pass);
            JOptionPane.showMessageDialog(null, "✅ Conexión exitosa a la base de datos", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "❌ Error al conectar: " + ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
    public void desconectar(){
    try{ conn.close();
        JOptionPane.showMessageDialog(null, "✅ Se cerro con exitosa la base de datos", "Éxito", JOptionPane.INFORMATION_MESSAGE);}
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "❌ Error al Desconectarse: " + ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
}