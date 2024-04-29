package MetodoFabricaBase;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaProductoA();
        Producto producto = fabrica.metodoFabrica();
        producto.operacion();        
    }

}
