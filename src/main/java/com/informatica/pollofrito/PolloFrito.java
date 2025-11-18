package com.informatica.pollofrito;

import com.informatica.Interfaces.MenuMain;
import java.util.Scanner;
public class PolloFrito {
    //Clase para contener todos los usuarios y productos
    /*
    static UsuariosExistentes usersTodos = new UsuariosExistentes();
    static ProductosExistentes productosExistentes = new ProductosExistentes();
    static CarritoDeCompras carroOrden;
    static DireccionDeEnvio direccionActual;
    static ArrayList<Cupones> listCupones = new ArrayList<>();
    */

    public static void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        MenuMain login = new MenuMain();
        login.setVisible(true);
        login.setLocationRelativeTo(null);

        /*cupones on stock
        listCupones.add(new Cupones("BienvenidoPolloNuevo", 20.00f));
        listCupones.add(new Cupones("502PolloFrito", 25.00f));
        listCupones.add(new Cupones("21092025", 21.09f));
        listCupones.add(new Cupones("VivaElPollo", 15.00f));


        System.out.println("*--Bienvenido a Plataforma de Pedidos de Comida Rápida – Pollo Frito (Sin Interfaz) - Grupo 4--*");
        System.out.println("1. Iniciar Sesion\n 2. Registrarse");
        System.out.println("Elije tu opcion: ");
        int opcInicio = scanner.nextInt();

        if (opcInicio == 1) {
            if (inicioSesion()) {
                carroOrden = new CarritoDeCompras(usersTodos.getUsuarioActual());
                direccionActual = new DireccionDeEnvio(usersTodos.getUsuarioActual());
                menuInicio();
            }
        } else if (opcInicio == 2) {
            registroUsuarios();
            System.out.println("Deseas iniciar sesion?");
            System.out.println("1. Si\t2. No");
            int opcSiNo = scanner.nextInt();

            if (opcSiNo == 1){
                if (inicioSesion()) {
                    System.out.println("Felicidades has adquirido un nuevo cupon");
                    usersTodos.getUsuarioActual().agregarCupon(listCupones.get(0));
                    carroOrden = new CarritoDeCompras(usersTodos.getUsuarioActual());
                    direccionActual = new DireccionDeEnvio(usersTodos.getUsuarioActual());
                    menuInicio();
                }
            } else if (opcSiNo == 2) {
            } else System.out.println("No seleccionaste ninguna opcion.......");
        } else System.out.println("No has elegido nada");
*/
    }
}

   /* public static boolean inicioSesion() {

        Scanner scanner = new Scanner(System.in);
        String passw, nombre;
        System.out.println("Escribe el nombre de tu cuenta: ");
        nombre = scanner.nextLine();
        System.out.println("Escribe la contrasenia de tu cuenta: ");
        passw = scanner.nextLine();

        if (usersTodos.iniciarSesion(nombre, passw)) return true;
        else return false;
    }

    public static void registroUsuarios(){
        Scanner scanner = new Scanner(System.in);
        String nombre,email,passw;
        int noTelefono;

        System.out.println("Ingresa tu nombre de usuario: ");
        nombre = scanner.nextLine();

        System.out.println("Ingresa tu gmail: ");
        email = scanner.nextLine();

        System.out.println("Ingresa el numero de telefono: ");
        noTelefono = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa tu contrasenia: ");
        passw = scanner.nextLine();

        usersTodos.registrarUsuario(nombre,email,noTelefono,passw);
    }

    public static void menuInicio(){
        Scanner scanner = new Scanner(System.in);
        sleep(2000);
        System.out.println("**------Inicio------**");
        System.out.println("1. Perfil\n2. Menu\n3.Orden\n4. Cupones\n5. Salir");
        System.out.println("\tElija su opcion");
        int a = scanner.nextInt();

        switch (a) {
            case 1 -> {
                System.out.println("*-----Perfil-----*");
                perfilUsuario();
            }
            case 2 -> {
                System.out.println("*-----Menu-----*");
                    menuDeMenus();
            }
            case 3 ->{
                System.out.println("*-----Visualizar mi orden-----*");
                menuOrden();
            }
            case 4 -> {
                System.out.println("*-----Cupones-----*");
                menuCupon();

            }
            case 5 -> System.out.println("Saliendo.............");
            default -> System.out.println("No has elegido una opcion valida");

        }
    }

    public static void menuCupon(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Secciones*****");
        System.out.println("1. Ver cupones disponibles\n2. Ver mis cupones\n3. Volver al inicio");
        int opc = scanner.nextInt();
        switch (opc){
            case 1->{
                for (int i = 0;i< listCupones.size();i++){
                    System.out.println("Cupon "+ i+1 + "\nDescuento: " + listCupones.get(i).getDescuento());
                }
            }
            case 2->{
                usersTodos.getUsuarioActual().mostrarCupones();
            }
            case 3-> menuInicio();
            default -> System.out.println("No has seleccionado nada");

        }
        menuCupon();


    }

    public static void perfilUsuario(){
        usersTodos.getUsuarioActual().mostrarDatosUsuario();
        menuInicio();
    }

    public static void menuDeMenus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que seccion te gustaria visitar?");
        System.out.println("1. Nuevos Productos");
        System.out.println("2. Combos");
        System.out.println("3. Bebidas");
        System.out.println("4. Promociones especiales");
        System.out.println("5. Comida");
        System.out.println("6. Volver al inicio");
        System.out.println("Opcion: ");
        int opc = scanner.nextInt();

        switch (opc){
            case 1 ->{
                System.out.println("***------Nuevos Productos------****");
                menuNewProducts();
            }
            case 2 ->{
                System.out.println("***------Combos------****");
                menuCombos();
            }
            case 3 ->{
                System.out.println("***------Bebidas------****");
                menuBebidas();
            }
            case 4 ->{
                System.out.println("***------Promociones especiales------****");
                menuPromocionEspecial();
            }
            case 5 ->{
                System.out.println("***------Comida------****");
                menuComida();
            }
            case 6 ->{
                System.out.println("***------Volviendo al inicio------****");
                menuInicio();
            }default -> System.out.println("No has elegido una opcion correcta");
        }
    }

    public static void menuNewProducts(){
        int cont = 1;
        for (int i = 0; i <  productosExistentes.getProductosOnStock().size(); i++) {
            if(productosExistentes.getProductosOnStock().get(i).getDescripcion().equals("Nuevo Producto")){
                System.out.println(cont + ". "+ productosExistentes.getProductosOnStock().get(i).getNombre());
                cont += 1;
            }
        }
        if(agregarAlCarrito()){
            System.out.println("Agregacion exitosa");
        }else System.out.println("Hubo un problema en la orden");
        menuDeMenus();

    }
    public static void menuCombos(){
        int cont = 1;
        for (int i = 0; i <  productosExistentes.getProductosOnStock().size(); i++) {
            if(productosExistentes.getProductosOnStock().get(i).getDescripcion().equals("Combo")){
                System.out.println(cont + ". " + productosExistentes.getProductosOnStock().get(i).getNombre());
                cont += 1;
            }
        }
        if(agregarAlCarrito()){
            System.out.println("Agregacion exitosa");
        }else System.out.println("Hubo un problema en la orden");
        menuDeMenus();
    }
    public static void menuBebidas(){
        int cont = 1;
        for (int i = 0; i <  productosExistentes.getProductosOnStock().size(); i++) {
            if(productosExistentes.getProductosOnStock().get(i).getDescripcion().equals("Bebida")){
                System.out.println(cont + ". " + productosExistentes.getProductosOnStock().get(i).getNombre());
                cont += 1;
            }
        }
        if(agregarAlCarrito()){
            System.out.println("Agregacion exitosa");
        }else System.out.println("Hubo un problema en la orden");
        menuDeMenus();
    }
    public static void menuPromocionEspecial(){
        int cont = 1;
        for (int i = 0; i <  productosExistentes.getProductosOnStock().size(); i++) {
            if(productosExistentes.getProductosOnStock().get(i).getDescripcion().equals("Promocion")){
                System.out.println(cont + ". " + productosExistentes.getProductosOnStock().get(i).getNombre());
                cont += 1;
            }
        }
        if(agregarAlCarrito()){
            System.out.println("Agregacion exitosa");
        }else System.out.println("Hubo un problema en la orden");
        menuDeMenus();

    }
    public static void menuComida(){
        int cont = 1;
        for (int i = 0; i <  productosExistentes.getProductosOnStock().size(); i++) {
            if(productosExistentes.getProductosOnStock().get(i).getDescripcion().equals("Comida")){
                System.out.println(cont + ". " + productosExistentes.getProductosOnStock().get(i).getNombre());
                cont += 1;
            }
        }
        if(agregarAlCarrito()){
            System.out.println("Agregacion exitosa");
        }else System.out.println("Hubo un problema en la orden");
    menuDeMenus();
    }

    public static void menuOrden(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Visualizar mi orden");
        System.out.println("2. Agregar al carrito");
        System.out.println("3. Quitar un producto");
        System.out.println("4. Finalizar Pedido");
        System.out.println("5. Volver al inicio");
        System.out.println("Elige a donde iras: ");
        int opc = scanner.nextInt();
        switch (opc){
            case 1 -> {
                carroOrden.mostrarCarrito();
                menuOrden();
            }
            case 2 -> {
                agregarAlCarrito();
                menuOrden();
            }
            case 3 -> {
                quitarProcCarrito();
                menuOrden();
            }
            case 4 ->finalizarPedido();
            case 5 -> menuInicio();
            default -> System.out.println("No elegiste nada");}
    }

    public static boolean agregarAlCarrito(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseas agregar un producto al carro");
        System.out.println("1. Si de una\t2. Tal vez más tarde");
        int opcIng = scanner.nextInt();
        scanner.nextLine();
        if(opcIng == 1){
            System.out.println("Escriba el nombre del producto/combo/promocion: ");
            String producto = scanner.nextLine();
            for (int i = 0; i < productosExistentes.getProductosOnStock().size();i++){
                if (productosExistentes.getProductosOnStock().get(i).getNombre().equalsIgnoreCase(producto)){
                    carroOrden.agregarProducto(productosExistentes.getProductosOnStock().get(i));
                    return true;
                }
            }
        }
        return false;
    }

    public static void quitarProcCarrito(){
        Scanner scanner = new Scanner(System.in);
        carroOrden.mostrarProductos();
        System.out.println("Escriba el nombre del producto/combo/promocion que quitara: ");
        String producto = scanner.nextLine();
        for (int i = 0; i < productosExistentes.getProductosOnStock().size();i++){
            if (productosExistentes.getProductosOnStock().get(i).getNombre().equals(producto)){
                carroOrden.eliminarProducto(productosExistentes.getProductosOnStock().get(i));
            }
        }


    }

    public static void finalizarPedido(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para finalizar tu pedido solo faltan unos datos");
        System.out.println("Deseas agregar un cupon?\n1. Si\n2. No");
        int opc = scanner.nextInt();
        scanner.nextLine();
        if(opc == 1){
            System.out.println("Ingresa el codigo: ");
            String code = scanner.nextLine();
            carroOrden.totalConCupon(code);
            direccionActual.agregarDireccion();
            carroOrden.getUser().setDeEnvio(direccionActual);
            carroOrden.finalizarPedido();

        } else if (opc == 2) {
            direccionActual.agregarDireccion();
            carroOrden.getUser().setDeEnvio(direccionActual);
            carroOrden.finalizarPedido();

        }

    }
*/
