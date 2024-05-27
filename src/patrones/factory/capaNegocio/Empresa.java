package patrones.factory.capaNegocio;

import patrones.factory.capaDatos.sucursal.PizzeriaZonaAbstractFactory;
import java.util.HashMap;
import java.util.Set;

public class Empresa {
    private HashMap<String, PizzeriaZonaAbstractFactory> sucursalesCiudad;
    public Empresa(){
        this.sucursalesCiudad = new HashMap<>();
    }
    public void agregarSucursal(String nombre, PizzeriaZonaAbstractFactory sucursal){
        this.sucursalesCiudad.put(nombre, sucursal);
    }
    public Set obtenerNombreDeSucursales() {
        return this.sucursalesCiudad.keySet();
    }
    public PizzeriaZonaAbstractFactory obtenerSucursal(String nombreCiudad){
        return this.sucursalesCiudad.get(nombreCiudad);
    }
    public void agregarPedido(String nombreSucursal, Pedido pedido){
        obtenerSucursal(nombreSucursal).agregarPedido(pedido);
    }
}