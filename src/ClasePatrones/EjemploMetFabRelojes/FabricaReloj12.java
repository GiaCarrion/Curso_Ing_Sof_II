package EjemploMetFabRelojes;

/**
 *
 * @author alumno
 */
public class FabricaReloj12 extends FabricaReloj{

    @Override
    public Reloj MetodoReloj() {
        return new Reloj12();
    }
    
}
