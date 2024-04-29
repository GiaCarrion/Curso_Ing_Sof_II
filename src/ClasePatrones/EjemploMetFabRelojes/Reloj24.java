package EjemploMetFabRelojes;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Reloj24 extends Reloj{

    public Reloj24() {
    super();
    }

    @Override
    public String DamelaHora() {
        Date d = new Date();
        int hora = d.getHours();
        int minutos = d.getMinutes();
        int segundos = d.getSeconds();
        String tr;
        tr = "Son las " + hora + ":" + minutos + ":" + segundos + " ";
        return tr;
        
    }
    
}
