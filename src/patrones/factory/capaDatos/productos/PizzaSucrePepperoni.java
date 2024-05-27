package patrones.factory.capaDatos.productos;

public class PizzaSucrePepperoni extends PizzaProducto {
    public PizzaSucrePepperoni() {
        super();
        nombre = "Pizza Pepperoni Sucre";
        masa = "Masa a la piedra gruesa";
        salsa = "Salsa de tomate";
        ingredientes.add(" - Pepperoni");
        ingredientes.add(" - Extra qqueso mozzarella");
        ingredientes.add(" - Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 50 minutos a 55C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequenios rectangulos.");
    }
}
