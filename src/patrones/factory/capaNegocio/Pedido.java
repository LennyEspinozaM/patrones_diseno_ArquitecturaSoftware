package patrones.factory.capaNegocio;

public class Pedido {

    private String ciudad;
    private String tipoPizza;
//    private int cantidad;


    public Pedido(String ciudad, String tipoPizza) {
        this.ciudad = ciudad;
        this.tipoPizza = tipoPizza;
    }
}
