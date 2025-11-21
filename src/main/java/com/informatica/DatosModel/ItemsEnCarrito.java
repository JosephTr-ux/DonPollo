/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.DatosModel;

import com.informatica.clases.Producto;
import java.util.ArrayList;

/**
 *
 * @author Temporal
 */
public class ItemsEnCarrito {
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static float precioFinal;

    public static float getPrecioFinal() {
        return precioFinal;
    }

    public static void setPrecioFinal(float precioFinal) {
        ItemsEnCarrito.precioFinal = precioFinal;
    }
    
    
    public static void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public static void eliminarUnproducto(Producto p){
        productos.remove(p);
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList<Producto> productos) {
        ItemsEnCarrito.productos = productos;
    }
    
    public static void vaciarCarrito(){
        productos.clear();
    }
    
    
    
}
