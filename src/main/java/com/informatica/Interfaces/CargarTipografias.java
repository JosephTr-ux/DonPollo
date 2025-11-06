/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.Interfaces;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author Temporal
 */
public class CargarTipografias {
    private Font font = null;
    public String Lobster = "/tipografias/Lobster-Regular.ttf";
    public String BebasNeue = "/tipografias/BebasNeue-Regular.ttf";
    
     public Font fuente( String fontName, int estilo, float tamanio)
    {
         try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
             System.out.println("No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
    
}
