package com.informatica.ProductsOnStock;

import com.informatica.clases.Usuarios;
import java.util.ArrayList;

public class UsuariosExistentes {
    private ArrayList<Usuarios> users;
    private Usuarios usuarioActual;

    public UsuariosExistentes() {
        users = new ArrayList<>();
        usuarioActual = null;
       //Usuarios para las pruebas
        users.add(new Usuarios("dylanMatta","dylanM@gmail.com",19220911, "123456"));
        users.add(new Usuarios("cliente1","clientehabitual@gmail.com",83921038 ,"password"));
        users.add(new Usuarios("juan","juan90@gmail.com",90223812,"mipass"));
    }


    public void setUsuarioActual(Usuarios usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public Usuarios getUsuarioActual() {
        return usuarioActual;
    }

    public boolean iniciarSesion(String nombre, String password) {
        for (Usuarios usuarios : users) {
            if (usuarios.getNombre().equals(nombre) && usuarios.getPass().equals(password)) {
                System.out.println("Bienvenido " + nombre + "!");
                setUsuarioActual(usuarios);
                return true;
            }
        }
        System.out.println("Usuario o contraseña incorrectos");
        return false;
    }

    public void cerrarSesion(){
        System.out.println("Sesion Cerrada");
        setUsuarioActual(null);
    }

    public void registrarUsuario(String nombre, String email, int noTelefono, String passw) {
        Usuarios nuevoUsuario = new Usuarios(nombre, email,noTelefono,passw);
        users.add(nuevoUsuario);
        System.out.println("Usuario " + nombre + " registrado exitosamente");
    }
}
