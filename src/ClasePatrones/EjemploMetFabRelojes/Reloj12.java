package EjemploMetFabRelojes;

import java.util.Date;



/**
 *
 * @author alumno
 */
public class Reloj12  extends Reloj{

    public Reloj12() {
    super();
    }

    @Override
    public String DamelaHora() {
        Date d = new Date();
        int hora = d.getHours();
        int minutos = d.getMinutes();
        int segundos = d.getSeconds();
        String tr;
        if(hora <= 12){
            tr = "Son las " + hora + ":" + minutos + ":" + segundos + "AM";
        }
        else{
            tr = "Son las " + (hora-12) + ":" + minutos + ":" + segundos + " PM";
        }
           return tr;    
    }
    
}
