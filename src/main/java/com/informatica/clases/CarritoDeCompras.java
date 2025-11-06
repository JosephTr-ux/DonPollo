/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;
import java.util.ArrayList;

public class CarritoDeCompras {
        //Atributos
    private ArrayList<Producto> nomProductos = new ArrayList<>();
    private Usuarios user;
    private float total;

    //Constructores

    public CarritoDeCompras() {
        nomProductos = new ArrayList<>();
    }

    public CarritoDeCompras(ArrayList<Producto> nomProductos) {
        this.nomProductos = nomProductos;
    }

    public CarritoDeCompras(Usuarios user) {
        this.user = user;
    }

    public ArrayList<Producto> getNomProductos() {
        return nomProductos;
    }

    public void setNomProductos(ArrayList<Producto> nomProductos) {
        this.nomProductos = nomProductos;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    // Metodos

    public void agregarProducto(Producto producto) {
        nomProductos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        nomProductos.remove(producto);
    }

    private float total() {
        float totalsuma = 0;
        for (Producto producto : nomProductos) {
            totalsuma += producto.getPrecio();
        }
        setTotal(totalsuma);
        return totalsuma;
    }


    public void totalConCupon(String code){
        float totalSinCupon = total();
        for (Cupones cupon: user.getCupons()){
            if(cupon.getCodigo().equals(code) &&
                    !cupon.isCuponUsado()){
                cupon.tacharUsadoCupon();
                float totalConCupon = totalSinCupon -  (totalSinCupon * (cupon.getDescuento()/100));
                setTotal(totalConCupon);
                System.out.println("Cupon usado");
                System.out.println("Total a pagar: " + totalConCupon);
            }else{
                System.out.println("Codigo invalido o cupon usado");
            }
        }

    }

    public void mostrarCarrito() {
        System.out.println("Productos en el carrito:");
        for (int i = 0;i<this.nomProductos.size();i++) {
            nomProductos.get(i).getNombre();
            nomProductos.get(i).mostrarInformacion();
            System.out.println("----------------------");
        }
        System.out.println("Total a pagar: Q"+total()+".");
    }

    public void mostrarProductos(){
        System.out.println("Productos en el carrito:");
        for (Producto producto : nomProductos) {
            producto.mostrarInformacion();
            System.out.println("----------------------");
        }
    }
    public void finalizarPedido(){
        System.out.println("Gracias por tu compra");
        getUser().setDeEnvio(null);
        nomProductos.clear();
    }

}
