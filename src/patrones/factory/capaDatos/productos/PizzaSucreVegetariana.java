package patrones.factory.capaDatos.productos;

public class PizzaSucreVegetariana extends PizzaProducto {
    public PizzaSucreVegetariana() {
        super();
        nombre = "Pizza Vegetariana Sucre";
        masa = "Masa delgada light";
        salsa = "Salsa BBQ Light";
        ingredientes.add(" - Queso Mozzarella");
        ingredientes.add(" - Cebolla");
        ingredientes.add(" - Aceitunas");
        ingredientes.add(" - Espinacas");
        ingredientes.add(" - Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 minutos a 180C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares.");
    }
}
