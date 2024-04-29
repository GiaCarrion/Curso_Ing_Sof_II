package MetodoFabricaBase;

public class FabricaProductoA extends Fabrica {
    public Producto metodoFabrica(){
        return new ProductoA();
    };
}
