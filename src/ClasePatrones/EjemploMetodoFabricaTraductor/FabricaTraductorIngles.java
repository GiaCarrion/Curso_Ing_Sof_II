
package EjemploMetodoFabricaTraductor;

public class FabricaTraductorIngles extends TraductorFactory {

    @Override
    public Traductor MetodoFabrica() {
        return new TraductorIngles();
    }
}
