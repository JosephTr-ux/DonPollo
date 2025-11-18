/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;
import java.util.ArrayList;

public class CarritoDeCompras {
        //Atributos
    private ArrayList<Producto> nomProductos = new ArrayList<>();
    private int id_carrito;
    private int id_usuario;
    private String codigo_cupon;
    

    //Constructores

    public CarritoDeCompras(int id_carrito, int id_usuario, String codigo_cupon) {
        this.id_carrito = id_carrito;
        this.id_usuario = id_usuario;
        this.codigo_cupon = codigo_cupon;
    }

    public CarritoDeCompras() {
    }

    public ArrayList<Producto> getNomProductos() {
        return nomProductos;
    }

    public void setNomProductos(ArrayList<Producto> nomProductos) {
        this.nomProductos = nomProductos;
    }

    public int getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCodigo_cupon() {
        return codigo_cupon;
    }

    public void setCodigo_cupon(String codigo_cupon) {
        this.codigo_cupon = codigo_cupon;
    }
    
    
    
    }


