package com.informatica.clases;


import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios_1 {
    private String nombre;
    private String email;
    private int numeroTelefono;
    private String pass;
    private DireccionDeEnvio deEnvio;
    private ArrayList<Cupones> cupons;

    public Usuarios_1() {
    }

    public Usuarios_1(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }
    
    

    public Usuarios_1(String nombre, String email, int numeroTelefono, String pass) {
        this.nombre = nombre;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.pass = pass;
    }

    public Usuarios_1(String nombre, String email, int numeroTelefono, String pass, ArrayList<Cupones> cupons) {
        this.nombre = nombre;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.pass = pass;
        this.cupons = cupons;
    }

    public ArrayList<Cupones> getCupons() {
        return cupons;
    }

    public void setCupons(ArrayList<Cupones> cupons) {
        this.cupons = cupons;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public DireccionDeEnvio getDeEnvio() {
        return deEnvio;
    }

    public void setDeEnvio(DireccionDeEnvio deEnvio) {
        this.deEnvio = deEnvio;
    }

    public void agregarCupon(Cupones c){
        cupons.add(c);
        System.out.println("Cupon nuevo agregado!");
    }

    public void mostrarCupones(){
        if (!cupons.isEmpty()){
            for (int i = 0;i<cupons.size();i++){
                System.out.println(i+1 + ". Cupon: \nCodigo:" + cupons.get(i).getCodigo() + "Descuento: " + cupons.get(i).getDescuento());
            }
            }else System.out.println("Actualmente no tienes cupones");
    }

    public void mostrarDatosUsuario(){
        System.out.println("Nombre de Usuario: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Telefono: "+ numeroTelefono);
        System.out.println("Contrasenia: *******");
    }

}