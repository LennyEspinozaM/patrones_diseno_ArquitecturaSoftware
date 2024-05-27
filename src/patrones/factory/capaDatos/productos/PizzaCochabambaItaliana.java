package patrones.factory.capaDatos.productos;

public class PizzaCochabambaItaliana extends PizzaProducto {
    public PizzaCochabambaItaliana() {
        super();
        nombre = "Pizza Italiana Cochabamba";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiana con carne";
        ingredientes.add(" - Queso mozzarella");
        ingredientes.add(" - Aceitunas");
        ingredientes.add(" - Jamon");
        ingredientes.add(" - Choricillo");
        ingredientes.add(" - Champiniones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 minutos a 120C");

    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes.");
    }
}
