
package EjemploMetodoFabricaTraductor;

public class FabricaTraductorEspañol  extends TraductorFactory {

    @Override
    public Traductor MetodoFabrica() {
        return new TraductorEspañol();
    }
    
}
