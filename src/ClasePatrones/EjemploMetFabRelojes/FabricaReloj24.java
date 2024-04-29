package EjemploMetFabRelojes;

/**
 *
 * @author alumno
 */
public class FabricaReloj24 extends FabricaReloj{

    @Override
    public Reloj MetodoReloj() {
        return new Reloj24();
    }
    
}
