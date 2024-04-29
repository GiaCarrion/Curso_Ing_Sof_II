package MetodoFabricaAbsBase;

public class FabricaTipo1 extends Fabrica {
    public ProductoA metodoFabricaA(){
        return new ProductoA1();
    };

    public ProductoB metodoFabricaB(){
        return new ProductoB1();
    };
}
