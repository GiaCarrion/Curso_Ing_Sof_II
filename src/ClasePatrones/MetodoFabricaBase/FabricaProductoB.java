package MetodoFabricaBase;

public class FabricaProductoB extends Fabrica {
    public Producto metodoFabrica(){
        return new ProductoB();
    };
}
