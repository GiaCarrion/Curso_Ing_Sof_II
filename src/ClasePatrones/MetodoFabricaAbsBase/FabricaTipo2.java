package MetodoFabricaAbsBase;

public class FabricaTipo2 extends Fabrica{
    public ProductoA metodoFabricaA(){
        return new ProductoA2();
    };
    public ProductoB metodoFabricaB(){
        return new ProductoB2();
    };
}
