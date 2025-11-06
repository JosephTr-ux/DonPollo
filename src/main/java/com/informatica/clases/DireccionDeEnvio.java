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
    private int CodigoPostal;
    private String colonia;
    private Usuarios userActual;

    public DireccionDeEnvio() {
    }

    public DireccionDeEnvio(Usuarios userActual) {
        this.userActual = userActual;
    }

    public DireccionDeEnvio(String calle, String ciudad, int codigoPostal, String colonia) {
        Calle = calle;
        Ciudad = ciudad;
        CodigoPostal = codigoPostal;
        this.colonia = colonia;
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

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public String getColonia() {
        return colonia;
    }

    public Usuarios getUserActual() {
        return userActual;
    }

    public void setUserActual(Usuarios userActual) {
        this.userActual = userActual;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void agregarDireccion(){
        Scanner scanner = new Scanner(System.in);
        String calle,ciudad,colonia;
        int codePostal;

        System.out.println("Agrega la calle: ");
        calle = scanner.nextLine();

        System.out.println("Agrega la ciudad: ");
        ciudad = scanner.nextLine();

        System.out.println("Agrega el codigo postal: ");
        codePostal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agrega la colonia: ");
        colonia = scanner.nextLine();

        setCalle(calle);
        setCiudad(ciudad);
        setCodigoPostal(codePostal);
        setColonia(colonia);
    }

    
}
