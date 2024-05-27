package patrones.factory;

import patrones.factory.capaNegocio.Empresa;
import patrones.factory.capaNegocio.ManejadorPedidos;
import patrones.factory.capaPresentacion.TerminalUI;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        ManejadorPedidos manejadorPedidos = new ManejadorPedidos(emp);
        new TerminalUI(manejadorPedidos).run();
    }
}










//import patrones.factory.capaDatos.productos.PizzaProducto;
//import patrones.factory.capaDatos.sucursal.PizzeriaCochabambaFactory;
//import patrones.factory.capaDatos.sucursal.PizzeriaSucreFactory;
//import patrones.factory.capaDatos.sucursal.PizzeriaZonaAbstractFactory;

//PizzeriaZonaAbstractFactory cbba = new PizzeriaCochabambaFactory();
//PizzeriaZonaAbstractFactory sucre = new PizzeriaSucreFactory();

//PizzaProducto pizza = sucre.ordenarPizza("queso");
//        System.out.println("Anna ordena la pizza: " + pizza.getNombre());
//        System.out.println("\n");
//
//pizza = cbba.ordenarPizza("pepperoni");
//        System.out.println("Alejandro ordena una: " + pizza.getNombre());
//        System.out.println("\n");
//
//pizza = sucre.ordenarPizza("vegetariana");
//        System.out.println("James ordena una: " + pizza.getNombre());
//        System.out.println("\n");
//
//pizza = cbba.ordenarPizza("vegetariana");
//        System.out.println("Luis ordena la pizza: " + pizza.getNombre());
//        System.out.println("\n");
//
//pizza = sucre.ordenarPizza("pepperoni");
//        System.out.println("Marcos ordena la pizza: " + pizza.getNombre());
//        System.out.println("\n");
//
//        System.out.println("pizza = " + pizza);
