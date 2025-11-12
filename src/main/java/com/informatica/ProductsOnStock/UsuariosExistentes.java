package com.informatica.ProductsOnStock;

import com.informatica.clases.Usuarios_1;
import java.util.ArrayList;

public class UsuariosExistentes {
    private ArrayList<Usuarios_1> users;
    private Usuarios_1 usuarioActual;

    public UsuariosExistentes() {
        users = new ArrayList<>();
        usuarioActual = null;
       //Usuarios para las pruebas
        users.add(new Usuarios_1("dylanMatta","dylanM@gmail.com",19220911, "123456"));
        users.add(new Usuarios_1("cliente1","clientehabitual@gmail.com",83921038 ,"password"));
        users.add(new Usuarios_1("juan","juan90@gmail.com",90223812,"mipass"));
    }


    public void setUsuarioActual(Usuarios_1 usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public Usuarios_1 getUsuarioActual() {
        return usuarioActual;
    }

    public boolean iniciarSesion(String nombre, String password) {
        for (Usuarios_1 usuarios : users) {
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
        Usuarios_1 nuevoUsuario = new Usuarios_1(nombre, email,noTelefono,passw);
        users.add(nuevoUsuario);
        System.out.println("Usuario " + nombre + " registrado exitosamente");
    }
}
