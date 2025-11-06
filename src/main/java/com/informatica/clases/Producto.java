/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;
import java.util.ArrayList;

public class Producto {

    private String nombre;
    private float precio;
    private boolean onStock;
    private String descripcion;
    private ArrayList<Producto> productosIncluido;


    public Producto(String nombre, float precio, String descripcion,boolean onStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.onStock = true;
    }

    public Producto(String nombre,  float precio, String descripcion,ArrayList<Producto> productosIncluido) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.productosIncluido = productosIncluido;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean getOnStock() {
        return onStock;
    }

    public void setOnStock(boolean onStock) {
        this.onStock = onStock;
    }

    public boolean isOnStock() {
        return onStock;
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
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: Q" + this.precio);
        System.out.println("Descripcion: " + this.descripcion);
    }
}

