package EjemploMetFabRelojes;

/**
 *
 * @author alumno
 */
public abstract class FabricaReloj {

    public FabricaReloj() {
    }
    public abstract Reloj MetodoReloj();
    
    public static Reloj CreateReloj(int num){
        Reloj r=null;
        if(num==0){
            r= new FabricaReloj12().MetodoReloj();
        }
        else{
            r= new FabricaReloj24().MetodoReloj();
        }
            
        return r;
    }

    
}
