package patrones.factory.capaDatos.sucursal;

import patrones.factory.capaDatos.productos.PizzaProducto;
import patrones.factory.capaDatos.productos.PizzaSucrePepperoni;
import patrones.factory.capaDatos.productos.PizzaSucreQueso;
import patrones.factory.capaDatos.productos.PizzaSucreVegetariana;

import java.util.ArrayList;

public class PizzeriaSucreFactory extends PizzeriaZonaAbstractFactory{

    public PizzeriaSucreFactory(){
        super();
        tiposPizza = new String[]{"vegetariana", "pepperoni", "queso"};
        pedidos = new ArrayList();
    }
    @Override
    PizzaProducto crearPizza(String tipo){
        PizzaProducto producto = null;

        switch (tipo){
            case "vegetariana":
                producto = new PizzaSucreVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaSucrePepperoni();
                break;
            case "queso":
                producto = new PizzaSucreQueso();
                break;
        }

        return producto;
    }
    public String[] obtenerTiposPizza(){
        return tiposPizza;
    }
}
