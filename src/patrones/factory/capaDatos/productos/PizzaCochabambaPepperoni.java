package patrones.factory.capaDatos.productos;

public class PizzaCochabambaPepperoni extends PizzaProducto {
    public PizzaCochabambaPepperoni() {
        super();
        nombre = "Pizza Pepperoni Cochabamba";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add(" - Queso mozzarella");
        ingredientes.add(" - Extra pepperoni");
        ingredientes.add(" - Aceitunas");

    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 minutos a 90C");
    }
    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos.");
    }
}
