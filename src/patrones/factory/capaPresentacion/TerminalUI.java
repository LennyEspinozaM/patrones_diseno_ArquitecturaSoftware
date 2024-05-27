package patrones.factory.capaPresentacion;

import patrones.factory.capaNegocio.ManejadorPedidos;

import java.util.Scanner;

public class TerminalUI {
    private Scanner sc;
    private ManejadorPedidos manejadorPedidos;
    private String bienvenida = "  ---- PIZZA FACTORY ---- ";
    private String eligeSucursal = "Elige una sucursal para realizar tu pedido :";
    private String eligeValorCorrecto = "Elegir un valor correcto.";
    private String eligeProdcuto = "Elegir Producto";
    public TerminalUI(ManejadorPedidos manejadorPedidos){
        this.sc = new Scanner(System.in);
        this.manejadorPedidos = manejadorPedidos;
    }
    public void run(){
        boolean isRun = true;
        int option=0;
        while(isRun) {
            mostrarTexto(bienvenida); //Mostrar el texto de bienvenida
            elegirSucursales();
            elegirProducto();
            mostrarEstadoPedido();
            mostrarProcesamientoPizza();
            mandarPedido();
        }
        mostrarTexto("Cerrando programa");
    }

    private void mostrarEstadoPedido(){
        mostrarTexto("Se ha realizado el pedido de " + manejadorPedidos.getProductoElegido() + " en la sucrusal " + manejadorPedidos.getSucursalElegida());
    }
    private void mostrarProcesamientoPizza(){
        mostrarTexto("" + manejadorPedidos.getSucursalElegida() );
        //PizzaProducto pizza = sucre.ordenarPizza("queso");
//        System.out.println("Anna ordena la pizza: " + pizza.getNombre());
//        System.out.println("\n");
    }
    private String construirCadenaDeOpciones(String[]opciones){
        int index = 0;
        String ans = "";
        for(String opt:opciones){
            index++;
            ans+= index + ".- " + opt + "\n";
        }
        return ans.trim();
    }

    private void elegirProducto(){
        mostrarTexto(eligeProdcuto);
        boolean estaActivo = true;
        String sucursalElegida = manejadorPedidos.obtenerSucursalElegida();
        String[]listaProductos = this.manejadorPedidos.devolverListaProductos(sucursalElegida);
        String nombresProductosParaMostrar = construirCadenaDeOpciones(listaProductos);
        mostrarTexto(nombresProductosParaMostrar); //muestra las sucursales de las pizzerias
        int opcionElegida;
        while(estaActivo){
            opcionElegida = leerOpcion();
            if(opcionElegida <= listaProductos.length) {
                manejadorPedidos.elegirProducto(opcionElegida);
                estaActivo = false;
            }else{
                mostrarTexto(eligeValorCorrecto);
            }
        }
    }

    private void elegirSucursales(){
        mostrarTexto(eligeSucursal);
        boolean estaActivo = true;
        String nombresSucursalesParaMostrar = construirCadenaDeOpciones(this.manejadorPedidos.devolverListaSucursales());
        mostrarTexto(nombresSucursalesParaMostrar); //muestra las sucursales de las pizzerias
        int opcionElegida;
        while(estaActivo){
            opcionElegida = leerOpcion();
            if(opcionElegida <= this.manejadorPedidos.devolverListaSucursales().length) {
                manejadorPedidos.elegirSucursal(opcionElegida);
                estaActivo = false;
            }else{
                mostrarTexto(eligeValorCorrecto);
            }
        }
    }
    private int leerOpcion(){
        int valor = Integer.parseInt(sc.nextLine());
        return valor;
    }
    private void mostrarTexto(String texto){
        System.out.println(texto);
    }
    private void mandarPedido(){
        manejadorPedidos.realizarPedido();
    }
}