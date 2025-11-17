/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.informatica.clases;
/**
 *
 * @author dyl4n
 */
public class Cupones {
 
    private String Codigo;
    private float Descuento;
    private boolean cuponUsado;
    private boolean activo;

    public Cupones() {
    }

    public Cupones(String Codigo, float Descuento) {
        this.Codigo = Codigo;
        this.Descuento = Descuento;
    }

    public Cupones(String codigo, float descuento, boolean cuponUsado) {
        Codigo = codigo;
        Descuento = descuento;
        this.cuponUsado = false;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public float getDescuento() {
        return Descuento;
    }

    public void setDescuento(float descuento) {
        Descuento = descuento;
    }

    public boolean isCuponUsado() {
        return cuponUsado;
    }

    public void setCuponUsado(boolean cuponUsado) {
        this.cuponUsado = cuponUsado;
    }

    public void tacharUsadoCupon(){
        this.cuponUsado = true;
    }
    
}
