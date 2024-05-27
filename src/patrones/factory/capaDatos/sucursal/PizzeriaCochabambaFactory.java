package patrones.factory.capaDatos.sucursal;

import patrones.factory.capaDatos.productos.PizzaCochabambaPepperoni;
import patrones.factory.capaDatos.productos.PizzaCochabambaVegetariana;
import patrones.factory.capaDatos.productos.PizzaCochabambaItaliana;
import patrones.factory.capaDatos.productos.PizzaProducto;

import java.util.ArrayList;

public class PizzeriaCochabambaFactory extends PizzeriaZonaAbstractFactory{

    public PizzeriaCochabambaFactory(){
        super();
        tiposPizza = new String[]{"vegetariana", "pepperoni", "italiana"};
        pedidos = new ArrayList();
    }
    @Override
    PizzaProducto crearPizza(String tipo){
        PizzaProducto producto = null;
        switch (tipo){
            case "vegetariana":
                producto = new PizzaCochabambaVegetariana();
                break;
            case "pepperoni":
                producto = new PizzaCochabambaPepperoni();
                break;
            case "italiana":
                producto = new PizzaCochabambaItaliana();
                break;
        }
        return producto;
    }

}
