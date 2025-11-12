/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;
import java.util.ArrayList;

public class Producto {

    
    private int id_producto;
    private double precio;
    private int cantidad;
    private String descripcion;
    private ArrayList<Producto> productosIncluido;

    public Producto(int id_producto, double precio, int cantidad, String descripcion) {
        this.id_producto = id_producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public Producto(int id_producto, double precio, int cantidad, String descripcion, ArrayList<Producto> productosIncluido) {
        this.id_producto = id_producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.productosIncluido = productosIncluido;
    }

    public Producto() {
    }
    
    
    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Producto> getProductosIncluido() {
        return productosIncluido;
    }

    public void setProductosIncluido(ArrayList<Producto> productosIncluido) {
        this.productosIncluido = productosIncluido;
    }
    
    
    
   
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.descripcion);
        System.out.println("Precio: Q" + this.precio);
        System.out.println("Descripcion: " + this.descripcion);
    }
}

