package patrones.factory.capaNegocio;

import patrones.factory.capaDatos.sucursal.PizzeriaCochabambaFactory;
import patrones.factory.capaDatos.sucursal.PizzeriaSucreFactory;

import java.util.Set;

public class ManejadorPedidos {

    private Empresa empresa;
    private String sucursales[];
    private String productosDisponibles[];

    private String sucursalElegida;
    private String productoElegido;

    public String getSucursalElegida() {
        return sucursalElegida;
    }

    public String getProductoElegido() {
        return productoElegido;
    }

    public ManejadorPedidos(Empresa empresa){
        this.empresa = empresa;
        this.empresa.agregarSucursal("Cochabamba", new PizzeriaCochabambaFactory());
        this.empresa.agregarSucursal("Sucre", new PizzeriaSucreFactory());

        this.sucursales = obtenerSucursales(this.empresa.obtenerNombreDeSucursales());
    }
    private String[] obtenerSucursales(Set<String> nombresSucursales){
        String sucursalesArray[] = new String [nombresSucursales.size()];
        int i = 0;
        for(String s : nombresSucursales){
            sucursalesArray[i] = s;
            i++;
        }
        return sucursalesArray;
    }

    private void obtenesProductosPorSucursal(){
        this.productosDisponibles = this.empresa.obtenerSucursal(sucursalElegida).obtenerTiposPizza();
    }

    public void realizarPedido(){
        this.empresa.agregarPedido(this.sucursalElegida, new Pedido(sucursalElegida, productoElegido));
    }

    public void elegirSucursal(int option) {
        this.sucursalElegida = sucursales[option-1];
    }

    public String obtenerSucursalElegida(){
        return this.sucursalElegida;
    }

    public String[] devolverListaProductos(String sucursalElegida){
        return this.empresa.obtenerSucursal(sucursalElegida).obtenerTiposPizza();
    }

    public String[] devolverListaSucursales(){
        return sucursales;
    }

    public void elegirProducto(int option) {
        obtenesProductosPorSucursal();
        this.productoElegido = this.productosDisponibles[option-1];
    }
    /*public String[] devolverListaSucursales(){
        return sucursales;
    }*/
}
