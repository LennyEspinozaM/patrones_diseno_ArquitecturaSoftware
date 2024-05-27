package patrones.factory.capaDatos.productos;

public class PizzaSucreQueso extends PizzaProducto {
    public PizzaSucreQueso() {
        super();
        nombre = "Pizza Queso Sucre";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add(" - Extra queso mozzarella");
        ingredientes.add(" - Cebolla");
        ingredientes.add(" - Queso azul");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 minutos a 100C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequenios triangulos.");
    }
}
