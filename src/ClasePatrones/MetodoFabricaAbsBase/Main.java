package MetodoFabricaAbsBase;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica1 = new FabricaTipo1();
        Fabrica fabrica2 = new FabricaTipo2();

        ProductoA productoA1 = fabrica1.metodoFabricaA();
        ProductoB productoB1 = fabrica1.metodoFabricaB();

        ProductoA productoA2 = fabrica2.metodoFabricaA();
        ProductoB productoB2 = fabrica2.metodoFabricaB();

        productoA1.operacion();
        productoB1.operacion();

        productoA2.operacion();
        productoB2.operacion();
    }
}
