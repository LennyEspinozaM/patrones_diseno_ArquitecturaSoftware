package patrones.factory.capaDatos.productos;

public class PizzaCochabambaVegetariana extends PizzaProducto {
    public PizzaCochabambaVegetariana() {

        super();
        nombre = "Pizza Vegetariana Cochabamba";
        masa   = "Masa integral vegana";
        salsa  = "Salsa de tomate";

        ingredientes.add(" - Queso vegano");
        ingredientes.add(" - Tomate");
        ingredientes.add(" - Aceitunas");
        ingredientes.add(" - Espinacas");
        ingredientes.add(" - Berenjenas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 minutos a 150C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
