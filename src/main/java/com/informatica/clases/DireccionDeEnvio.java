/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;
import java.util.Scanner;

/**
 *
 * @author dyl4n
 */
public class DireccionDeEnvio {

    private String Calle;
    private String Ciudad;
    private String Departamento;
    private Usuarios_1 userActual = new Usuarios_1();

    public DireccionDeEnvio() {
    }

    public DireccionDeEnvio(String Calle, String Ciudad, String Departamento) {
        this.Calle = Calle;
        this.Ciudad = Ciudad;
        this.Departamento = Departamento;
    }
    
    

    public DireccionDeEnvio(Usuarios_1 userActual) {
        this.userActual = userActual;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public Usuarios_1 getUserActual() {
        return userActual;
    }

    public void setUserActual(Usuarios_1 userActual) {
        this.userActual = userActual;
    }

   

 

    
}
