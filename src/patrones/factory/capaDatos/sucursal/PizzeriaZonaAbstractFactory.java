package patrones.factory.capaDatos.sucursal;

import patrones.factory.capaNegocio.Pedido;
import patrones.factory.capaDatos.productos.PizzaProducto;

import java.util.List;

abstract public class PizzeriaZonaAbstractFactory {

    protected List<Pedido> pedidos;
    protected String[] tiposPizza;
    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("------FABRICANDO LA PIZZA: " + pizza.getNombre() + "------");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    public void agregarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public String[] obtenerTiposPizza(){
        return this.tiposPizza;
    }
    abstract PizzaProducto crearPizza(String tipo);
}
