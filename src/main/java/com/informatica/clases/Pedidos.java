/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;
import java.util.Date;

public class Pedidos {

    private int numeroDeOrden;
    private Date fecha;
    private String estado;

    
    public Pedidos() {
    }


    public Pedidos(int numeroDeOrden, Date fecha, String estado) {
        this.numeroDeOrden = numeroDeOrden;
        this.fecha = fecha;
        this.estado = estado;
    }


    public int getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(int numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void finalizarPedido() {
        this.estado = "Finalizado";
        System.out.println("El pedido ha sido finalizado.");
    }
    
    public void cancelarPedido(){
        this.estado = "Cancelado";
        System.out.println("El pedido ha sido Cancelado.");
    }


    public void mostrarResumen() {
        System.out.println("Número de Orden: "+numeroDeOrden);
        System.out.println("Fecha: "+fecha);
        System.out.println("Estado: "+estado);
    }
}
